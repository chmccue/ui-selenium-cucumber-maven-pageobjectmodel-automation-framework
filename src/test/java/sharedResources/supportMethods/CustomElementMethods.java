package sharedResources.supportMethods;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

import static pageObject.globals.globalObjects.closeCookiesPopup;
import static sharedResources.supportMethods.CustomHelperMethods.*;
import static sharedResources.webDriver.Driver.driver;
import static sharedResources.webDriver.Driver.waitTime;

public class CustomElementMethods {

    public static void globalClosePopUp(String locator) {
        boolean checkForElement = driver.findElement(By.cssSelector(locator)).isDisplayed();
        logData("Pop up closed: " + checkForElement);

        if (checkForElement == true) {
            findAndClickElement(locator, 2, true, false); }
    }

    public static void findAndClickElement(String locator, int waitTime,
                                           boolean elementGoneAfterClick,
                                           boolean scrollIntoView) throws NoSuchElementException {

        verifyElementOnPage(locator, waitTime);

        if (scrollIntoView == true) jsScrollElementIntoView(locator);

        logData("Clicking element " + locator + "." + System.lineSeparator());
        driver.findElement(By.cssSelector(locator)).click();

        if (elementGoneAfterClick == true) {
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
        }
    }

    public static void findAndClickElement(String locator) {
        // Simplest method for findAndClickElement, using only the locator.
        findAndClickElement(locator, 10, false, false);
    }

    public static void findAndClickElement(String locator, int waitTime) {
        // findAndClickElement, with ability to update locator and waitTime args.
        findAndClickElement(locator, waitTime, false, false);
    }

    public static void elementShouldNotBePresent(String locator) {
        elementShouldNotBePresent(locator, 10);
    }
    public static void elementShouldNotBePresent(String locator, int waitTime) {
        try {
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
            logData("Element \"" + locator + "\" not visible within " + waitTime + " seconds.");
        }
        catch (RuntimeException e) {
            if (e.toString().contains("NoSuchElementException")) {
                throw new org.openqa.selenium.NoSuchElementException("Element \"" + locator + "\" visible within " +
                        waitTime + " seconds, but was not expected to be.");
            }
            else {
                throw new RuntimeException(e.toString());
            }
        }
    }


    public static void verifyElementOnPage(String locator, int waitTime) {
        try {
            //driver.findElement(By.cssSelector(locator));
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
            logData("Element \"" + locator + "\" visible within " + waitTime + " seconds.");
        } catch (RuntimeException e) {
            if (e.toString().contains("NoSuchElementException")) {
                throw new org.openqa.selenium.NoSuchElementException("Element \"" + locator + "\" not visible within " + waitTime + " seconds.");
            }
            else {
                throw new RuntimeException(e.toString());
            }
        }
    }

    public static void verifyElementOnPage(String locator) {
        verifyElementOnPage(locator, waitTime); }


    public static void selectRandomElement(String locator) {
        selectRandomElement(locator, ""); }
    public static void selectRandomElement(String locator_start, String locator_end) {
        closeCookiesPopup();

        int getCount = getVarCount(locator_start);
        int random = (int )(Math.random() * getCount + 1);
        String randomString = Integer.toString(random);

        logData("Random element generated: " + locator_start + ":nth-of-type(" + randomString + ") " + locator_end);
        findAndClickElement(locator_start + ":nth-of-type(" + randomString + ") " + locator_end);
    }


    public static void jsScrollElementIntoView(String locator) {
        String script = "window.jQuery(\"" + locator + "\")[0].scrollIntoView(true);";
        jQueryLoad();
        logData(script);
        js.executeScript(script);
    }

    public static void findScrollToAndClickElement(String locator) {
        findAndClickElement(locator, 10, false, true);
    }

    public static void clearCookies() {
        driver.manage().deleteAllCookies();
    }

}


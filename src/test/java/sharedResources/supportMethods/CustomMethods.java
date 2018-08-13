package sharedResources.supportMethods;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

import static sharedResources.supportMethods.DriverMethods.driver;
import static sharedResources.supportMethods.DriverMethods.waitTime;

public class CustomMethods {

    public static String globalCloseCookiesPopUp_css = ".hide-on-button [type='submit']";

    public static JavascriptExecutor js = (JavascriptExecutor) driver;

    public static void globalClosePopUp(String locator) {
        boolean checkForElement = driver.findElement(By.cssSelector(locator)).isDisplayed();
        System.out.println("Pop up closed: " + checkForElement);

        if (checkForElement == true) {
            findAndClickElement(locator, 2, true, false);
            //driver.findElement(By.cssSelector(locator)).click();
        }
        //Thread.sleep(1000);
    }

    public static void findAndClickElement(String locator, int waitTime,
                                           boolean elementGoneAfterClick,
                                           boolean scrollIntoView) throws NoSuchElementException {

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Attempting to click on element " + locator + " at " + currentUrl + System.lineSeparator());
        verifyElementOnPage(locator, waitTime);

        if (scrollIntoView == true) jsScrollElementIntoView(locator);
        driver.findElement(By.cssSelector(locator)).click();

        if (elementGoneAfterClick == true) {
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
        }
        //new WebDriverWait(driver, waitTime).until(ExpectedConditions.not(
        //        ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)))); }

        System.out.println("element successfully clicked");
    }

    public static WebElement findAndClickElement(String locator) {
        // Simplest method for findAndClickElement, using only the locator.
        findAndClickElement(locator, 10, false, false);
        return null;
    }

    public static void findAndClickElement(String locator, int waitTime) {
        // findAndClickElement, with ability to update locator and waitTime args.
        findAndClickElement(locator, waitTime, false, false);
    }

    public static void elementShouldNotBePresent(String locator) {
        elementShouldNotBePresent(locator, 10);
    }
    public static void elementShouldNotBePresent(String locator, int waitTime) {
        String currentUrl = driver.getCurrentUrl();
        try {
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
            System.out.println("\"" + locator + "\" correctly not found on page.");
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println(locator + " incorrectly found on page " + currentUrl);
            throw new org.openqa.selenium.NoSuchElementException(locator + " incorrectly found on page " + currentUrl);
        }
    }

    public static void verifyElementOnPage(String locator, int waitTime) {
        String currentUrl = driver.getCurrentUrl();
        try {
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
            System.out.println("\"" + locator + "\" found on page.");
            }
        catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println(locator + " not found on page " + currentUrl);
            throw new org.openqa.selenium.NoSuchElementException(locator + " not found on page " + currentUrl);
        }
    }
    public static void verifyElementOnPage(String locator) {
        verifyElementOnPage(locator, waitTime); }

    public static int getVarCount(String locator) {
        int getCount;
        try {
            //verifyElementOnPage(locator, 2);
            getCount = driver.findElements(By.cssSelector(locator)).size();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            getCount = 0; }
        System.out.println("number of elements found: " + getCount);
        return getCount;
    }

    public static void selectRandomElement(String locator) {
        selectRandomElement(locator, ""); }
    public static void selectRandomElement(String locator_start, String locator_end) {
        closeCookiesPopup();

        int getCount = getVarCount(locator_start);
        int random = (int )(Math.random() * getCount + 1);
        String randomString = Integer.toString(random);

        System.out.println(locator_start + ":nth-of-type(" + randomString + ") " + locator_end);
        //jsScrollElementIntoView(locator_start);
        driver.findElement(By.cssSelector(locator_start + ":nth-of-type(" + randomString + ") " + locator_end)).click();
        System.out.println("Clicking random element: " + locator_start
                + ":nth-of-type(" + randomString + ") " + locator_end + " successful.");
    }


    public static void jQueryLoad() {
        System.out.println("Dynamically loading jQuery");
        Object checkForJquery = js.executeScript("window.jQuery");
        System.out.println(checkForJquery);
        if (checkForJquery == null || checkForJquery == "undefined") {
            js.executeAsyncScript("(function(jqueryUrl, callback) {if (typeof jqueryUrl != 'string') {jqueryUrl = 'https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js';}if (typeof jQuery == 'undefined') {var script = document.createElement('script'); var head = document.getElementsByTagName('head')[0]; var done = false; script.onload = script.onreadystatechange = (function() { if (!done && (!this.readyState || this.readyState == 'loaded' || this.readyState == 'complete')) { done = true; script.onload = script.onreadystatechange = null; head.removeChild(script); callback();}}); script.src = jqueryUrl; head.appendChild(script);} else {callback();}})(arguments[0], arguments[arguments.length - 1]);");
        }
    }

    public static void jsScrollElementIntoView(String locator) {
        String script = "window.jQuery(\"" + locator + "\")[0].scrollIntoView(true);";
        jQueryLoad();
        System.out.println(script);
        js.executeScript(script);
    }

    public static void findScrollToAndClickElement(String locator) {
        findAndClickElement(locator, 10, false, true);
    }

    public static void clearAndInputText(String fieldLocator, String textToType) {
        verifyElementOnPage(fieldLocator);
        driver.findElement(By.cssSelector(fieldLocator)).clear();
        driver.findElement(By.cssSelector(fieldLocator)).sendKeys(textToType);
    }

    public static void closeCookiesPopup() {
        globalClosePopUp(globalCloseCookiesPopUp_css);
    }

    public static void clearCookies() {
        driver.manage().deleteAllCookies();
    }

}


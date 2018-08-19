package sharedResources.supportMethods;

import com.vimalselvam.cucumber.listener.Reporter;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

import static sharedResources.webDriver.Driver.driver;
import static sharedResources.webDriver.Driver.waitTime;

public class CustomMethods {

    /*This variable is used for checking if current Url
      needs to be logged into reporting metrics.*/
    public static String storedUrl = "";

    public static String updateStoredUrl(String Url) {
        /*
        Updates Stored Url variable in logData method, to check if Url
        needs to be logged into reporting metrics.
         */
        return Url;
    }

    public static void logData(String message) {
        logData(message, true, true, true);
    }

    public static void logDataWithoutUrl(String message) {
        logData(message, true, true, false);
    }

    public static void logData(String message, boolean console, boolean extent, boolean logUrl) {
        /*
        Combines multiple logging into a single method for cleaner code.
            arg: String message: the message desired to log.
            arg: boolean console: true will print to console. false will not print to console.
            arg: boolean extent: true will print to Extent report. false will not print to Extent report.
            arg: boolean showUrl: true will print to current page Url. false will not print to current page Url.
        */

        String getUrl = "";
        if (logUrl == true) {
            getUrl = driver.getCurrentUrl(); }

        if (extent == true) {
            if (logUrl == true && !storedUrl.equals(getUrl)) {
                Reporter.addStepLog("==================\nOn page " + getUrl + ":\n==================\n"); }
            Reporter.addStepLog(" - " + message); }

        if (console == true) {
            if (logUrl == true && !storedUrl.equals(getUrl)) {
                System.out.println("==================\nOn page " + getUrl + ":\n==================\n"); }
            System.out.println(message); }

        // Updates storedUrl variable with dynamically generated current Url for future comparisons.
        storedUrl = updateStoredUrl(getUrl);

    }

    public static String globalCloseCookiesPopUp_css = ".hide-on-button [type='submit']";

    public static JavascriptExecutor js = (JavascriptExecutor) driver;

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
        try {
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
            //logData("\"" + locator + "\" correctly not found on page.");
            logData("Element \"" + locator + "\" not visible within " + waitTime + " seconds.");
        }
        catch (RuntimeException e) {
            if (e.toString().contains("NoSuchElementException")) {
                throw new org.openqa.selenium.NoSuchElementException("Element \"" + locator + "\" visible within " +
                        waitTime + " seconds, but was not expected to be.");
            }
            else {
                //logData(e.toString());
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

    public static int getVarCount(String locator) {
        int getCount;
        try {
            //verifyElementOnPage(locator, 2);
            getCount = driver.findElements(By.cssSelector(locator)).size();
        }
        //catch (org.openqa.selenium.NoSuchElementException e) {
        //    getCount = 0; }

        catch (Exception e) {
            if (e.toString().contains("NoSuchElementException")) {
                getCount = 0;
            }
            else {
                //throw new Exception(e.toString());
                throw new RuntimeException(e.toString());
            }
        }

        logData("number of elements found: " + getCount);
        return getCount;
    }

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


    public static void jQueryLoad() {
        logData("Checking if jQuery needs to be dynamically loaded on page");
        Object checkForJquery = js.executeScript("window.jQuery");

        if (checkForJquery == null || checkForJquery == "undefined") {
            js.executeAsyncScript("(function(jqueryUrl, callback) {if (typeof jqueryUrl != 'string') {jqueryUrl = 'https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js';}if (typeof jQuery == 'undefined') {var script = document.createElement('script'); var head = document.getElementsByTagName('head')[0]; var done = false; script.onload = script.onreadystatechange = (function() { if (!done && (!this.readyState || this.readyState == 'loaded' || this.readyState == 'complete')) { done = true; script.onload = script.onreadystatechange = null; head.removeChild(script); callback();}}); script.src = jqueryUrl; head.appendChild(script);} else {callback();}})(arguments[0], arguments[arguments.length - 1]);");
        }
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

    public static void inputText(String fieldLocator, String searchTerm) {
        driver.findElement(By.cssSelector(fieldLocator)).sendKeys(searchTerm);
        logData("Text \"" + searchTerm + "\" entered into field \"" + fieldLocator + "\".");
    }

    public static void clearAndInputText(String fieldLocator, String searchTerm) {
        verifyElementOnPage(fieldLocator);
        driver.findElement(By.cssSelector(fieldLocator)).clear();
        inputText(fieldLocator, searchTerm);
    }

    public static void closeCookiesPopup() {
        globalClosePopUp(globalCloseCookiesPopUp_css);
    }

    public static void clearCookies() {
        driver.manage().deleteAllCookies();
    }

}


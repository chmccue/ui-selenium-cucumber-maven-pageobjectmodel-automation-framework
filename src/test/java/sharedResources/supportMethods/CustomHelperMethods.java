package sharedResources.supportMethods;

import com.vimalselvam.cucumber.listener.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static sharedResources.webDriver.Driver.driver;

public class CustomHelperMethods {


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


    public static JavascriptExecutor js = (JavascriptExecutor) driver;

    public static void jQueryLoad() {
        logData("Checking if jQuery needs to be dynamically loaded on page");
        Object checkForJquery = js.executeScript("window.jQuery");

        if (checkForJquery == null || checkForJquery == "undefined") {
            js.executeAsyncScript("(function(jqueryUrl, callback) {if (typeof jqueryUrl != 'string') {jqueryUrl = 'https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js';}if (typeof jQuery == 'undefined') {var script = document.createElement('script'); var head = document.getElementsByTagName('head')[0]; var done = false; script.onload = script.onreadystatechange = (function() { if (!done && (!this.readyState || this.readyState == 'loaded' || this.readyState == 'complete')) { done = true; script.onload = script.onreadystatechange = null; head.removeChild(script); callback();}}); script.src = jqueryUrl; head.appendChild(script);} else {callback();}})(arguments[0], arguments[arguments.length - 1]);");
        }
    }


    public static int getVarCount(String locator) {
        int getCount;
        try {
            //verifyElementOnPage(locator, 2);
            getCount = driver.findElements(By.cssSelector(locator)).size();
        }
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

}

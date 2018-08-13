package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sharedResources.supportMethods.CustomMethods;
import sharedResources.webDriver.Driver;

import static sharedResources.supportMethods.CustomMethods.*;
import static sharedResources.supportMethods.DriverMethods.driver;
import static sharedResources.supportMethods.DriverMethods.wait;

public class SearchResultsPage {

    public static String searchResultsPage_css = ".search";
    public static String searchResultsNoResults_css = ".search-no-results";
    public static String searchResultsNoResultsContent_css = ".search-no-results .no-results";

    public static String searchResultsPageResult_cssStart = "article"; // this should be used with End var, so it appears like this: "article:nth-of-type(1) .entry-title";
    public static String searchResultsPageResult_cssEnd = ".entry-title";
    public static String searchResultsPageResult_cssFull =  searchResultsPageResult_cssStart + " " + searchResultsPageResult_cssEnd;

    public static String searchResultsPageResult_xpath = "//article//*[@class='entry-title']";

    public static WebElement searchResultsPage() { return driver.findElement(By.cssSelector(searchResultsPage_css));}
    public static WebElement searchResultsPage_NoResults() { return driver.findElement(By.cssSelector(searchResultsNoResults_css)); }
    public static WebElement searchResultsPage_NoResultsContent() { return driver.findElement(By.cssSelector(searchResultsNoResultsContent_css)); }

    public static WebElement searchResultsPage_Result() {
        verifyElementOnPage(searchResultsPageResult_cssFull);
        return driver.findElement(By.cssSelector(searchResultsPageResult_cssFull)); }
    public static void searchResultsPage_ResultRandom() {
        selectRandomElement(searchResultsPageResult_cssStart, searchResultsPageResult_cssEnd);
    }
    public static int searchResultsPage_ResultCount() {
        int count = getVarCount(searchResultsPageResult_cssFull);
        //System.out.println(count);
        return count; }

    public static void searchResultsPage_assertions(String searchTerm) {
        wait.until(ExpectedConditions.titleContains("Search Results for"));
        wait.until(ExpectedConditions.titleContains(searchTerm));
        wait.until(ExpectedConditions.urlContains(searchTerm));
    }

}


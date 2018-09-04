package pageObject;

import org.openqa.selenium.support.ui.ExpectedConditions;

import static sharedResources.supportMethods.CustomElementMethods.*;
import static sharedResources.supportMethods.CustomHelperMethods.getVarCount;
import static sharedResources.webDriver.Driver.wait;

public class SearchResultsPage {

    //////////////////////////////////////////////////////
    // ELEMENT LOCATOR VARIABLES
    //////////////////////////////////////////////////////

    public static String searchResultsPage_css = ".search";
    public static String searchResultsNoResults_css = ".search-no-results";
    public static String searchResultsNoResultsContent_css = ".search-no-results .no-results";

    public static String searchResultsPageResult_cssStart = "article"; // this should be used with End var, so it appears like this: "article:nth-of-type(1) .entry-title";
    public static String searchResultsPageResult_cssEnd = ".entry-title";
    public static String searchResultsPageResult_cssFull =  searchResultsPageResult_cssStart + " " + searchResultsPageResult_cssEnd;

    public static String searchResultsPageResult_xpath = "//article//*[@class='entry-title']";


    //////////////////////////////////////////////////////
    // PAGE OBJECT METHODS
    //////////////////////////////////////////////////////
    public static void searchResultsPage() { verifyElementOnPage(searchResultsPage_css); }
    public static void searchResultsPage_NoResults() { verifyElementOnPage(searchResultsNoResults_css); }
    public static void searchResultsPage_NoResultsContent() { verifyElementOnPage(searchResultsNoResultsContent_css); }

    public static void searchResultsPage_Result() {
        verifyElementOnPage(searchResultsPageResult_cssFull); }
        public static void searchResultsPage_ResultRandom () {
            selectRandomElement(searchResultsPageResult_cssStart, searchResultsPageResult_cssEnd);
        }
        public static int searchResultsPage_ResultCount () {
            int count = getVarCount(searchResultsPageResult_cssFull);
            return count;
        }

        public static void searchResultsPage_assertions (String searchTerm){
            wait.until(ExpectedConditions.titleContains("Search Results for"));
            wait.until(ExpectedConditions.titleContains(searchTerm));
            wait.until(ExpectedConditions.urlContains(searchTerm));
        }

    }


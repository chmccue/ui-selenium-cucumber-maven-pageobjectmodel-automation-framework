package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObject.SearchArea;
import pageObject.SearchResultsPage;


import static sharedResources.supportMethods.CustomHelperMethods.logData;

public class Search_Steps {

    @Given("^I want to find many articles$")
    public void i_want_to_find_many_articles() {
        logData("Ready to search and find many articles.");
    }

    @When("^(?:I|I have) search(?:ed)? for \"([^\"]*)\"$")
    public void i_search_for(String searchTerm) {
        SearchArea.enterSearchTermAndPressEnter(searchTerm);
    }

    @Then("^I should see multiple search results for \"([^\"]*)\"$")
    public void i_should_see_search_results_for(String searchTerm) {
        if (SearchResultsPage.searchResultsPage_ResultCount() > 1) {
            logData("More than 1 result found");
        } else {
            throw new AssertionError("expected more than 1 result; found 0 or 1");
        }
        SearchResultsPage.searchResultsPage();
        SearchResultsPage.searchResultsPage_assertions(searchTerm);
    }

    @Given("^I want to find only (\\d+) article$")
    public void i_want_to_find_only_article(int arg1) {
        logData("Ready to search and find only one article.");
    }

    @Then("^I should see only a single search result for \"([^\"]*)\"$")
    public void i_should_see_only_a_single_search_result_for(String searchTerm) {
        SearchResultsPage.searchResultsPage();
        SearchResultsPage.searchResultsPage_assertions(searchTerm);

        int resultsCount = SearchResultsPage.searchResultsPage_ResultCount();
        if (resultsCount == 1) {
            logData("only 1 result found");
        } else {
            throw new AssertionError("expected 1 result; found 0 or more than 1");
        }
    }

    @Given("^I want to find no articles$")
    public void i_want_to_find_no_articles() {
        logData("Ready to search and find no articles.");
    }

    @Then("^I should see no articles found$")
    public void i_should_see_no_articles_found() {

        if (SearchResultsPage.searchResultsPage_ResultCount() == 0) {
            logData("0 results found");
        } else {
            throw new AssertionError("expected 0 results; found more than 0");
        }
        SearchResultsPage.searchResultsPage_NoResults();
        SearchResultsPage.searchResultsPage_NoResultsContent();
    }


    @Given("^I want to find \"([^\"]*)\" articles$")
    public void i_want_to_find_articles(String arg1) {
        logData("Ready to search and find " + arg1 + " article(s).");
    }

    @Then("^I should be on \"([^\"]*)\" search results page with \"([^\"]*)\" results$")
    public void i_should_be_on_search_results_page_with_results(String searchTerm, String expectedResults) {

        /*
         * Method takes searchTerm and expectedResults, and validates based on those inputs.
         * - searchTerm is the text entered for searching.
         * - expectedResult is the number or arithmetic of the returned results.
         * - - This takes a String, but converts it to an integer at the start of the method.
         * - - You can input arithmetic expressions, such as >1, >=1, <1, <=1, =, ==, !, !=, or only a integer.
         * - - If only an integer is entered, it is assumed as an equal to validation.
         * After validations above, the method checks if the search results page is expected to have results
         * returned or not.
         */

        int resultCount = SearchResultsPage.searchResultsPage_ResultCount();
        int expectedResultsNumber = Integer.parseInt(expectedResults.replaceAll("[^\\d.]", ""));
        String expectedResultsSymbol = expectedResults.replaceAll("[\\d.]", "");
        if (expectedResultsSymbol.equals("")) {expectedResultsSymbol = "=="; }
        boolean checkNums = false;

        if (expectedResultsSymbol.equals(">")) {
            checkNums = (resultCount > expectedResultsNumber); }
        else if (expectedResultsSymbol.equals(">=")) {
            checkNums = (resultCount >= expectedResultsNumber); }
        else if (expectedResultsSymbol.equals("<")) {
            checkNums = (resultCount < expectedResultsNumber); }
        else if (expectedResultsSymbol.equals("<=")) {
            checkNums = (resultCount <= expectedResultsNumber); }
        else if (expectedResultsSymbol.equals("=") || expectedResultsSymbol.equals("==")) {
            checkNums = (resultCount == expectedResultsNumber); }
        else if (expectedResults.contains("!")) {
            checkNums = (resultCount != expectedResultsNumber); }

        if (checkNums == true) {
            logData(checkNums + ": " + resultCount + " " + expectedResultsSymbol + " " + expectedResultsNumber); }
        else {throw new AssertionError("//////////" + checkNums + ": " + resultCount + " " + expectedResultsSymbol + " " + expectedResultsNumber + "//////////"); }

        if ((expectedResultsNumber == 0 && !expectedResults.contains("[^\\d.]")) || (expectedResultsNumber > 0 && expectedResults.contains("<") && resultCount == 0)) {
            SearchResultsPage.searchResultsPage_NoResults();
            SearchResultsPage.searchResultsPage_NoResultsContent();
        }
         else {
             SearchResultsPage.searchResultsPage();
             SearchResultsPage.searchResultsPage_assertions(searchTerm);
        }

        // *************************************************************
        // *************************************************************
    }
}

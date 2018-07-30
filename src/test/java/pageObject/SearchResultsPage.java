package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sharedResources.webDriver.Driver;

public class SearchResultsPage {

    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static WebElement searchResultsPage() { return driver.findElement(By.cssSelector(".search"));}
    public static WebElement searchResultsPage_NoResults() { return driver.findElement(By.cssSelector(".search-no-results")); }
    public static WebElement searchResultsPage_NoResultsContent() { return driver.findElement(By.cssSelector(".search-no-results .no-results")); }

    public static WebElement searchResultsPage_Result() {
        return driver.findElement(By.cssSelector(".entry-title")); }
    public static int searchResultsPage_ResultCount() {
        return driver.findElements(By.cssSelector(".entry-title")).size(); }
    public static void searchResultsPage_ResultRandom() {
        int getCount = searchResultsPage_ResultCount();
        //To Do: randomize getCount number
        //To Do: take randomized number and use it in element for random selection on page.
    }

    public static void searchResultsPage_assertions(String searchTerm) {
        wait.until(ExpectedConditions.titleContains("Search Results for"));
        System.out.println(wait.until(ExpectedConditions.urlContains(searchTerm)));
    }

}


package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sharedResources.webDriver.Driver;

public class SearchArea {

    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static WebElement searchField() { return driver.findElement(By.cssSelector(".search-field")); }

    public static void enterSearchTermAndPressEnter(String searchTerm) {

        //wait.until(ExpectedConditions.elementToBeClickable(this.searchField));
        //wait.until(searchField());

        searchField().clear();
        searchField().sendKeys(searchTerm);
        searchField().sendKeys(Keys.RETURN);

    }

}


package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sharedResources.webDriver.Driver;

import static sharedResources.supportMethods.DriverMethods.driver;

public class SearchArea {

    public static WebElement searchField() { return driver.findElement(By.cssSelector(".search-field")); }

    public static void enterSearchTermAndPressEnter(String searchTerm) {
        searchField().clear();
        searchField().sendKeys(searchTerm);
        searchField().sendKeys(Keys.RETURN); }

}


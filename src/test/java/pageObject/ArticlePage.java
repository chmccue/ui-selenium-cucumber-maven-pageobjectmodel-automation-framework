package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static sharedResources.supportMethods.DriverMethods.driver;

public class ArticlePage {

    public static String articlePage_css = ".archive";

    public static WebElement articlePageContent() { return driver.findElement(By.cssSelector(articlePage_css)); }

}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static sharedResources.supportMethods.DriverMethods.driver;

public class BlogPage {

    public static String blogPage_css = ".blog";

    public static WebElement blogPageContent() { return driver.findElement(By.cssSelector(blogPage_css));}
}

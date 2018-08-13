package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static sharedResources.supportMethods.DriverMethods.driver;

public class HomePage {

	public static String homePage_css = ".home";

	public static WebElement homePageContent() {return driver.findElement(By.cssSelector(homePage_css)); }

}

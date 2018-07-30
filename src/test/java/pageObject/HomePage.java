package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sharedResources.webDriver.Driver;

public class HomePage {

	static WebDriver driver = Driver.getCurrentDriver();

	public static String homePage_css = ".home";

	public static WebElement homePageContent() {return driver.findElement(By.cssSelector(".home")); }


	public static WebElement searchField() {
		return driver.findElement(By.className("gsfi"));
	}

	public static String searchResultsTitle() {
		return driver.getTitle();
	}
}

package sharedResources.supportMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sharedResources.webDriver.Driver;

public class DriverMethods {

    public static WebDriver driver = Driver.getCurrentDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, 10);
}

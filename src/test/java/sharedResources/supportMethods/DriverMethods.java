package sharedResources.supportMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sharedResources.webDriver.Driver;



public class DriverMethods {

    static int waitTime = 10;

    public static WebDriver driver = Driver.getCurrentDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, waitTime);
}


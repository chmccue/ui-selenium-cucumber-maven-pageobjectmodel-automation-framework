package sharedResources.supportMethods;

import org.openqa.selenium.By;

import static sharedResources.supportMethods.CustomHelperMethods.logData;
import static sharedResources.supportMethods.CustomElementMethods.verifyElementOnPage;
import static sharedResources.webDriver.Driver.driver;

public class CustomTextMethods {


    public static void inputText(String fieldLocator, String searchTerm) {
        inputText(fieldLocator, searchTerm, true);
    }
    public static void inputText(String fieldLocator, String searchTerm, boolean printData) {
        driver.findElement(By.cssSelector(fieldLocator)).sendKeys(searchTerm);
        if (printData == true) {
            logData("Text \"" + searchTerm + "\" entered into field \"" + fieldLocator + "\".");
        }
    }

    public static void clearAndInputText(String fieldLocator, String searchTerm) {
        verifyElementOnPage(fieldLocator);
        driver.findElement(By.cssSelector(fieldLocator)).clear();
        inputText(fieldLocator, searchTerm);
    }
}

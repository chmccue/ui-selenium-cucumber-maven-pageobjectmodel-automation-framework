package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static sharedResources.supportMethods.DriverMethods.driver;


public class AboutPage {

    public static String aboutPage_css = ".current_page_item [href*='/about']";

    public static WebElement aboutPageContent() { return driver.findElement(By.cssSelector(aboutPage_css));}


}

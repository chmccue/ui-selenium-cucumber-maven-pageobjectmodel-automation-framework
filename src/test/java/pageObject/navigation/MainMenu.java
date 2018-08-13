package pageObject.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.AboutPage;
import pageObject.BlogPage;
import pageObject.ContactPage;
import pageObject.HomePage;

import java.util.HashMap;
import java.util.Map;

import static sharedResources.supportMethods.CustomMethods.*;
import static sharedResources.supportMethods.DriverMethods.driver;

public class MainMenu {

    static String mainMenuAbout_css = ".menu [href*='/about']";
    static String mainMenuHome_css = ".menu [href$='.com/']";
    static String mainMenuContact_css = ".menu [href*='/contact']";
    static String mainMenuBlog_css = ".menu [href*='/blog']";

    public static Map mainMenuMap = new HashMap();

    //List mainMenuItems = {"About", "Home", "Contact", "Blog"};

    public static WebElement mainMenuAboutLink() { return driver.findElement(By.cssSelector(mainMenuAbout_css)); }
    public static WebElement mainMenuHomeLink() { return driver.findElement(By.cssSelector(mainMenuHome_css)); }
    public static WebElement mainMenuContactLink() { return driver.findElement(By.cssSelector(mainMenuContact_css)); }
    public static WebElement mainMenuBlogLink() { return driver.findElement(By.cssSelector(mainMenuBlog_css)); }

    public static void mainMenuSelectAboutLink() {
        findAndClickElement(mainMenuAbout_css); }
    public static void mainMenuSelectHomeLink() {
        findAndClickElement(mainMenuHome_css); }
    public static void mainMenuSelectContactLink() {
        findAndClickElement(mainMenuContact_css); }
    public static void mainMenuSelectBlogLink() {
        findAndClickElement(mainMenuBlog_css); }


    //Not in use
    public static Map getMainMenuMap() {

        mainMenuMap.put(mainMenuAbout_css, AboutPage.aboutPage_css);
        mainMenuMap.put(mainMenuHome_css, HomePage.homePage_css);
        mainMenuMap.put(mainMenuContact_css, ContactPage.contactPage_css);
        mainMenuMap.put(mainMenuBlog_css, BlogPage.blogPage_css);

        return mainMenuMap;
    }

}

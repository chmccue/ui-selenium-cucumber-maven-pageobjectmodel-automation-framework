package pageObject.navigation;

import pageObject.AboutPage;
import pageObject.BlogPage;
import pageObject.ContactPage;
import pageObject.HomePage;

import java.util.HashMap;
import java.util.Map;

import static sharedResources.supportMethods.CustomElementMethods.*;
import static sharedResources.supportMethods.CustomHelperMethods.logData;

public class MainMenu {

    //////////////////////////////////////////////////////
    // ELEMENT LOCATOR VARIABLES
    //////////////////////////////////////////////////////

    static String mainMenuAbout_css = ".menu [href*='/about']";
    static String mainMenuHome_css = ".menu [href$='.com/']";
    static String mainMenuContact_css = ".menu [href*='/contact']";
    static String mainMenuBlog_css = ".menu [href*='/blog']";

    public static Map mainMenuMap = new HashMap();

    //List mainMenuItems = {"About", "Home", "Contact", "Blog"};

    //////////////////////////////////////////////////////
    // PAGE OBJECT METHODS
    //////////////////////////////////////////////////////

    public static void mainMenuSelectAboutLink() {
        logData("Main Menu About Link");
        findAndClickElement(mainMenuAbout_css); }
    public static void mainMenuSelectHomeLink() {
        logData("Main Menu Home Link");
        findAndClickElement(mainMenuHome_css); }
    public static void mainMenuSelectContactLink() {
        logData("Main Menu Contact Link");
        findAndClickElement(mainMenuContact_css); }
    public static void mainMenuSelectBlogLink() {
        logData("Main Menu Blog Link");
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

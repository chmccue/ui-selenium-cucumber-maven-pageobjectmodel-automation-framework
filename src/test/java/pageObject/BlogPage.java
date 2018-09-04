package pageObject;

import static sharedResources.supportMethods.CustomElementMethods.verifyElementOnPage;

public class BlogPage {

    //////////////////////////////////////////////////////
    // ELEMENT LOCATOR VARIABLES
    //////////////////////////////////////////////////////

    public static String blogPage_css = ".blog";


    //////////////////////////////////////////////////////
    // PAGE OBJECT METHODS
    //////////////////////////////////////////////////////

    public static void blogPageContent() { verifyElementOnPage(blogPage_css); }

}

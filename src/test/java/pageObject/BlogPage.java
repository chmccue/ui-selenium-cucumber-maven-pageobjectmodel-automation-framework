package pageObject;

import static sharedResources.supportMethods.CustomMethods.verifyElementOnPage;

public class BlogPage {

    public static String blogPage_css = ".blog";

    public static void blogPageContent() { verifyElementOnPage(blogPage_css); }

}

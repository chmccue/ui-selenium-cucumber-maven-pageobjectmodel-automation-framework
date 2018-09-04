package pageObject;

import static sharedResources.supportMethods.CustomElementMethods.verifyElementOnPage;

public class ArticlePage {

    //////////////////////////////////////////////////////
    // ELEMENT LOCATOR VARIABLES
    //////////////////////////////////////////////////////

    public static String articlePage_css = ".archive";


    //////////////////////////////////////////////////////
    // PAGE OBJECT METHODS
    //////////////////////////////////////////////////////

    public static void articlePageContent() { verifyElementOnPage(articlePage_css); }

}

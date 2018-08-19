package pageObject;

import static sharedResources.supportMethods.CustomMethods.verifyElementOnPage;

public class ArticlePage {

    public static String articlePage_css = ".archive";

    public static void articlePageContent() { verifyElementOnPage(articlePage_css); }

}

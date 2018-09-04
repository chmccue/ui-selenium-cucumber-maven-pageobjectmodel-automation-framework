package pageObject;

import static sharedResources.supportMethods.CustomElementMethods.verifyElementOnPage;

public class AboutPage {

    //////////////////////////////////////////////////////
    // ELEMENT LOCATOR VARIABLES
    //////////////////////////////////////////////////////

    public static String aboutPage_css = ".current_page_item [href*='/about']";


    //////////////////////////////////////////////////////
    // PAGE OBJECT METHODS
    //////////////////////////////////////////////////////

    public static void aboutPageContent() { verifyElementOnPage(aboutPage_css); }


}

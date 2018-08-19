package pageObject;

import static sharedResources.supportMethods.CustomMethods.verifyElementOnPage;

public class AboutPage {

    public static String aboutPage_css = ".current_page_item [href*='/about']";

    public static void aboutPageContent() { verifyElementOnPage(aboutPage_css); }


}

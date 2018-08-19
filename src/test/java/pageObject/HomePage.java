package pageObject;

import static sharedResources.supportMethods.CustomMethods.verifyElementOnPage;

public class HomePage {

	public static String homePage_css = ".home";

	public static void homePageContent() {verifyElementOnPage(homePage_css); }

}

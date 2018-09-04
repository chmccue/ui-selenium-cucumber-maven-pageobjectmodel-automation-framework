package pageObject.globals;

import static sharedResources.supportMethods.CustomElementMethods.globalClosePopUp;

public class globalObjects {

    public static String globalCloseCookiesPopUp_css = ".hide-on-button [type='submit']";

    public static void closeCookiesPopup() {
        globalClosePopUp(globalCloseCookiesPopUp_css);
    }
}

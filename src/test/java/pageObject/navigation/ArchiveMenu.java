package pageObject.navigation;

import static sharedResources.supportMethods.CustomElementMethods.selectRandomElement;
import static sharedResources.supportMethods.CustomHelperMethods.logData;

public class ArchiveMenu {

    //////////////////////////////////////////////////////
    // ELEMENT LOCATOR VARIABLES
    //////////////////////////////////////////////////////

    public static String archiveMenu_css = "[id*='archives']";
    public static String archiveMenuItems_css = "[id*='archives'] li";


    //////////////////////////////////////////////////////
    // PAGE OBJECT METHODS
    //////////////////////////////////////////////////////

    public static void archiveMenuSelectRandomItem() {
        logData("Archive Menu: Selecting Random Archive Link");
        selectRandomElement(archiveMenuItems_css, " a");
    }

}

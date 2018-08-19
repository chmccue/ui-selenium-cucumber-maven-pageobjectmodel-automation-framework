package pageObject.navigation;

import static sharedResources.supportMethods.CustomMethods.logData;
import static sharedResources.supportMethods.CustomMethods.selectRandomElement;

public class ArchiveMenu {

    public static String archiveMenu_css = "[id*='archives']";
    public static String archiveMenuItems_css = "[id*='archives'] li";

    public static void archiveMenuSelectRandomItem() {
        logData("Archive Menu: Selecting Random Archive Link");
        selectRandomElement(archiveMenuItems_css, " a");
    }

}

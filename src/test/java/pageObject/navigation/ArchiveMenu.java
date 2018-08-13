package pageObject.navigation;

import sharedResources.supportMethods.CustomMethods;

import static sharedResources.supportMethods.CustomMethods.selectRandomElement;

public class ArchiveMenu {

    public static String archiveMenu_css = "[id*='archives']";
    public static String archiveMenuItems_css = "[id*='archives'] li";

    public static void archiveMenuSelectRandomItem() {
        selectRandomElement(archiveMenuItems_css, " a");
    }

}

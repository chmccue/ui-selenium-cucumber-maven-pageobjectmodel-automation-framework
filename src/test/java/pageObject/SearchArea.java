package pageObject;

import org.openqa.selenium.Keys;

import static sharedResources.supportMethods.CustomTextMethods.clearAndInputText;
import static sharedResources.supportMethods.CustomTextMethods.inputText;

public class SearchArea {

    //////////////////////////////////////////////////////
    // ELEMENT LOCATOR VARIABLES
    //////////////////////////////////////////////////////

    public static String searchField_css = ".search-field";


    //////////////////////////////////////////////////////
    // PAGE OBJECT METHODS
    //////////////////////////////////////////////////////
    public static void enterSearchTermAndPressEnter(String searchTerm) {
        clearAndInputText(searchField_css, searchTerm);
        inputText(searchField_css, (Keys.RETURN).toString(), false);
    }
}


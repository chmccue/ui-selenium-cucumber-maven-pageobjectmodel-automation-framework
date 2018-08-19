package pageObject;

import org.openqa.selenium.Keys;

import static sharedResources.supportMethods.CustomMethods.*;

public class SearchArea {

    public static String searchField_css = ".search-field";

    public static void enterSearchTermAndPressEnter(String searchTerm) {
        clearAndInputText(searchField_css, searchTerm);
        inputText(searchField_css, (Keys.RETURN).toString());
    }
}


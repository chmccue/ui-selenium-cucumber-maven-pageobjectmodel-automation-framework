package pageObject;

import static sharedResources.supportMethods.CustomElementMethods.*;
import static sharedResources.supportMethods.CustomTextMethods.clearAndInputText;

public class ContactPage {

    //////////////////////////////////////////////////////
    // ELEMENT LOCATOR VARIABLES
    //////////////////////////////////////////////////////
    public static String contactPage_css = ".current_page_item [href*='/contact']";

    public static String contactPageNameField_css = "input.name";
    public static String contactPageEmailField_css = "input.email";
    public static String contactPageCommentField_css = "[id*='contact-form-comment']";
    public static String contactPageSubmitBtn_css = ".contact-submit [type='submit']";

    public static String contactPageFormSubmitted_css = ".contact-form-submission";


    //////////////////////////////////////////////////////
    // PAGE OBJECT METHODS
    //////////////////////////////////////////////////////
    public static void contactPageContent() { verifyElementOnPage(contactPage_css); }

    public static void contactPageClickSubmitBtn() {
        jsScrollElementIntoView(contactPageSubmitBtn_css);
        findAndClickElement(contactPageSubmitBtn_css);
    }

    public static void contactPageEnterNameIntoField() {
        clearAndInputText(contactPageNameField_css, "autotest");
    }
    public static void contactPageEnterEmailIntoField() {
        clearAndInputText(contactPageEmailField_css, "autotest9032842938722@test.com"); }
    public static void contactPageEnterCommentsIntoField() {
        clearAndInputText(contactPageCommentField_css, "This is a comment to be added for testing."); }


    public static void contactPageFormSubmittedContent() {
        elementShouldNotBePresent(contactPageNameField_css);
        elementShouldNotBePresent(contactPageEmailField_css);
        elementShouldNotBePresent(contactPageCommentField_css);
        verifyElementOnPage(contactPageFormSubmitted_css); }

    public static void contactPageFormSubmittedContentNotPresent() {
        verifyElementOnPage(contactPageNameField_css);
        verifyElementOnPage(contactPageEmailField_css);
        verifyElementOnPage(contactPageCommentField_css);
        elementShouldNotBePresent(contactPageFormSubmitted_css);
        }

}

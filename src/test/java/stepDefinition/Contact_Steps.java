package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.navigation.MainMenu;

import static pageObject.ContactPage.*;

public class Contact_Steps {

    @Given("^I go to Contact page$")
    public void i_go_to_contact_page() {
        MainMenu.mainMenuSelectContactLink();
        contactPageContent();
    }

    @When("^I fill out the contact form$")
    public void i_fill_out_contact_form() {
        contactPageEnterNameIntoField();
        contactPageEnterEmailIntoField();
        contactPageEnterCommentsIntoField();
    }

    @Then("^I am able to submit the contact form$")
    public void i_am_able_to_submit_contact_form() {
        contactPageClickSubmitBtn();
        contactPageFormSubmittedContent();
    }

    @When("^I press submit button without filling in form$")
    public void i_press_submit_button_without_filling_in_form() {
        contactPageClickSubmitBtn();
    }

    @Then("^I am not able to submit the contact form$")
    public void i_am_not_able_to_submit_contact_form() {
        contactPageFormSubmittedContentNotPresent();
    }
}

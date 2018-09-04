package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.*;
import pageObject.navigation.ArchiveMenu;
import pageObject.navigation.MainMenu;

import static sharedResources.supportMethods.CustomHelperMethods.logData;


public class Navigation_Steps {

    @Given("^I want to navigate the main menu$")
    public void i_want_to_navigate_the_main_menu() {
        logData("Ready to navigate the main menu.");
    }

    @When("^I select \"([^\"]*)\" item$")
    public void i_select_item(String arg1) throws Throwable {

        if (arg1 == "About") {
            MainMenu.mainMenuSelectAboutLink();
        }
        else if (arg1 == "Home") {
            MainMenu.mainMenuSelectHomeLink();
        }
        else if (arg1 == "Contact") {
            MainMenu.mainMenuSelectContactLink();
        }
        else if (arg1 == "Blog") {
            MainMenu.mainMenuSelectBlogLink();
        }
        else {
            //logData("argument not valid; must match one of the valid menu links, such as About, Home, Contact, Blog");
            throw new Exception("argument not valid; must match one of the valid menu links, such as About, Home, Contact, Blog");
        }
    }


    @Given("^I want to navigate the archives menu$")
    public void i_want_to_navigate_the_archives_menu() {
        logData("Ready to navigate the archive menu.");
    }


    @Then("^I navigate the options of the main menu$")
    public void i_navigate_the_options_of_the_main_menu() {

        MainMenu.mainMenuSelectAboutLink();
        AboutPage.aboutPageContent();

        MainMenu.mainMenuSelectBlogLink();
        BlogPage.blogPageContent();

        MainMenu.mainMenuSelectContactLink();
        ContactPage.contactPageContent();

        MainMenu.mainMenuSelectHomeLink();
        HomePage.homePageContent();
        }


    @Given("^I navigate to \"([^\"]*)\" option$")
    public void i_navigate_to_menu_option(String mainMenu) {

        switch (mainMenu) {
            case "about":
                MainMenu.mainMenuSelectAboutLink();
                break;
            case "contact":
                MainMenu.mainMenuSelectContactLink();
                break;
            case "blog":
                MainMenu.mainMenuSelectBlogLink();
                break;
            case "home":
                MainMenu.mainMenuSelectHomeLink();
                break;
        }
    }

    @Then("^I am brought to \"([^\"]*)\" page$")
    public void i_am_brought_to_page(String pageContent) {

        switch (pageContent) {
            case "about":
                AboutPage.aboutPageContent();
                break;
            case "contact":
                ContactPage.contactPageContent();
                break;
            case "blog":
                BlogPage.blogPageContent();
                break;
            case "home":
                HomePage.homePageContent();
                break;
        }
    }

    @Then("^I navigate the options of the archive menu$")
    public void i_navigate_the_options_of_the_archive_menu() {
        ArchiveMenu.archiveMenuSelectRandomItem();
        ArticlePage.articlePageContent();
    }

}


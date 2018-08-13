package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import pageObject.*;
import pageObject.navigation.ArchiveMenu;
import pageObject.navigation.MainMenu;
import sharedResources.supportMethods.CustomMethods;


public class Navigation_Steps {

    @Given("^I want to navigate the main menu$")
    public void i_want_to_navigate_the_main_menu() throws Throwable {
        System.out.println("Ready to navigate the main menu.");
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
            System.out.println("argument not valid; must match one of the valid menu links, such as About, Home, Contact, Blog");
            //assert 1 == 2;
        }

    }


    @Given("^I want to navigate the archives menu$")
    public void i_want_to_navigate_the_archives_menu() throws Throwable {
        System.out.println("Ready to navigate the archive menu.");
    }


    @Then("^I navigate the options of the main menu$")
    public void i_navigate_the_options_of_the_main_menu() throws Throwable {

        System.out.println("About Link");
        MainMenu.mainMenuSelectAboutLink();
        AboutPage.aboutPageContent();

        System.out.println("Blog Link");
        MainMenu.mainMenuSelectBlogLink();
        BlogPage.blogPageContent();

        System.out.println("Contact Link");
        MainMenu.mainMenuSelectContactLink();
        ContactPage.contactPageContent();

        System.out.println("Home Link");
        MainMenu.mainMenuSelectHomeLink();
        HomePage.homePageContent();
        }

    @Then("^I navigate the options of the archive menu$")
    public void i_navigate_the_options_of_the_archive_menu() throws Throwable {

        System.out.println("Selecting Random Archive Link");
        ArchiveMenu.archiveMenuSelectRandomItem();
        ArticlePage.articlePageContent();
    }

    }



@all
@regression
@navigation
Feature: Navigate site
  As a user
  I want to navigate the menu of the website
  So I can access all areas of the website


  Scenario: Navigate main menu
    Given I want to navigate the main menu
    Then I navigate the options of the main menu


  @archiveMenu
  Scenario: Navigate archives menu
    Given I want to navigate the archives menu
    Then I navigate the options of the archive menu
    #Then I select each menu and confirm it goes to the correct page


@navigation
Feature: Navigate site
  As a user
  I want to navigate the menu of the website
  So I can access all areas of the website


  Scenario: Navigate main menu
    Given I want to navigate the main menu
    When I select "<menu>" item
    Then I should be on "<menu>" page
    #Examples:
      | menu    |
      | About   |
      | Home    |
      | Blog    |
      | Contact |

  Scenario: Navigate archives menu
    Given I want to navigate the archives menu
    Then I select each menu and confirm it goes to the correct page




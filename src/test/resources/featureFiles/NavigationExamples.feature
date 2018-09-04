@all
@regression
@navigation_examples
Feature: Navigate site with Examples
  As a user
  I want to navigate the menu of the website
  So I can access all areas of the website


  Scenario Outline: Navigate main menu with Examples
    Given I navigate to "<mainMenu>" option
    Then I am brought to "<mainMenu>" page

    Examples:
      |  mainMenu  |
      |  about     |
      |  home      |
      |  contact   |
      |  blog      |
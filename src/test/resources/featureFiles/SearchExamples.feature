@all @regression @search_examples
Feature: Search for articles with Examples
  As a user
  I want to use search on website
  So I can find articles relevant to my search


  Scenario Outline: Search term and results with Examples
    Given I want to find "<expectedNumber>" articles
    When I search for "<searchTerm>"
    Then I should be on "<searchTerm>" search results page with "<expectedNumber>" results

    Examples:
      |  expectedNumber  |  searchTerm  |
      |  >1              |  automation  |
      |  1               |  python.org  |
      |  <1              |  nope        |
      |  <=2             |  python.org  |
      |  0               |  nope        |
      |  =10             |  automation  |
      |  !=5             |  test        |

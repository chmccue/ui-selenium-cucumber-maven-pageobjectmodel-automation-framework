@search
Feature: Search for articles
  As a user
  I want to use search on website
  So I can find articles relevant to my search


  Scenario: Search term to find more than 1 articles
    Given I want to find many articles
    When I search for "automation"
    Then I should see multiple search results for "automation"

  Scenario: Search term to find only 1 article
    Given I want to find only 1 article
    When I search for "python.org"
    Then I should see only a single search result for "python.org"

  Scenario: Search term to find no articles
    Given I want to find no articles
    When I search for "nope"
    Then I should see no articles found

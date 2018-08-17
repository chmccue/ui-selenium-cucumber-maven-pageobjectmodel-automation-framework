@all @regression @contact
Feature: Contact page
  As a user
  I want to fill out contact page details
  So I can test the contact functionality on the site


  Scenario: Fill out contact page details
    Given I go to Contact page
    When I fill out the contact form
    Then I am able to submit the contact form

  Scenario: Pressing submit without completing form
    Given I go to Contact page
    When I press submit button without filling in form
    Then I am not able to submit the contact form

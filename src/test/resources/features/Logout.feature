@MESK-352 @regression @wip
Feature: As a user, I should be able to log out.

  Background:
    Given Navigate to "app_url" url


  Scenario: Verify that User can log out and ends up in login page and check step back criteria
    When Enter "Employee13" to username input
    And Enter "Employee123" to password input
    And Click on the Login button
    Then Verify that user can login
    And Click on the Settings menu
    And Click on the "Log out" link
    Then Verify that user can log out and see login page
    And Click on navigate back
    Then Verify that user can NOT go to home page again










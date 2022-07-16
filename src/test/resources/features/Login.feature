@MESK-321 @regression
Feature: As a user, I should be able to login.

  Background:
    Given Navigate to "app_url" url

  @login_positive
  Scenario Outline: Verify that user can login with valid credentials
    When Enter "<username>" to username input
    And Enter "<password>" to password input
    And Click on the Login button
    Then Verify that user can login

    Examples:
      | username   | password    |
      | Employee13 | Employee123 |

  @login_negative
  Scenario Outline: Verify that user can not login with invalid credentials
    When Enter "<username>" to username input
    And Enter "<password>" to password input
    And Click on the Login button
    Then Verify that user can not login and see the notice message

    Examples:
      | username        | password        |
      | EmployeeInvalid | Employee123     |
      | Employee13      | EmployeeInvalid |
      | EmployeeInvalid | EmployeeInvalid |
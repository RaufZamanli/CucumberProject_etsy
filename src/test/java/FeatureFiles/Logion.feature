Feature: Login functionality

  Scenario: Login with valid username and password
    Given Navigate to web site
    When Click on sign in button
    And  User enters valid credentials to username and password
    And  User clicks on sign in button
    Then Verify that user should logged in successfully

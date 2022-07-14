@smoke
Feature: F01_Register | Create a new account user

  Scenario: Create a new account user
    Given user link ecommerce page
    When user enter email "test@example.com" field
    And user clicks on create account button
    And your Personal Information,Address and Contact info.
    And Click on Register button.
    Then Validate that user is created.




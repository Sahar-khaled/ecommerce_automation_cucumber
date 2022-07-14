@smoke
Feature: F02_Login | Authenticate as new user


  Scenario: Authenticate as new user
    Given user link ecommerce page
    When user enter mail "test@ex.com" field
    And enter password "120MAN"
    And Click on signIn button.
    Then Validate that user login successfully.




@Smoke
@Subscription
Feature: Verify Subscription
  In order to perform subscription

  Scenario: In order to Subscription

    When user should be able to see main page
    Then user should be able to send email address
    And user should be able to verify email address

  Scenario: verify invalid email address

    When user should be able to see main page
    Then user should be able to send invalid email address
    And user should be able to see error message







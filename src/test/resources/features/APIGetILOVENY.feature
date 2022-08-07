#@Smoke
#@API
Feature: Verify API


  Scenario: In order to verify API

    Given user given api url
    Then user should be validate status code

  Scenario: In order to verify Order Page

    Given user given api order page url
    Then user should be validate status code of Order Page

  Scenario: In order to verify Menu Page

    Given user given api menu page url
    Then user should be validate status code of Menu Page

  Scenario: In order to verify Specials Page

    Given user given api specials page url
    Then user should be validate status code of Specials Page

  Scenario: In order to verify Loyalty Page

    Given user given api loyalty page url
    Then user should be validate status code of Loyalty Page

  Scenario: In order to verify Contact Page

    Given user given api contact page url
    Then user should be validate status code of Contact Page



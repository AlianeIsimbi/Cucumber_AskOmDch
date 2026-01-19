Feature: Login Functionality

  In order to do online shopping
  As an AskOmDch user
  I want to login successfully

  Scenario: Login Successful

    Given I am on the Account page of AskOmDch website
    When I enter valid username and password
    Then I should be taken to Dashboard
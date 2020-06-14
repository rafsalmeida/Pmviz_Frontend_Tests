@tag
Feature: Logout
  As a user
  I want to logout
  So that I can close my session

  @tag1
  Scenario: Logout
    Given I am logged in
    When I click the logout button
    Then I log out

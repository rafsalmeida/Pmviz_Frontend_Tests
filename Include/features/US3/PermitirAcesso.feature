
@tag
Feature: Manage Access
  As a Administrator
  I want to control the access of other roles
  So that I can restrict the access

  @tag1
  Scenario: Allow Access
    Given I am logged in as an administrator
    When I click the Manage Access tab
    And I choose a role
    And I choose a route to allow
    And I click on the save button
    Then I see the changes were succesfull

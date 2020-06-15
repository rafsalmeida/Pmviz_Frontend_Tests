
@tag
Feature: Manage Access
  As a Administrator
  I want to control the access of other roles
  So that I can restrict the access

  @tag1
  Scenario: See permissions
    Given I am logged in as an administrator
    When I click the Manage Access tab
    And I choose a role 
    Then I see the list of permissions and restrictions

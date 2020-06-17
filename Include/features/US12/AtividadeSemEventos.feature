
@tag
Feature: Workstations Performance
  As a manager
  I want to see the workstations performance on a certain activity of a process
  So that I can see which workstation had the best performance.

  @tag1
  Scenario: Activity with no events
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button
    And I click on the Workstations button
    And I choose an activity without workstations events
    Then I see that there is no work on this activity


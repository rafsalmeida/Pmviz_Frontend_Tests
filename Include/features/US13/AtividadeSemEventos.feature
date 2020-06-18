@tag
Feature: Workstations Work Time
  As a manager
  I want to see the workstations work time on a certain activity of a process
  So that I can see which workstation had the best work time.

  @tag1
  Scenario: Activity with no events
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button
    And I click on the Workstations button
    And I click on the Workstations Work Time button
    And I choose an activity without workstations events
    Then I see that there is no workstations on this activity


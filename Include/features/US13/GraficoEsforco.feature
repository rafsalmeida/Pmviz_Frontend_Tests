
@tag
Feature: Workstations Work Time
  As a manager
  I want to see the workstations work time on a certain activity of a process
  So that I can see which workstation had the best work time.

  @tag1
  Scenario: Frequency chart
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button with workstation events
    And I click on the Workstations button
    And I click on the Workstations Work Time button
    And I choose an activity with workstations events
    Then I see the work time chart



@tag
Feature: Workstations Work time
  As a manager
  I want to see the users performance on a certain workstation of a process
  So that I can see which user had the best operational time.

  @tag1
  Scenario: Workstations without events
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button
    And I click on the Users button
    And I click on the Workstations Work time button
    And I choose a workstation that has no events
    Then I see there are no workstations associated to that activity


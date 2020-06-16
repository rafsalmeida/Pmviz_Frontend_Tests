
@tag
Feature: Workstations Work time
  As a manager
  I want to see the users performance on a certain workstation of a process
  So that I can see which user had the best operational time.

  @tag1
  Scenario: Choose a workstation
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button
    And I click on the Users button
    And I click on the Workstations Work time button
    Then I see the possibility to choose a workstation


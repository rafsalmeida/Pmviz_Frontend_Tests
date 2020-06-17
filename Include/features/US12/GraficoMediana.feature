
@tag
Feature: Workstations Performance
  As a manager
  I want to see the workstations performance on a certain activity of a process
  So that I can see which workstation had the best performance.

  @tag1
  Scenario: Median chart
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button with workstation events
    And I click on the Workstations button
    And I choose an activity with workstations events
    And I click the Median button
    Then I see the median chart 


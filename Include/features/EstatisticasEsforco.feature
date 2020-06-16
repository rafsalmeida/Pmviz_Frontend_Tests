
@tag
Feature: Users work time
  As a manager
  I want to see the users work time on a certain activity of a process
  So that I can see which user had the most effort.

  @tag1
  Scenario: Effort Statistics
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button
    And I click on the Users button
    And I choose the Work time button
    And I choose an activity
    Then I see the effort statistics


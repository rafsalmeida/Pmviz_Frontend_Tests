
@tag
Feature: Users performance
  As a manager
  I want to see the users performance on a certain activity of a process
  So that I can see which user had the best performance

  @tag1
  Scenario: Activity Without Events
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button
    And I click on the Users button
    And I choose an activity without events
    Then I see that there is no work in this activity


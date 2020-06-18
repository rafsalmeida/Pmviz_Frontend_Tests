
@tag
Feature: Personal Statistics
	As an operator,
	I want to see the mean duration statistics of an activity of a process
	So that I see if how I performed compared with the general performance
  @tag1
  Scenario: Choose Another Process
    Given I am logged in as an operator
    When I click on the My Statistics button
    And I click on the Statistics button
    And I choose an activity with events
    And I choose another process
    And I choose an activity with events
    Then I see my performance in the other event
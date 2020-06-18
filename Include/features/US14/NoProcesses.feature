
@tag
Feature: List of Processes I worked in
	As an operator,
	I want to see the processes I worked in
	So that I can choose a process to see my statistics
  @tag1
  Scenario: Operator with no processes
    Given I am logged in as an operator that has no processes
    When I click on the My Statistics button
    Then I see there are no processes associated
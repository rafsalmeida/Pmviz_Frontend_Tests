
@tag
Feature: List of Processes I worked in
	As an operator,
	I want to see the processes I worked in
	So that I can choose a process to see my statistics
  @tag1
  Scenario: Access Statistics
    Given I am logged in as an operator
    When I click on the My Statistics button
    Then I see the list of processes I worked in

@tag
Feature: Lista de processos
	As a user
	I want to see the list of processes
	So that I can see its characteristics
	
  @tag1
  Scenario: Processes list
    Given I am logged in
    When I click on the processes tab
    Then I see the list of processes

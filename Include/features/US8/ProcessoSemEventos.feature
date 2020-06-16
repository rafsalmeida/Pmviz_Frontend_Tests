@tag
Feature: Estatisticas de tempo operacional
	As a manager
	I want to see the operation time of the activities of a process
	So that I can see which activity took more operational effort.
	
  @tag1
  Scenario: No events 
    Given I am logged in
    When I click on the processes tab
    And I click on the Activities button of a process that has no events
    And I click on the Operational time button
    Then I see that there was an error retrieving the statistics

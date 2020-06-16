@tag
Feature: Estatisticas de Esforco
	As a manager
	I want to see the work time of the activities of a process
	So that I can see which activity took more effort.
	
  @tag1
  Scenario: Effort chart
    Given I am logged in
    When I click on the processes tab
    And I click on the Activities button of a process
    And I click on the Work time button
    Then I see the work time statistics

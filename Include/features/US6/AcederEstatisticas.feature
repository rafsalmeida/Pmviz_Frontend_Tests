
@tag
Feature: Estatisticas de Frequencia e Duracao das Atividades
	As a manager
	I want to see the frequency and duration of the activities of a process
	So that I can see which activity took longer.
	
  @tag1
  Scenario: Access statistics
    Given I am logged in
    When I click on the processes tab
    And I click on the Activities button of a process
    Then I have access to the statistics


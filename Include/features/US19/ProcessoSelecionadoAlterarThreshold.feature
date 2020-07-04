@tag
Feature: Frequency Graph
		As a manager
		I want to see frequency graph of various processes with diferent algorithms and threshold
		So that I can see the frequency of each activity in the selected process

  @tag1
  Scenario: With process selected and graph generated, change the threshold
    Given I am logged in
    When I click on the frequency graph tab
    And I select heuristic miner
    And I click on the Processes select
    And I select a Process with events
    And I change the treshold
    Then I see that the frequency graph generated
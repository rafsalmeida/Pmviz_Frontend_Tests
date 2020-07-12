@tag
Feature: Conformance Graph
		As a manager
		I want to see conformance graph with heuristic miner and with a threshold of my choice
		So that I can see the conformance of each activity
  @tag1
  Scenario: Generate conformance graph with another treshold
    Given I am logged in
    When I click on the conformance graph tab
    And I select the heuristic miner
    And I change the threshold
    And I click on the reference process select
    And I select a reference process with events
    Then I see that the conformance graph generated
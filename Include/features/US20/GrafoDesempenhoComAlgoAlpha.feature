@tag
Feature: Performance Graph
		As a manager
		I want to see performance graph with alpha miner
		So that I can see the frequency of each activity

  @tag1
  Scenario: Generate performance graph with alpha algorithm
    Given I am logged in
    When I click on the frequency graph tab
    And I select performance graph
    And I click on the Processes select
    And I select a Process with events
    Then I see that the performance graph generated
@tag
Feature: Frequency Graph
		As a manager
		I want to see frequency graph with alpha miner
		So that I can see the frequency of each activity

  @tag1
  Scenario: Generate frequency graph with Alpha algorithm
    Given I am logged in
    When I click on the frequency graph tab
    And I click on the Processes select
    And I select a Process with events
    Then I see that the frequency graph generated
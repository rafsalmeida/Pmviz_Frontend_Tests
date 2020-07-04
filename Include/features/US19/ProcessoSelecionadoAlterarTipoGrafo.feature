@tag
Feature: Frequency Graph
		As a manager
		I want to see frequency graph and performance graph of various processes
		So that I can see the frequency and performance of each activity in the selected process

  @tag1
  Scenario: With process selected and graph generated, change the graph type
    Given I am logged in
    When I click on the frequency graph tab
    And I click on the Processes select
    And I select a Process with events
    And I select another type of graph
    Then I see that the type of graph change
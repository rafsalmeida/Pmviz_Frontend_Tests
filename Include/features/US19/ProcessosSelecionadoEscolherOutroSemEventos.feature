@tag
Feature: Frequency Graph
		As a manager
		I want to see frequency graph of various processes
		So that I can see the frequency of each activity in the selected process

  @tag1
  Scenario: With process selected and graph generated, select another process without events
    Given I am logged in
    When I click on the frequency graph tab
    And I click on the Processes select
    And I select a Process with events
    And I click on the Processes select
    And I select a Process without events
    Then I see that the process selected has no events
@tag
Feature: Frequency Graph
		As a manager
		I want to see frequency graph
		So that I can see the frequency of each activity
  @tag1
  Scenario: Select process without ativities
    Given I am logged in
    When I click on the frequency graph tab
    And I click on the Processes select
    And I select a Process without events
    Then I see that the process selected has no events
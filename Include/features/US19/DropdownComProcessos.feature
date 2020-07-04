@tag
Feature: Frequency Graph
		As a manager
		I want to access frequency page
		So that I see the dropdown with processes
  @tag1
  Scenario: Check if dropdown have at least one process
    Given I am logged in
    When I click on the frequency graph tab
    And I click on the Processes select
    Then I see the at least one process
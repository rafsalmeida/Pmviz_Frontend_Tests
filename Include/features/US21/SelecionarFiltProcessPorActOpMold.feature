@tag
Feature: Conformance Graph
		As a manager
		I want to see conformance graph by selecting filter of process
		So that I can see the conformance of each activity
  @tag1
  Scenario: Select one Model, Activity and Operator to select in filter process
    Given I am logged in
    When I click on the conformance graph tab
    And I click on the reference process select
    And I select a reference process with events
    And I select one mold, one activity and one operator on the selects of filter process
    Then I see that the conformance graph generated
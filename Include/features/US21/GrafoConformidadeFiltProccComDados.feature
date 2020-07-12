@tag
Feature: Conformance Graph
		As a manager
		I want to see conformance graph, select a process and filter it
		So that I can see the conformance of each activity
  @tag1
  Scenario: Have at least one Model, Activity and Operator to select in process filter
    Given I am logged in
    When I click on the conformance graph tab
    And I click on the reference process select
    And I select a reference process with events
    Then I see that at least one mold, one activity and one operator on the selects of process filter
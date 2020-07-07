@tag
Feature: Conformance Graph
		As a manager
		I want to see conformance graph
		So that I can see the conformance of each activity
  @tag1
  Scenario: Select reference process without events
    Given I am logged in
    When I click on the conformance graph tab
    And I click on the reference process select
    And I select a reference process without events
    Then I see that the reference process selected has no events
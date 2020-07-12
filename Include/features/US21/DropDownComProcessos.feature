@tag
Feature: Conformance Graph
		As a manager
		I want to access conformance page
		So that I see the dropdown with processes
  @tag1
  Scenario: Check if dropdown of reference process have at least one process
    Given I am logged in
    When I click on the conformance graph tab
    And I click on the reference process select
    Then I see the at least one reference process
@tag
Feature: Conformance Graph
		As a manager
		I want to access conformance page
		So that I can visualize the conformance graph
  @tag1
  Scenario: Access conformance page
    Given I am logged in
    When I click on the conformance graph tab
    Then I see the options to see conformance graph
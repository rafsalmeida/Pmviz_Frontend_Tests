@tag
Feature: Frequency Graph
		As a manager
		I want to access frequency page
		So that I can visualize the frequency graph
  @tag1
  Scenario: Access frequency page
    Given I am logged in
    When I click on the frequency graph tab
    Then I see the options to see frequency graph

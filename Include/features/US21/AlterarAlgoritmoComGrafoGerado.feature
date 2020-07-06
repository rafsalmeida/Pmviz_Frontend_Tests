@tag
Feature: Conformance Graph
		As a manager
		I want to see conformance graph and switch miners 
		So that I can see the conformance of each activity
  @tag1
  Scenario: Generate conformance graph and then switch the miner
    Given I am logged in
    When I click on the conformance graph tab
    And I click on the reference process select
    And I select a reference process with events
    And I switch the miner
    Then I see that the conformance graph generated
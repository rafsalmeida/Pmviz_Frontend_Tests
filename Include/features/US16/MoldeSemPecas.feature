
@tag
Feature: See mould parts
 	As an operator
 	I want to choose a mould
 	So that I can its parts

  @tag1
  Scenario: Mould without parts
    Given I am logged in as an operator
    When I click on the tagging button
    And I choose a mould without parts
    Then I see the mould does not have parts

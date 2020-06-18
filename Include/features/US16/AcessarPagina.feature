
@tag
Feature: See mould parts
 	As an operator
 	I want to choose a mould
 	So that I can its parts

  @tag1
  Scenario: Access Page
    Given I am logged in as an operator
    When I click on the tagging button
    Then I see the possibility to choose a mould

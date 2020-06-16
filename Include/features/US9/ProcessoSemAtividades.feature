
@tag
Feature: Users performance
  As a manager
  I want to see the users performance on a certain activity of a process
  So that I can see which user had the best performance

  @tag1
  Scenario: Process without activities
    Given I am logged in
    When I click on the processes tab
    And I click on the Resources button of a process without activities
    Then I see that there was an error retrieving activities


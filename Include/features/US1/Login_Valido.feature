
@tag
Feature: Login
	As a guest
	I want to login
	So that I can access the website
	
  @tag1
  Scenario: Valid Login
    Given I want to login
    When I insert a valid username
    And I insert a valid password
    And I click the login button
    Then I successfully login

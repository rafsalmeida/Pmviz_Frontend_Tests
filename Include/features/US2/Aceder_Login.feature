
@tag
Feature: Register
	As a guest
	I want to register
	So that I can login.
	
  @tag1
  Scenario: Access Login page
    Given I want to access the login page
    When I am in the register page
    And I click on the Sign In button
    Then I am redirected to the login page


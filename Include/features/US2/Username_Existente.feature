@tag
Feature: Register
	As a guest
	I want to register
	So that I can login.
	
  @tag1
  Scenario: Valid Register
    Given I want to register
    And I am in the register page
    When I insert an existing username
    And I insert a valid name
    And I insert a valid email
    And I insert a valid role
    And I insert a password
    And I insert a valid password confirmation
    And I click the register button
    Then I see that the username must be unique
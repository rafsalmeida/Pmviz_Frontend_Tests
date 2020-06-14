
@tag
Feature: Login
	As a guest
	I want to login
	So that I can access the website
	
  @tag1
  Scenario: Invalid Login
    Given I want to login
    When I insert an invalid username
    And I insert an invalid password
    And I click the login button
    Then I see that my credentials are invalid 

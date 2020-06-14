
@tag
Feature: Login
	As a guest
	I want to login
	So that I can access the website

  @tag1
  Scenario: Access Register Page
    Given I want to acess Register page from login
    When I click the Sign Up button
    Then I get redirected to the Register Page

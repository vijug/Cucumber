
@tag
Feature: Gmail Login page
  I want to use this template for my feature f
  
Background:
	Given Launch the browser
	And navigate to the application
  @tag1
  Scenario: Login with valid credentials
    
    When In loginPage, enter "vijugudage@gmail.com"
    And enter "abc"
    And yet another action
    Then Login should be successfull
    

  @tag2
  Scenario Outline: Login with Invalid credentials
    When In loginPage, enter "<uname>"
    And enter "<pwd>"
    And yet another action
    Then Login should be unsuccessfull
    Examples: 
      | uname  |pwd | 
      | name1 |     5 | 
      | name2 |     7 | 

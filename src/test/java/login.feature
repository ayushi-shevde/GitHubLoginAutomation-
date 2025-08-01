#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Test cases for banking application

  @Login
  Scenario: Verify the login funcationality
    Given User have to enter the URL of the website
    When Enter Username and Password
    And Click on Login button
    Then Land on Homepage

  @Logout
  Scenario: Verify the Logout Button
    Given User have to enter the URL of the website
    When Enter Username and Password
    And Click on Login button
    And Verify the logout
    Then Go back to Login page

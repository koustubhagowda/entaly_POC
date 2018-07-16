@RadialGraph
Feature: As a end user 
I should able fetch all the data in radial graph
 

Background: user login
    Given I am on entaly website
    When I enter valid login crediential for "qwinix@yopmail.com" & "Qwinix123!" & click on SignIn 
@Radialchart
Scenario: trying to fetch the data
Given I am on Dashboard page
When  I navigate on the radial chart
Then I should able to fetch all the data in radial chart


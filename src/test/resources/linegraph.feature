@Linechart
Feature: As a end user 
I should able to fetch all the data

Background: user login
    Given I am on entaly website
    When I enter valid login crediential for "qwinix@yopmail.com" & "Qwinix123!" & click on SignIn


@Linechart
Scenario: trying to fetch the data
Given I am on Dashboard page
When I navigate on line chart
Then I should able to fetch all the data in char

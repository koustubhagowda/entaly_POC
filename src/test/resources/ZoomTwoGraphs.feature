@Zoom2graphS
Feature: As a end user
I should able to fetch all the data in barchart

Background: user login
    Given I am on entaly website
    When I enter valid login crediential for "qwinix@yopmail.com" & "Qwinix123!" & click on SignIn


@barchart
Scenario: trying to fetch all data in bargraph
Given Iam on Dashboard page
When I navigate to Barchart
Then I should able to fetch all data


@Radialchart
Scenario: trying to fetch the data
Given I am on Dashboard page
When  I navigate on the radial chart
Then I should able to fetch all the data in radial chart

@Linechart
Scenario: trying to fetch the data
Given I am on Dashboard page
When I navigate on line chart
Then I should able to fetch all the data in chart
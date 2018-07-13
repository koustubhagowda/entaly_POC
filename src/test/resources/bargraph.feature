@Bargraph
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
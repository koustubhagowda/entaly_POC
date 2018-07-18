@multiple_graphs
Feature: graph automate

Background: user login
    Given I am on entaly website
    When I enter valid login crediential for "qwinix@yopmail.com" & "Qwinix123!" & click on SignIn

  @bargraph
  Scenario: bargraph automating
    Given Im on dashboard logged in page
    When I navigate on graph page
    Then I should able to fetch the data with graph
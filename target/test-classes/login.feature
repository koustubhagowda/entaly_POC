@entaly_graphs
Feature: graph automate

Background: user login
    Given I am on entaly website
    When I enter valid login crediential for "qwinix@yopmail.com" & "Qwinix123!" & click on SignIn

  @bargraph
  Scenario: bargraph automating
    Given Im on dashboard
    When I navigate on bargraph
    Then I should able to fetch the data with in bargraph
    
   @radialchart
   Scenario: radialchart automating
   Given Im on dashboard page
   When I navigate on radialchart
   Then I should able to fetch the data with in radialchart
   
   @linechart
   Scenario: linechart automating
   Given Im on dashboard home page
   When I navigate on linechart
   Then I should able to fetch the data with in linegraph
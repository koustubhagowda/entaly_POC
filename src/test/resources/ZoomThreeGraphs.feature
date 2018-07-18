@entaly_zoom_three
Feature: graph automate

Background: user login
    Given I am on entaly website
    When I enter valid login crediential for "qwinix@yopmail.com" & "Qwinix123!" & click on SignIn

  @bargraph
  Scenario: zoom3 bargraph automating
    Given Im on home page of barchart
    When I navigate to zoom3 barchart table page 
    Then I should able to fetch the content in tabel of bargraph
    
   @radialchart
   Scenario: zoom3 radialchart automating
   Given Im on home page of radialchart
   When I navigate to zoom3 radialchart table page
   Then I should able to fetch the content in tabel of radialgraph
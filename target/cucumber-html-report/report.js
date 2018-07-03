$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "graph automate",
  "description": "",
  "id": "graph-automate",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@entaly_graphs"
    }
  ]
});
formatter.before({
  "duration": 4028748046,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "user login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on entaly website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid login crediential for \"qwinix@yopmail.com\" \u0026 \"Qwinix123!\" \u0026 click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "SigninPageSteps.i_am_on_entaly_website()"
});
formatter.result({
  "duration": 6774193549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qwinix@yopmail.com",
      "offset": 37
    },
    {
      "val": "Qwinix123!",
      "offset": 60
    }
  ],
  "location": "SigninPageSteps.i_enter_valid_login_crediential_for_click_on_SignIn(String,String)"
});
formatter.result({
  "duration": 6257695830,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#@bargraph"
    },
    {
      "line": 9,
      "value": "#Scenario: bargraph automating"
    },
    {
      "line": 10,
      "value": "#Given Im on dashboard"
    },
    {
      "line": 11,
      "value": "#When I navigate on bargraph"
    },
    {
      "line": 12,
      "value": "#Then I should able to fetch the data with in bargraph"
    },
    {
      "line": 13,
      "value": "#"
    },
    {
      "line": 14,
      "value": "#@radialchart"
    },
    {
      "line": 15,
      "value": "#Scenario: radialchart automating"
    },
    {
      "line": 16,
      "value": "#Given Im on dashboard page"
    },
    {
      "line": 17,
      "value": "#When I navigate on radialchart"
    },
    {
      "line": 18,
      "value": "#Then I should able to fetch the data with in radialchart"
    },
    {
      "line": 19,
      "value": "#"
    }
  ],
  "line": 21,
  "name": "linechart automating",
  "description": "",
  "id": "graph-automate;linechart-automating",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@linechart"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Im on dashboard home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I navigate on linechart",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should able to fetch the data with in linegraph",
  "keyword": "Then "
});
formatter.match({
  "location": "LinechartSteps.im_on_dashboard_home_page()"
});
formatter.result({
  "duration": 2452468697,
  "status": "passed"
});
formatter.match({
  "location": "LinechartSteps.i_navigate_on_linechart()"
});
formatter.result({
  "duration": 7651544219,
  "status": "passed"
});
formatter.match({
  "location": "LinechartSteps.i_should_able_to_fetch_the_data_with_in_linegraph()"
});
formatter.result({
  "duration": 56545514187,
  "status": "passed"
});
formatter.after({
  "duration": 723977626,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("zoom3.feature");
formatter.feature({
  "line": 2,
  "name": "graph automate",
  "description": "",
  "id": "graph-automate",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@zoom3_graphs"
    }
  ]
});
formatter.before({
  "duration": 5250653688,
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
  "duration": 3105572301,
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
  "duration": 4106949547,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "zoom3 bargraph automating",
  "description": "",
  "id": "graph-automate;zoom3-bargraph-automating",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@bargraph"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Im on home page of barchart",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I navigate to zoom3 barchart table page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should able to fetch the content in tabel of bargraph",
  "keyword": "Then "
});
formatter.match({
  "location": "Zoom3bargraphSteps.im_on_home_page_of_barchart()"
});
formatter.result({
  "duration": 2292370553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 18
    }
  ],
  "location": "Zoom3bargraphSteps.i_navigate_to_zoom_barchart_table_page(int)"
});
formatter.result({
  "duration": 7761508631,
  "status": "passed"
});
formatter.match({
  "location": "Zoom3bargraphSteps.i_should_able_to_fetch_the_content_in_tabel_of_bargraph()"
});
formatter.result({
  "duration": 11899210363,
  "status": "passed"
});
formatter.after({
  "duration": 941901050,
  "status": "passed"
});
formatter.before({
  "duration": 4007358340,
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
  "duration": 31041900023,
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
  "duration": 4058019608,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "zoom3 radialchart automating",
  "description": "",
  "id": "graph-automate;zoom3-radialchart-automating",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@radialchart"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Im on home page of radialchart",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I navigate to zoom3 radialchart table page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should able to fetch the content in tabel of radialgraph",
  "keyword": "Then "
});
formatter.match({
  "location": "Zoom3radialgraphSteps.im_on_home_page_of_radialchart()"
});
formatter.result({
  "duration": 2287866969,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 18
    }
  ],
  "location": "Zoom3radialgraphSteps.i_navigate_to_zoom_radialchart_table_page(int)"
});
formatter.result({
  "duration": 6094989729,
  "status": "passed"
});
formatter.match({
  "location": "Zoom3radialgraphSteps.i_should_able_to_fetch_the_content_in_tabel_of_radialgraph()"
});
formatter.result({
  "duration": 134940553409,
  "status": "passed"
});
formatter.after({
  "duration": 921036696,
  "status": "passed"
});
});
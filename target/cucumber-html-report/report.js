$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Bubblechart.feature");
formatter.feature({
  "line": 2,
  "name": "As a end user",
  "description": "I should able to fetch all data in bubble chart",
  "id": "as-a-end-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Bubble_graph"
    }
  ]
});
formatter.before({
  "duration": 2323341117,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#@bubble_chart"
    },
    {
      "line": 6,
      "value": "#Scenario: trying to fetch all datain bubble chart"
    },
    {
      "line": 7,
      "value": "#Given Iam on bubblechart homepage"
    },
    {
      "line": 8,
      "value": "#When I navigate to bubble chart"
    },
    {
      "line": 9,
      "value": "#Then I should albe to fetch all the data in bubble chart"
    },
    {
      "line": 10,
      "value": "#"
    },
    {
      "line": 11,
      "value": "#@funnel_chart"
    },
    {
      "line": 12,
      "value": "#Scenario: trying to fetch all the data"
    },
    {
      "line": 13,
      "value": "#Given Iam on  funnelchart homepage"
    },
    {
      "line": 14,
      "value": "#When I navigate to funnel chart"
    },
    {
      "line": 15,
      "value": "#Then I should able to fetch all data in funnel chart"
    },
    {
      "line": 16,
      "value": "#"
    },
    {
      "line": 17,
      "value": "#@scatter_chart"
    },
    {
      "line": 18,
      "value": "#Scenario: trying to fetch all the data"
    },
    {
      "line": 19,
      "value": "#Given Iam on scatterchart homepage"
    },
    {
      "line": 20,
      "value": "#When I navigate to sactter chart"
    },
    {
      "line": 21,
      "value": "#Then I should able to fetch all data in scatter chart"
    }
  ],
  "line": 24,
  "name": "trying to fetch all the data in sunburst chart",
  "description": "",
  "id": "as-a-end-user;trying-to-fetch-all-the-data-in-sunburst-chart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@sunburst_chart"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Iam on sunbrust homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I navigate to sunburst chart",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should able to fetch all data in sunburst chart",
  "keyword": "Then "
});
formatter.match({
  "location": "Sunburstchartstepdef.iam_on_sunbrust_homepage()"
});
formatter.result({
  "duration": 74675173710,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"highcharts-ze4ztfe-0\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dLinux 3.19.0-25-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027qt\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-25-generic\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.117, webStorageEnabled: true}\nSession ID: ae7e58c2fc8ac73ae0318c18c924d27d\n*** Element info: {Using\u003did, value\u003dhighcharts-ze4ztfe-0}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\n\tat com.qwinix.entaly.qa.steps.Sunburstchartsteps.getdata_sunburst_chart(Sunburstchartsteps.java:29)\n\tat com.qwinix.entaly.qa.stepdefinitions.Sunburstchartstepdef.iam_on_sunbrust_homepage(Sunburstchartstepdef.java:15)\n\tat ✽.Given Iam on sunbrust homepage(Bubblechart.feature:25)\n",
  "status": "failed"
});
formatter.match({
  "location": "Sunburstchartstepdef.i_navigate_to_sunburst_chart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Sunburstchartstepdef.i_should_able_to_fetch_all_data_in_sunburst_chart()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://www.highcharts.com/demo/sunburst");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 292534407,
  "status": "passed"
});
});
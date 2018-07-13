$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("radialgraph.feature");
formatter.feature({
  "line": 2,
  "name": "As a end user",
  "description": "I should able fetch all the data in radial graph",
  "id": "as-a-end-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RadialGraph"
    }
  ]
});
formatter.before({
  "duration": 2249541230,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "user login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on entaly website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter valid login crediential for \"qwinix@yopmail.com\" \u0026 \"Qwinix123!\" \u0026 click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "SigninPageSteps.i_am_on_entaly_website()"
});
formatter.result({
  "duration": 36209272981,
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
  "duration": 4551071194,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "trying to fetch the data",
  "description": "",
  "id": "as-a-end-user;trying-to-fetch-the-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Radialchart"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on Dashboard page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I navigate on the radial chart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should able to fetch all the data in radial chart",
  "keyword": "Then "
});
formatter.match({
  "location": "LineGraphzoomstepdef.i_am_on_Dashboard_page()"
});
formatter.result({
  "duration": 3715819519,
  "status": "passed"
});
formatter.match({
  "location": "Radialgraphzoom2stepdef.i_navigate_on_the_radial_chart()"
});
formatter.result({
  "duration": 2383411466,
  "status": "passed"
});
formatter.match({
  "location": "Radialgraphzoom2stepdef.i_should_able_to_fetch_all_the_data_in_radial_chart()"
});
formatter.result({
  "duration": 72573728547,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//*[name()\u003d\u0027svg\u0027]/*[name()\u003d\u0027g\u0027]//*[name()\u003d\u0027path\u0027])[7]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dLinux 3.19.0-25-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027qt\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-25-generic\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.117, webStorageEnabled: true}\nSession ID: 4334ac1ce5d3d09219a7f72e1ab5ae82\n*** Element info: {Using\u003dxpath, value\u003d(//*[name()\u003d\u0027svg\u0027]/*[name()\u003d\u0027g\u0027]//*[name()\u003d\u0027path\u0027])[7]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\n\tat com.qwinix.entaly.qa.steps.Radialgraphzoom2steps.radial_fetchdata(Radialgraphzoom2steps.java:89)\n\tat com.qwinix.entaly.qa.stepdefinitions.Radialgraphzoom2stepdef.i_should_able_to_fetch_all_the_data_in_radial_chart(Radialgraphzoom2stepdef.java:19)\n\tat ✽.Then I should able to fetch all the data in radial chart(radialgraph.feature:13)\n",
  "status": "failed"
});
formatter.write("Current Page URL is http://gitviz.qwinix.net/singleUserNCommits/shashikirans");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 186917135,
  "status": "passed"
});
});
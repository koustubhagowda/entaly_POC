$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ZoomOneGraphs.feature");
formatter.feature({
  "line": 2,
  "name": "graph automate",
  "description": "",
  "id": "graph-automate",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@entaly_zoom_one"
    }
  ]
});
formatter.before({
  "duration": 4295697813,
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
  "location": "LoginPageSteps.i_am_on_entaly_website()"
});
formatter.result({
  "duration": 49766893668,
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
  "location": "LoginPageSteps.i_enter_valid_login_crediential_for_click_on_SignIn(String,String)"
});
formatter.result({
  "duration": 30620341,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027QWINIX-WIN\u0027, ip: \u0027192.168.125.2\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\KOUSTU~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 67a68b5fbba6e1e62e1e26157dceb22d\n*** Element info: {Using\u003dxpath, value\u003d//button[contains(text(),\u0027Login\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.qwinix.entaly.qa.steps.UserSteps.signIn(UserSteps.java:33)\r\n\tat com.qwinix.entaly.qa.stepdefinitions.LoginPageSteps.i_enter_valid_login_crediential_for_click_on_SignIn(LoginPageSteps.java:19)\r\n\tat ✽.When I enter valid login crediential for \"qwinix@yopmail.com\" \u0026 \"Qwinix123!\" \u0026 click on SignIn(ZoomOneGraphs.feature:6)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 9,
  "name": "bargraph automating",
  "description": "",
  "id": "graph-automate;bargraph-automating",
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
  "name": "Im on dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I navigate on bargraph",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should able to fetch the data with in bargraph",
  "keyword": "Then "
});
formatter.match({
  "location": "BarGraphStepDefinitionsZoomOne.im_on_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BarGraphStepDefinitionsZoomOne.i_navigate_on_bargraph()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BarGraphStepDefinitionsZoomOne.i_should_able_to_fetch_the_data_with_in_bargraph()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 908493453,
  "status": "passed"
});
formatter.before({
  "duration": 2717997676,
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
  "location": "LoginPageSteps.i_am_on_entaly_website()"
});

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountPage.feature");
formatter.feature({
  "line": 3,
  "name": "To test my cucumber test is running",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.background({
  "line": 6,
  "name": "User navigates to Company home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "the user opens the chrome page",
  "keyword": "Given "
});
formatter.match({
  "location": "homestepDefination.setup()"
});
formatter.result({
  "duration": 14211843913,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "cucumber setup",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running;cucumber-setup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "the user navigate to the salesforce page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user login in as \u0027Smoke test ae smoke\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "the user views the page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the user clicks the account tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user create a new advertiser account",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "the user views the page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user views the page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user views the page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "the user views the page",
  "keyword": "And "
});
formatter.match({
  "location": "homestepDefination.salesforceurl()"
});
formatter.result({
  "duration": 5593427680,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Smoke test ae smoke",
      "offset": 22
    }
  ],
  "location": "homestepDefination.salesforceuser(String)"
});
formatter.result({
  "duration": 247082347,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d64.0.3282.140)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027CON-GONES\u0027, ip: \u002710.11.49.200\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.33.506120 (e3e53437346286..., userDataDir: C:\\Users\\1114813\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 64.0.3282.140, webStorageEnabled: true}\nSession ID: 225fe267b485708e143e97dc01d4e9d6\n*** Element info: {Using\u003did, value\u003duserNavLabel}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat Pages.BasePage.click(BasePage.java:28)\r\n\tat Pages.LoginPage.loginAsAdmin(LoginPage.java:60)\r\n\tat stepDefination.homestepDefination.salesforceuser(homestepDefination.java:96)\r\n\tat ✽.Given the user login in as \u0027Smoke test ae smoke\u0027(AccountPage.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "homestepDefination.sleep()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homestepDefination.loginsalesforce()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homestepDefination.createadvertiser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homestepDefination.sleep()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homestepDefination.sleep()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homestepDefination.sleep()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homestepDefination.sleep()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Agencyaccount.feature");
formatter.feature({
  "line": 3,
  "name": "To test my cucumber test is running",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.background({
  "line": 6,
  "name": "User navigates to Company home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "the user opens the chrome page",
  "keyword": "Given "
});
formatter.match({
  "location": "homestepDefination.setup()"
});

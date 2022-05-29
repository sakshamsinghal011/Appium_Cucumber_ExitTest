$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestActionBar.feature");
formatter.feature({
  "line": 2,
  "name": "Test The functionality of Action Bar",
  "description": "",
  "id": "test-the-functionality-of-action-bar",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tau"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Test The functionality of action bar Mechanics",
  "description": "",
  "id": "test-the-functionality-of-action-bar;test-the-functionality-of-action-bar-mechanics",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tau1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on api demos application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "press on api demos app",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "press on app",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "press on action bar",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "press on action bar Mechanics",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "TestActionBarStep.user_is_on_api_demos_application()"
});
formatter.result({
  "duration": 103205100,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.press_on_api_demos_app()"
});
formatter.result({
  "duration": 9341757000,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.press_on_app()"
});
formatter.result({
  "duration": 22013779000,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.press_on_action_bar()"
});
formatter.result({
  "duration": 21315008800,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.press_on_action_bar_Mechanics()"
});
formatter.result({
  "duration": 21210833300,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.validate_the_outcomes()"
});
formatter.result({
  "duration": 111100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Test The functionality of action bar Tabs",
  "description": "",
  "id": "test-the-functionality-of-action-bar;test-the-functionality-of-action-bar-tabs",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@tau2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user is on api demos application",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "press on api demos app",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "press on app",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "press on action bar",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "press on action bar Tabs",
  "keyword": "And "
});
formatter.match({
  "location": "TestActionBarStep.user_is_on_api_demos_application()"
});
formatter.result({
  "duration": 44900,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.press_on_api_demos_app()"
});
formatter.result({
  "duration": 8774281400,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.press_on_app()"
});
formatter.result({
  "duration": 21954888900,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.press_on_action_bar()"
});
formatter.result({
  "duration": 21313897300,
  "status": "passed"
});
formatter.match({
  "location": "TestActionBarStep.press_on_action_bar_Tabs()"
});
formatter.result({
  "duration": 39683600,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not proxy command to the remote server. Original error: socket hang up\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027IN-PG02P4WW\u0027, ip: \u0027192.168.1.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.1\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:/Users/sakshamsinghal/Dow..., appActivity: io.appium.android.apis.ApiD..., appPackage: io.appium.android.apis, databaseEnabled: false, desired: {app: C:/Users/sakshamsinghal/Dow..., appActivity: io.appium.android.apis.ApiD..., appPackage: io.appium.android.apis, deviceName: Android, platformName: android, platformVersion: 8.1}, deviceApiLevel: 27, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 420, deviceScreenSize: 1080x1920, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 8.1.0, statBarHeight: 63, takesScreenshot: true, viewportRect: {height: 1731, left: 0, top: 63, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: 171067ea-cbe7-42e2-a09f-27ce01b2c3e2\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.TextView[@content-desc\u003d\"Action Bar Tabs\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat screens.TestActionBarPage.actionbartab(TestActionBarPage.java:37)\r\n\tat StepDefinitions.TestActionBarStep.press_on_action_bar_Tabs(TestActionBarStep.java:64)\r\n\tat ✽.And press on action bar Tabs(TestActionBar.feature:21)\r\n",
  "status": "failed"
});
});
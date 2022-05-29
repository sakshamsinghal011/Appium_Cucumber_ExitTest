package base;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utility.Screenshots;



public class  ScreenBase {
public static ExtentReports extent;
public static ExtentTest extentTest;
public static Logger log = Logger.getLogger(ScreenBase.class);
public  static AppiumDriver<MobileElement> wd=null;
protected static AppiumDriverLocalService se ;

@BeforeSuite
public void setExtent() {
extent = new ExtentReports("./Reports/ExtentReport.html");
}

@BeforeSuite
public void logTest() {
PropertyConfigurator.configure("./Resources/log4j.properties");
}



public static void startAppium() {
se=AppiumDriverLocalService.buildDefaultService();
se.start();
}
	
	
	
	public  static void setup() {
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.1");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("app", "C:/Users/sakshamsinghal/Downloads/ApiDemos-debug.apk");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		capabilities.setCapability("deviceName", "Android");
		
		
		try {
			
			
			wd=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

@BeforeMethod
public void startTest(Method method) {
String testName = method.getName();
extentTest = extent.startTest(method.getName());	
log.info("\n *********************** \n Operation " + testName + " has started \n *******************************\n");	



}
@AfterMethod
public void endtest() {
extent.endTest(extentTest);
}
@AfterMethod()
public void attachScreenshot(ITestResult result) {



if (result.getStatus() == ITestResult.FAILURE) {
String scrPath = Screenshots.captureScreenshot(wd, result.getName());
extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(scrPath));
}
}



//Report Ended
@AfterSuite
public void endReport() {
extent.flush();
extent.close();
}
@AfterMethod
public void endLog(Method method) {
String testName = method.getName();
log.info("\n *********************** \n Operation " + testName + " has ended \n *******************************\n ");
}	
	
	
	
	
}
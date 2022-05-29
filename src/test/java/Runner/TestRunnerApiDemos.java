package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/Feature", glue = "StepDefinitions" , tags = { "@tau" },plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true)



public class TestRunnerApiDemos extends AbstractTestNGCucumberTests {
	
//	public static AppiumDriver<MobileElement> wd = null;
//	public static ExtentReports extent;
//	public static ExtentTest extentTest;
//
//
//
//	static Logger log = Logger.getLogger(ScreenBase.class);
//
//	//For report
//	@BeforeSuite
//	public void setExtent() {
//	extent = new ExtentReports("./Reports/ExtentReport.html");
//	}
//
//
//
//	//  For logger configuration
//	@BeforeSuite
//	public void logTest() {
//	PropertyConfigurator.configure("./Resources/log4j.properties");
//	}
//
//
//
//
//
//	//  Reporting started
//	@BeforeMethod
//	public void startTest(Method method) {
//	String testName = method.getName();
//	extentTest = extent.startTest(testName);
//
//	// Logger started
//	log.info("operation " + testName + " has started");
//
//
//
//	}
//
//
//
//
//	//Logger ended
//	@AfterMethod
//	public void endLog(Method method) {
//	String testName = method.getName();
//	log.info("operation" + testName + " has ended");
//
//
//
//	}
//
//
//
//	//ScreenShots taken for failure
//	@AfterMethod()
//	public void screenshot(ITestResult result) {
//	if (result.getStatus() == ITestResult.FAILURE) {
//	String scrpath = Screenshots.captureScreenshot(wd, result.getName());
//	extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(scrpath));
//	}
//	}
//	//  Reporting at test end.
//	@AfterMethod
//	public void endTest() {
//	extent.endTest(extentTest);
//
//
//
//	}
//	//  Reporting closed here
//	@AfterSuite
//	public void endExtent() {
//	extent.flush();
//	extent.close();
//	}
//
//
//
}
//

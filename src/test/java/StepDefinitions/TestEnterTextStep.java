package StepDefinitions;

import Runner.TestRunnerApiDemos;
import base.ScreenBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import screens.TestEnterTextPage;



public class TestEnterTextStep extends ScreenBase {
	public static AppiumDriverLocalService se;
	TestRunnerApiDemos rn=new TestRunnerApiDemos();
	
	
	
	

@Given("^user click on api demos app$")
public void user_click_on_api_demos_app() throws Throwable {
	se = AppiumDriverLocalService.buildDefaultService();
	se.start();
	//rn.log.info("*************** server started ***************");
ScreenBase.setup();
    
}

@Given("^click on text$")
public void click_on_text() throws Throwable {
	TestEnterTextPage firstclick=new TestEnterTextPage(wd);
    firstclick.text();
		Thread.sleep(20000);
   
}

@Given("^click on key event text$")
public void click_on_key_event_text() throws Throwable {
	TestEnterTextPage secondclick=new TestEnterTextPage(wd);
    secondclick.keyeventText();
		Thread.sleep(20000);
    
}

@Given("^enter any key \"([^\"]*)\"$")
public void enter_any_key(String arg1) throws Throwable {
	TestEnterTextPage Third=new TestEnterTextPage(wd);
    Third.enterkey(arg1);
    Thread.sleep(20000);
    
   
}

@Then("^click on clear$")
public void click_on_clear() throws Throwable {
	TestEnterTextPage fifthclick=new TestEnterTextPage(wd);
    fifthclick.clear();
		Thread.sleep(20000);
   
}


	
	
	

}

package StepDefinitions;

import Runner.TestRunnerApiDemos;
import base.ScreenBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import screens.TestActionBarPage;
import screens.TestHideShowPage;

public class TestActionBarStep extends ScreenBase {
	public static AppiumDriverLocalService se;
	TestRunnerApiDemos rn=new TestRunnerApiDemos();

@Given("^user is on api demos application$")
public void user_is_on_api_demos_application() throws Throwable {
  
}

@Given("^press on api demos app$")
public void press_on_api_demos_app() throws Throwable {
	//se = AppiumDriverLocalService.buildDefaultService();
	//se.start();
	//rn.log.info("*************** server started ***************");
ScreenBase.setup();
   
}

@Given("^press on app$")
public void press_on_app() throws Throwable {
	TestActionBarPage firstclick=new TestActionBarPage(wd);
    firstclick.app();
		Thread.sleep(20000);
    
}

@Given("^press on action bar$")
public void press_on_action_bar() throws Throwable {
	TestActionBarPage firstclick=new TestActionBarPage(wd);
    firstclick.actionbar();
		Thread.sleep(20000);
    
}

@Given("^press on action bar Mechanics$")
public void press_on_action_bar_Mechanics() throws Throwable {
	TestActionBarPage firstclick=new TestActionBarPage(wd);
	Thread.sleep(10000);
    firstclick.actionbarmechanics();
		Thread.sleep(20000);
    
}

@Then("^validate the outcomes$")
public void validate_the_outcomes() throws Throwable {
//	TestActionBarPage verify= new TestActionBarPage(wd);
//	verify.check();
//   
//}
}

@Given("^press on action bar Tabs$")
public void press_on_action_bar_Tabs() throws Throwable {
	TestActionBarPage firstclick=new TestActionBarPage(wd);
	Thread.sleep(10000);
    firstclick.actionbartab();
		Thread.sleep(20000);
   
}

@Then("^validate the resultant outcomes$")
public void validate_the_resultant_outcomes() throws Throwable {
//	TestActionBarPage verify= new TestActionBarPage(wd);
//	verify.check();
	
   
}


}

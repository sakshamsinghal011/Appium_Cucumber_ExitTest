package StepDefinitions;

import Runner.TestRunnerApiDemos;
import base.ScreenBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import screens.TestHideShowPage;


public class TestHideShowStep extends ScreenBase {
	//public static AppiumDriverLocalService se;
	TestRunnerApiDemos rn=new TestRunnerApiDemos();

@Given("^user is on api demos app$")
public void user_is_on_api_demos_app() throws Throwable {
	
   
}

@When("^click on api demos app$")
public void click_on_api_demos_app() throws Throwable {
//	se = AppiumDriverLocalService.buildDefaultService();
//	se.start();
	//rn.log.info("*************** server started ***************");
ScreenBase.setup();
}

@When("^click on Animation$")
public void click_on_Animation() throws Throwable {
	TestHideShowPage firstclick=new TestHideShowPage(wd);
    firstclick.animation();
		Thread.sleep(2000);
	

}
    

@When("^click on hide-show animation$")
public void click_on_hide_show_animation() throws Throwable {
	TestHideShowPage Secondclick=new TestHideShowPage(wd);
    Secondclick.hideshowanimation();
		Thread.sleep(2000);
	
	
	
   
}

@When("^click on zero,one two,three$")
public void click_on_zero_one_two_three() throws Throwable {
	TestHideShowPage Thirdclick=new TestHideShowPage(wd);
    Thirdclick.zero();
    Thread.sleep(2000);
//    
//    Thirdclick.one();
//    Thread.sleep(20000);
//    
    
    Thirdclick.two();
    Thread.sleep(2000);
//    
//    Thirdclick.three();
//		Thread.sleep(20000);
//	

}
    

@Then("^check the buttons are hide$")
public void check_the_buttons_are_hide() throws Throwable {
	TestHideShowPage verify= new TestHideShowPage(wd);
	verify.check();
	

	
    
}

@Then("^click on show button$")
public void click_on_show_button() throws Throwable {
	TestHideShowPage Fourthclick=new TestHideShowPage(wd);
    Fourthclick.show();
	
}

//@Then("^check hide buttons are shown now$")
//public void check_hide_buttons_are_shown_now() throws Throwable {
//	TestHideShowPage verify= new TestHideShowPage(wd);
//			verify.check();
//  
//}



}

package StepDefinitions;

import base.ScreenBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.TestDateTimePage;

public class TestDateTimeStep extends ScreenBase {

@Given("^API demos app is open$")
public void api_demos_app_is_open() throws Throwable {
	
	// se = AppiumDriverLocalService.buildDefaultService();
	// se.start();
	//rn.log.info("*************** server started ***************");
	ScreenBase.setup();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	
	
}
    


@When("^press on Views$")
public void press_on_Views() throws Throwable {
	TestDateTimePage HitView=new TestDateTimePage(wd);
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	HitView.View();
	//Thread.sleep(20000);

   
}

@When("^press on Date Widgets$")
public void press_on_Date_Widgets() throws Throwable {
	TestDateTimePage HitDateWidgets=new TestDateTimePage(wd);
	HitDateWidgets.DateWidgets();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	//Thread.sleep(20000);
}

@When("^press on Dialog$")
public void press_on_Dialog() throws Throwable {
	TestDateTimePage HitDialog=new TestDateTimePage(wd);
	HitDialog.Dialog();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	//Thread.sleep(20000);
}
  


@When("^press on Change the Date$")
public void press_on_Change_the_Date() throws Throwable {
	TestDateTimePage HitDate=new TestDateTimePage(wd);
	HitDate.ChangeDate();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	//Thread.sleep(20000);
    
}

@When("^Change the Date$")
public void change_the_Date() throws Throwable {
	TestDateTimePage Date=new TestDateTimePage(wd);
	Date.SetDate();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	//Thread.sleep(20000);
}

@Then("^Verify the changed date$")
public void verify_the_changed_date() throws Throwable {
	TestDateTimePage CheckDate=new TestDateTimePage(wd);
	CheckDate.VerifyDate();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	//Thread.sleep(2000);
   
}

@When("^Click on Change the Time$")
public void click_on_Change_the_Time() throws Throwable {
	TestDateTimePage HitTime=new TestDateTimePage(wd);
	HitTime.ChangeTime();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	//Thread.sleep(2000);
}

@When("^Change the Time$")
public void change_the_Time() throws Throwable {
	TestDateTimePage Time=new TestDateTimePage(wd);
	Time.SetTime();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	//Thread.sleep(2000);
    
}

@Then("^Verify the changed time$")
public void verify_the_changed_time() throws Throwable {
	TestDateTimePage CheckTime=new TestDateTimePage(wd);
	CheckTime.VerifyTime();
	String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
	log.info("***************" +nameofCurrMethod+ "***************");
	//Thread.sleep(2000);
   
}

}

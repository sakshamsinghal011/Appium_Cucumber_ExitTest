package screens;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestHideShowPage {
	public static AppiumDriver<MobileElement> wd = null;
	
	
	By clickanimation=By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]");
	By clickhideshowanimation=By.xpath("//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]");
	By clickZero=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]");
	By clickOne=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]");
	By clicktwo=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]");
	//By clickThree=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[4]");
	By clickShow=By.id("io.appium.android.apis:id/addNewButton");
	
	

	public TestHideShowPage(AppiumDriver<MobileElement> wd) {
	this.wd=wd;
	}

	public void animation() {
	wd.findElement(clickanimation).click();
	}

	public void hideshowanimation() {
	wd.findElement(clickhideshowanimation).click();
	}

	public void zero() {
	wd.findElement(clickZero).click();
	}
//	public void one() {
//		wd.findElement(clickOne).click();
//	}
	public void two() {
		wd.findElement(clickZero).click();
	}
//	public void three() {
//		wd.findElement(clickThree).click();
//	}
	public void show() {
		wd.findElement(clickShow).click();
	}
		
	public void  check() {
		
		
		System.out.println(wd.findElement(clickOne).isDisplayed());
	}	
	
	
	
	
  
    	
    	
    	
    
	
	

}

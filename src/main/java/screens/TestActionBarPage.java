package screens;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestActionBarPage {
	public static AppiumDriver<MobileElement> wd = null;
	By clickapp=By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
	By clickactionbar=By.xpath("//android.widget.TextView[@content-desc=\"Action Bar\"]");
	By clickactionbarmechanics=By.xpath("//android.widget.TextView[@content-desc=\"Action Bar Mechanics\"]");
	By clickactionbartab=By.xpath("//android.widget.TextView[@content-desc=\"Action Bar Usage\"]");
	
	
	
	

	public TestActionBarPage(AppiumDriver<MobileElement> wd) {
	this.wd=wd;
	}

	public void app() {
	wd.findElement(clickapp).click();
	}

	public void actionbar() {
	wd.findElement(clickactionbar).click();
	}

	public void actionbarmechanics() {
	wd.findElement(clickactionbarmechanics).click();
	}
	
	public void actionbartab() {
		System.out.println("1111111111111111111111111111111111111");
		wd.findElement(clickactionbartab).click();
		}
	
//     public void  check() {
//		
//		
//		System.out.println(wd.findElement(clickactionbartab).isDisplayed());
//	}


}

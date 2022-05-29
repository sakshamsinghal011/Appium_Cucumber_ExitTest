package screens;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestEnterTextPage {
	public static AppiumDriver<MobileElement> wd = null;
	By clicktext=By.xpath("//android.widget.TextView[@content-desc=\"Text\"]");
	By clickkeyeventText=By.xpath("//android.widget.TextView[@content-desc=\"KeyEventText\"]");
	By enteranykey=By.id("io.appium.android.apis:id/text");
	By clickclear=By.id("io.appium.android.apis:id/text");
	
	
	
	

	public TestEnterTextPage(AppiumDriver<MobileElement> wd) {
	this.wd=wd;
	}

	public void text() {
	wd.findElement(clicktext).click();
	}

	public void keyeventText() {
	wd.findElement(clickkeyeventText).click();
	}

	public void enterkey(String text ) {
	wd.findElement(enteranykey).sendKeys(text);
	}
	
	public void clear() {
		wd.findElement(clickclear).click();
		}

}

package screens;

import org.openqa.selenium.By;
import org.testng.Assert;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class TestDateTimePage {

public static AppiumDriver<MobileElement> wd = null;
By ClickViews = By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
By ClickDateWidgets = By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]");
By ClickDialog = By.xpath("//android.widget.TextView[@content-desc=\"1. Dialog\"]");
By ClickChangeDate = By.xpath("//android.widget.Button[@content-desc=\"change the date\"]");
//By ClickArrow = By.xpath("android:id/month_view");

//change date on 1st june
By ClickDate = By.xpath("//android.view.View[@content-desc=\"31 May 2022\"]");
By ClickOkDate = By.id("android:id/button1");
By ClickChangeTime = By.xpath("//android.widget.Button[@content-desc=\"change the time\"]");
By ClickEleven = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"11\"]");
By ClickFifty = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"50\"]");
By ClickPM = By.id("android:id/pm_label");
By ClickOkTime = By.id("android:id/button1");
By TimeVerify = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");

//change xpath for verification also
By DateVerify = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");





public TestDateTimePage(AppiumDriver<MobileElement> wd) {
this.wd=wd;
}




public void View() {
wd.findElement(ClickViews).click();
}




public void DateWidgets() {
wd.findElement(ClickDateWidgets).click();
}




public void Dialog() {
wd.findElement(ClickDialog).click();
// System.out.println(wd.findElement(ClickDialog).isDisplayed());
// System.out.println("Dialog");
}

public void ChangeDate() {
wd.findElement(ClickChangeDate).click();
}

public void SetDate() {
//wd.findElement(ClickArrow).click();
wd.findElement(ClickDate).click();
wd.findElement(ClickOkDate).click();
}


public void ChangeTime() {
wd.findElement(ClickChangeTime).click();
// System.out.println(wd.findElement(ClickChangeTime).isDisplayed());
// System.out.println("time");
}

public void SetTime() {
wd.findElement(ClickEleven).click();
wd.findElement(ClickFifty).click();
wd.findElement(ClickPM).click();
wd.findElement(ClickOkTime).click();
}

public void VerifyDate() {
System.out.println("ssssssssssssssssssssss");
Assert.assertEquals(wd.findElement(DateVerify).isDisplayed(), true);
System.out.println("rrrrrrrrrrrrrrrrrrrrrr");
}

public void VerifyTime() {
System.out.println("ssssssssssssssssssssss");
Assert.assertEquals(wd.findElement(TimeVerify).isDisplayed(), true);
System.out.println("rrrrrrrrrrrrrrrrrrrrrr");
}


}
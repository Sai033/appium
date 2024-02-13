package Sample;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Practice {
public static void main(String[] args) throws Exception {
	DesiredCapabilities dc=new DesiredCapabilities();
	
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
 
	
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver d=new AndroidDriver(url,dc);
	Dimension size = d.manage().window().getSize();
   System.out.println("width="+size.getWidth());
   System.out.println("width="+size.getHeight());
	// Define starting and ending points for the swipe-up
	int startX = size.width / 2;
	int startY = (int) (size.height * 0.8);
	int endY = (int) (size.height * 0.2);
    Thread.sleep(3000);
   TouchAction action=new TouchAction(d);
   action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
   .moveTo(PointOption.point(startX, endY)).release().perform();
      System.out.println("completed");   
	WebElement a=d.findElement(By.id("com.android.systemui:id/passwordEntry"));
	a.sendKeys("0336");	
	Thread.sleep(2000);

	d.pressKey(new KeyEvent(AndroidKey.ENTER));
	
	
	
	
}

}
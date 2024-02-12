package Sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Youtube {
	public static void main(String[] args) throws Exception {
		 DesiredCapabilities dc = new DesiredCapabilities();
	     dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	     dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	  
	     URL url=new URL("http://127.0.0.1:4723/wd/hub");
	     AndroidDriver d=new AndroidDriver(url,dc);
	     Thread.sleep(3000);
	     d.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"Settings\"])[1]")).click();
	     Thread.sleep(2000);
	     d.findElement(By.xpath("(//android.widget.RelativeLayout[@resource-id=\"com.android.settings:id/text_frame\"])[5]")).click();
	     WebElement z=d.findElement(By.xpath("//android.widget.SeekBar[@content-desc=\"Media volume\"]"));
	     TouchAction action=new TouchAction((MobileDriver)d);
	     action.longPress(ElementOption.element(z)).moveTo(ElementOption.element(z,100, 100)).release().perform();
	     
	     
	}

}

package Sample;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddingAppintoVirtualDevice {
public static void main(String[] args) throws Exception {
	 DesiredCapabilities dc = new DesiredCapabilities();
     dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
     dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
     dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\smart\\Documents\\perch.apk");
     URL url=new URL("http://127.0.0.1:4723/wd/hub");
     AndroidDriver d=new AndroidDriver(url,dc);
     
     d.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\" and @class=\"android.widget.TextView\"]")).click();
     Thread.sleep(2000);
     d.findElement(By.xpath("//android.widget.EditText[@text=\"Your Email Address\" and @class=\"android.widget.EditText\"]")).sendKeys("saikrishna.jakkala@smartgig.tech");
     d.findElement(By.xpath("//android.widget.TextView[@text=\"Sign In\" and @class=\"android.widget.TextView\"]")).click();
     
     
   
}
}

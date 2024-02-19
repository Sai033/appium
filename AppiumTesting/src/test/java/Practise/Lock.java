package Practise;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Lock {
public static void main(String[] args) throws Exception {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver d=new AndroidDriver(url,dc);
	
    Dimension di=d.manage().window().getSize();
    int x=di.getWidth()/2;
    int y=(int) (di.getHeight()*0.8);
    int z=di.getHeight()/2;
    TouchAction acts=new TouchAction(d);
    acts.press(PointOption.point(x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(x, z)).release().perform();
    Thread.sleep(3000);
    d.findElementById("com.android.systemui:id/passwordEntry").sendKeys("0336");
    d.pressKey(new KeyEvent(AndroidKey.ENTER));
	
}
}

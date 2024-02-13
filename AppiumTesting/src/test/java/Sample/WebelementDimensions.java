package Sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class WebelementDimensions {
public static void main(String[] args) throws Exception {
	 DesiredCapabilities dc = new DesiredCapabilities();
     dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
     dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
    
     URL url=new URL("http://127.0.0.1:4723/wd/hub");
     AndroidDriver d=new AndroidDriver(url,dc);
     Dimension di=d.manage().window().getSize();
     int startX = di.width / 2;
     int startY = (int) (di.height * 0.8);
     int endY = (int) (di.height * 0.2);
     TouchAction act=new TouchAction(d);
     act.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
     .moveTo(PointOption.point(startX, endY)).release().perform();
    Thread.sleep(3000);
    d.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"Settings\"])[1]")).click();
    Thread.sleep(2000);
    int startX1 = di.width / 2;
    int startY1 = (int) (di.height * 0.8);
    int endY1 = (int) (di.height/2);
    act.press(PointOption.point(startX1, startY1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
    .moveTo(PointOption.point(startX1, endY1)).release().perform();
   Thread.sleep(3000);
   d.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Sound & vibration\"]")).click();
    Thread.sleep(3000);
    WebElement a=d.findElement(By.xpath("//android.widget.SeekBar[@content-desc=\"Media volume\"]"));
    Dimension d1=a.getSize();
    act.press(PointOption.point(295, 737)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
    .moveTo(PointOption.point(1000, 737)).release().perform();
  
    
}
}

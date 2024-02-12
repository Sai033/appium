package Sample;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;




public class LaunchingChrome {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smart\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 DesiredCapabilities dc = new DesiredCapabilities();
	       dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	       dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	       dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	       
	        ChromeOptions chromeOptions = new ChromeOptions();
	        dc.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	       URL url=new URL("http://127.0.0.1:4723/wd/hub");
	       AndroidDriver d=new AndroidDriver(url,dc);
	       d.get("https://www.facebook.com/");
	       
		
		
	}

}

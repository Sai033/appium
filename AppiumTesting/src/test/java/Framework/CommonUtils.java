// CommonUtils.java - The utility class for creating and managing the AndroidDriver instance
package Framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CommonUtils {
    private static AndroidDriver driver; // Static variable to hold the driver instance

    public static AndroidDriver getAndroidDriver() {
        if (driver == null) {
            // Create the AndroidDriver instance if it doesn't exist
            driver = initializeAndroidDriver();
        }
        return driver;
    }

    private static AndroidDriver initializeAndroidDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
      

        try {
            // Initialize and return the AndroidDriver
            return new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize AndroidDriver");
        }
    }
}

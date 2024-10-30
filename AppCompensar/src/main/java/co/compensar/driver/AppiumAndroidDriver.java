package co.compensar.driver;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.MobileElement;

public class AppiumAndroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver suNavegador() {
        try {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("noReset", true);
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "12");
            caps.setCapability("deviceName", "M2007J20CG");
            caps.setCapability("udid", "f18c5a97");
            caps.setCapability("appPackage", "com.compensar.bienestaralacarta");
            caps.setCapability("appActivity", "com.plataforma_compensar_flutter.MainActivity");
            caps.setCapability("automationName", "UiAutomator2");


            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723"), caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }

    public io.appium.java_client.AppiumDriver<MobileElement> onDriver() {
        return driver;
    }

}

package com.example.app.drivers;

import com.example.app.properties.AppiumProperties;
import com.example.app.properties.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDriverInit {

  public static AndroidDriver<AndroidElement> driver;

  public static void initialize() {
    //load config
    PropertiesReader propertiesReader = new PropertiesReader();
    AppiumProperties properties = propertiesReader.readProperties();

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
    caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
    caps.setCapability(MobileCapabilityType.APP, "/Users/hendrione/Code/APPS/app-debug_v.1.0.apk");
    //additional
    caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
    caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
//    String url = "http://localhost:4723/wd/hub";
    try {
      driver = new AndroidDriver<>(new URL(properties.getAppiumUrl()), caps);
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  public static void quit() {
    driver.quit();
  }

}

package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class CalculatorPage {

  public String getTitle() {
    By locator = MobileBy.xpath(
        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
    AndroidElement labelTitle = driver.findElement(locator);
    return labelTitle.getText();
  }

  public boolean checkHamburgerBtnAppear() {
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    AndroidElement hamburgerBtn = driver.findElement(locator);
    return hamburgerBtn.isDisplayed();
  }

}

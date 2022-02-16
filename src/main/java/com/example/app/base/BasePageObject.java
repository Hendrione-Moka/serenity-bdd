package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver() {
    return AndroidDriverInit.driver;
  }

  public AndroidElement findElement(By locator) {
    return getDriver().findElement(locator);
  }

  public void type(By locator, String text) {
    AndroidElement element = findElement(locator);
    element.clear();
    element.sendKeys(text);
  }

  public void click(By locator) {
    AndroidElement element = findElement(locator);
    element.click();
  }

}

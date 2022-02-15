package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

  public void inputUsername(String username) {
    By locator = MobileBy.id("username");
    AndroidElement element = getDriver().findElement(locator);
    element.clear();
    element.sendKeys(username);
  }

  public void inputPassword(String password) {
    By locator = MobileBy.id("password");
    AndroidElement element = getDriver().findElement(locator);
    element.clear();
    element.sendKeys(password);
  }

  public void clickLoginButton() {
    By locator = MobileBy.id("login");
    AndroidElement element = getDriver().findElement(locator);
    element.click();
  }

}

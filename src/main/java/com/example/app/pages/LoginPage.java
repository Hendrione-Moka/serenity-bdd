package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class LoginPage extends BasePageObject {

  public void inputUsername(String username) {
//    By locator = MobileBy.id("username");
//    AndroidElement element = getDriver().findElement(locator);
//    element.clear();
//    element.sendKeys(username);
    type(MobileBy.id("username"), username);
  }

  public void inputPassword(String password) {
//    By locator = MobileBy.id("password");
//    AndroidElement element = getDriver().findElement(locator);
//    element.clear();
//    element.sendKeys(password);
    type(MobileBy.id("password"), password);
  }

  public void clickLoginButton() {
//    By locator = MobileBy.id("login");
//    AndroidElement element = getDriver().findElement(locator);
//    element.click();
    click(MobileBy.id("login"));
  }

}

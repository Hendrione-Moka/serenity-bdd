package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage {

  public void inputUsername(String username) {
    By locator = MobileBy.id("username");
    AndroidElement tfUsername = driver.findElement(locator);
    tfUsername.clear();
    tfUsername.sendKeys(username);
  }

  public void inputPassword(String password) {
    By locator = MobileBy.id("password");
    AndroidElement tfPassword = driver.findElement(locator);
    tfPassword.clear();
    tfPassword.sendKeys(password);
  }

  public void clickLoginBtn() {
    By locator = MobileBy.id("login");
    AndroidElement btnLogin = driver.findElement(locator);
    btnLogin.click();
  }

}

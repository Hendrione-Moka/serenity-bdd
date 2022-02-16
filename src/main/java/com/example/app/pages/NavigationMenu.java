package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationMenu extends BasePageObject {

  public boolean checkHamburgerButtonDisplayed() {
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement element = getDriver().findElement(locator);
//    return element.isDisplayed();
    //explicit wait
    WebDriverWait wait = new WebDriverWait(getDriver(), 10, 1000);
    //casting
    AndroidElement element = (AndroidElement) wait.until(
        ExpectedConditions.presenceOfElementLocated(locator));
    return element.isDisplayed();
  }

  public void clickHamburgerButtonMenu() {
    click(MobileBy.AccessibilityId("Open navigation drawer"));
  }

  public void clickListMenu() {
    click(MobileBy.id("nav_list"));
  }

}

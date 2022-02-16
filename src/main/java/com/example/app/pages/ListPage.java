package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class ListPage extends BasePageObject {

  public void swipeUpList() {
//    TouchAction action = new TouchAction(getDriver());
//    AndroidElement containerList = findElement(MobileBy.id("recycler_view"));
//    //get coordinate
//    Point center = containerList.getCenter();
//    PointOption start = PointOption.point(center);
//    PointOption end = PointOption.point(center.getX(), center.getY() - 1000);
//    //builder action
//    action
//        .press(start)
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//        .moveTo(end)
//        .release()
//        .perform();

    AndroidElement element = findElement(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-30\"))"));
  }

}

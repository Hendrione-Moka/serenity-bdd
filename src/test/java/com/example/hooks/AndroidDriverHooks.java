package com.example.hooks;

import com.example.app.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AndroidDriverHooks {

  @Before(value = "@Android")
  public void initializeSession(){
    AndroidDriverInit.initialize();
  }

  @After(value = "@Android")
  public void destroySession(Scenario scenario){
    //screenshot
    if(scenario.isFailed()){
      TakesScreenshot screenshot = AndroidDriverInit.driver;
      byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);
      scenario.attach(imageByte, "image/png", "screenshot");
    }
    AndroidDriverInit.quit();
  }

}

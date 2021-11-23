package com.example.hooks;

import com.example.app.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHook {

  @Before(value = "@android")
  public void beforeScenario() {
    AndroidDriverInit.initialize();
  }

  @After(value = "@android")
  public void afterScenario() {
    AndroidDriverInit.quit();
  }

}

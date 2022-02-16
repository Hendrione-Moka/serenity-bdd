package com.example.hooks;

import com.example.app.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHooks {

  @Before(value = "@Android")
  public void initializeSession(){
    AndroidDriverInit.initialize();
  }

  @After(value = "@Android")
  public void destroySession(){
    AndroidDriverInit.quit();
  }

}

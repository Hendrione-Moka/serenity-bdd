package com.example.steps;

import io.cucumber.java.en.Then;

public class HomePageSteps {

  @Then("user successfully login")
  public void userSuccessfullyLogin() {
    //todo: adding assertions
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}

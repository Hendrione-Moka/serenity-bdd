package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

  private LoginPage loginPage = new LoginPage();

  @Given("user is on login page")
  public void userIsOnLoginPage() {
    //todo: write validation code
  }

  @When("user input username {string}")
  public void userInputUsername(String username) {
    loginPage.inputUsername(username);
  }

  @When("user input password {string}")
  public void userInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @When("user click button login")
  public void userClickButtonLogin() {
    loginPage.clickLoginButton();
  }

}

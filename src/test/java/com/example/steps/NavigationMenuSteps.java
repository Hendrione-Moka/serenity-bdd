package com.example.steps;

import com.example.app.pages.NavigationMenu;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class NavigationMenuSteps {

  private NavigationMenu navigationMenu = new NavigationMenu();

  @Then("user successfully login")
  public void userSuccessfullyLogin() {
    boolean result = navigationMenu.checkHamburgerButtonDisplayed();
    //JUnit Assertions
    Assertions.assertTrue(result);
  }

  @When("user go to list menu")
  public void userGoToListMenu() {
    navigationMenu.clickHamburgerButtonMenu();
    navigationMenu.clickListMenu();
  }
}

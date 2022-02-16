package com.example.steps;

import com.example.app.pages.ListPage;
import io.cucumber.java.en.When;

public class ListPageSteps {

  ListPage listPage = new ListPage();

  @When("user do scroll on list page")
  public void userDoScrollOnListPage() {
    listPage.swipeUpList();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}






@Android
Feature: Login

  Scenario: Verify user successfully login when input valid username and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    When user do scroll on list page

Feature: Scenario1
  Check error message shows up when invalid credentials are clicked

  @login
  Scenario: Error message shown on the login page when invalid credentials entered

    Given Open the app url
    When the user enters username "random" on the username text box
    And  the user enters password "sdfsf" on the password text box
    And the user clicks the LogIn button
    Then the invalid credentials error message "We didn't recognize the username or password you entered. Please try again." should be displayed

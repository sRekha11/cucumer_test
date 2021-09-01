Feature: SampleTest2
  Check error message shows up


  Scenario: Check error message "Error: Email address required"

    Given Open the app url
    When the user clicks on Forgot Password link
    And the user clicks on the Submit Button
    Then the error message "Error: Email address required" should be displayed


  Scenario: Check error message "Error: Invalid email address"

    Given Open the app url
    And the user is on the Forgot Password page
    When the user enters "abcd" on the text box
    And the user clicks on the Submit Button
    Then the invalid error message "Error: Invalid email address" should be displayed
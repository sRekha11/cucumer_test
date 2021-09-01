
Feature: Terms of Use

  Scenario: Check "Terms of Use" Page

    Given Open the app url
    When the Listener clicks on Terms of Use link at the bottom of the page
    Then verify the terms of use page url


  Scenario: Check "Terms of Use" page contents - Effective Date value

    Given Open the app url
    And the user is on the Terms of Use page
    Then today's date should be displayed next to the Effective as of field


  Scenario: Check "Terms of Use" page - Dropdown value

    Given Open the app url
    And the user is on the Terms of Use page
    When the Listener clicks on the Language drop on top right corner
    Then the dropdown values should be displayed
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sampleScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Sample feature",
  "description": "",
  "id": "sample-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Sample feature",
  "description": "",
  "id": "sample-feature;sample-feature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sampleScenariom"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open the app url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("scenario1.feature");
formatter.feature({
  "line": 1,
  "name": "Scenario1",
  "description": "Check error message shows up when invalid credentials are clicked",
  "id": "scenario1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Error message shown on the login page when invalid credentials entered",
  "description": "",
  "id": "scenario1;error-message-shown-on-the-login-page-when-invalid-credentials-entered",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open the app url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user enters username \"random\" on the username text box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user enters password \"sdfsf\" on the password text box",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks the LogIn button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the invalid credentials error message \"We didn\u0027t recognize the username or password you entered. Please try again.\" should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("scenario2.feature");
formatter.feature({
  "line": 1,
  "name": "SampleTest2",
  "description": "Check error message shows up",
  "id": "sampletest2",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Check error message \"Error: Email address required\"",
  "description": "",
  "id": "sampletest2;check-error-message-\"error:-email-address-required\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Open the app url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on Forgot Password link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user clicks on the Submit Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the error message \"Error: Email address required\" should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Check error message \"Error: Invalid email address\"",
  "description": "",
  "id": "sampletest2;check-error-message-\"error:-invalid-email-address\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Open the app url",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user is on the Forgot Password page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user enters \"abcd\" on the text box",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the user clicks on the Submit Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the invalid error message \"Error: Invalid email address\" should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("scenario3.feature");
formatter.feature({
  "line": 2,
  "name": "Terms of Use",
  "description": "",
  "id": "terms-of-use",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check \"Terms of Use\" Page",
  "description": "",
  "id": "terms-of-use;check-\"terms-of-use\"-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open the app url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the Listener clicks on Terms of Use link at the bottom of the page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify the terms of use page url",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "Check \"Terms of Use\" page contents - Effective Date value",
  "description": "",
  "id": "terms-of-use;check-\"terms-of-use\"-page-contents---effective-date-value",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Open the app url",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user is on the Terms of Use page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "today\u0027s date should be displayed next to the Effective as of field",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Check \"Terms of Use\" page - Dropdown value",
  "description": "",
  "id": "terms-of-use;check-\"terms-of-use\"-page---dropdown-value",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Open the app url",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user is on the Terms of Use page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the Listener clicks on the Language drop on top right corner",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the dropdown values should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
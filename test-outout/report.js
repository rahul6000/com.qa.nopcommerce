$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Test",
  "description": "",
  "id": "home-page-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Nop Commerce HomePage Test Scenario",
  "description": "",
  "id": "home-page-test;nop-commerce-homepage-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title home page is My Store",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logo image is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user inputs in search bar and click",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user hoover on computer label",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on excellent radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "exit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefinition.userIsOnHomePage()"
});
formatter.result({
  "duration": 8111337427,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.titleHomePageIsMyStore()"
});
formatter.result({
  "duration": 11776569,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.logoImageIsDisplayed()"
});
formatter.result({
  "duration": 114384321,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.userInputsInSearchBarAndClick()"
});
formatter.result({
  "duration": 3636445916,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.userHooverOnComputerLabel()"
});
formatter.result({
  "duration": 156609572,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.userClicksOnExcellentRadioButton()"
});
formatter.result({
  "duration": 167415516,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.exitTheBrowser()"
});
formatter.result({
  "duration": 221033173,
  "status": "passed"
});
});
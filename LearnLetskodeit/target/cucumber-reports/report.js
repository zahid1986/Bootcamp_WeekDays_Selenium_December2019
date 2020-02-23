$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/HomePage.feature");
formatter.feature({
  "name": "letskodeit",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "letskodeit Home Page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am in learnletskodeeit home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.Hook.I_am_in_learnletskodeeit_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check show button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Show button",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.HomePageStepDefination.i_click_on_Show_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.Hook.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});
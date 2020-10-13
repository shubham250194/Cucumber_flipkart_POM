$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/automation/Cucumber_Practice/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-feature;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user lands on homepage and verify the titile of the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginpageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 14823572100,
  "status": "passed"
});
formatter.match({
  "location": "loginpageSteps.user_login_with_valid_credentials()"
});
formatter.result({
  "duration": 497214600,
  "status": "passed"
});
formatter.match({
  "location": "loginpageSteps.user_lands_on_homepage()"
});
formatter.result({
  "duration": 12939200,
  "status": "passed"
});
});
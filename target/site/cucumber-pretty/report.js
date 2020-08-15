$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 2,
  "name": "MainPage Feature",
  "description": "",
  "id": "mainpage-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 8611632833,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSD.verifyTitle()"
});
formatter.result({
  "duration": 1088727641,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify minimum and maximum temperature",
  "description": "",
  "id": "mainpage-feature;verify-minimum-and-maximum-temperature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@home"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on today button on home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I get temperatures on home page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I get minimum temperatures on home page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I get maximum temperatures on home page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify minimum temperature on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I verify maximum temperature on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.clickTodayButton()"
});
formatter.result({
  "duration": 792038165,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.getTemperature()"
});
formatter.result({
  "duration": 207138763,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.getMinTemp()"
});
formatter.result({
  "duration": 233004,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.getMaxTemp()"
});
formatter.result({
  "duration": 93526,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyMinTemp()"
});
formatter.result({
  "duration": 45955,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyMaxTemp()"
});
formatter.result({
  "duration": 45475,
  "status": "passed"
});
formatter.after({
  "duration": 4547707396,
  "status": "passed"
});
});
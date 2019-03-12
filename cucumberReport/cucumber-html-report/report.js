$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/CognizantTestCode.feature");
formatter.feature({
  "line": 1,
  "name": "check url",
  "description": "",
  "id": "check-url",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "validating cognizant home page",
  "description": "",
  "id": "check-url;validating-cognizant-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "a User",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "hit the cognizant bank url",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "cognizant bank home page should get open",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "clicks on new account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "new account page should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "check-url;validating-cognizant-home-page;",
  "rows": [
    {
      "cells": [
        "TestNo"
      ],
      "line": 15,
      "id": "check-url;validating-cognizant-home-page;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 16,
      "id": "check-url;validating-cognizant-home-page;;2"
    },
    {
      "cells": [
        "2"
      ],
      "line": 17,
      "id": "check-url;validating-cognizant-home-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "set property",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "driver path",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.driver_path()"
});
formatter.result({
  "duration": 273130220,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "validating cognizant home page",
  "description": "",
  "id": "check-url;validating-cognizant-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "a User",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "hit the cognizant bank url",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "cognizant bank home page should get open",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "clicks on new account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "new account page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.a_User()"
});
formatter.result({
  "duration": 21900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.hit_the_cognizant_bank_url()"
});
formatter.result({
  "duration": 13952091042,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.cognizant_bank_home_page_should_get_open()"
});
formatter.result({
  "duration": 62184532,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.clicks_on_new_account()"
});
formatter.result({
  "duration": 332121550,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.new_account_page_should_be_displayed()"
});
formatter.result({
  "duration": 4197022776,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "set property",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "driver path",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.driver_path()"
});
formatter.result({
  "duration": 154430,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "validating cognizant home page",
  "description": "",
  "id": "check-url;validating-cognizant-home-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "a User",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "hit the cognizant bank url",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "cognizant bank home page should get open",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "clicks on new account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "new account page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.a_User()"
});
formatter.result({
  "duration": 38891,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.hit_the_cognizant_bank_url()"
});
formatter.result({
  "duration": 14171025962,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.cognizant_bank_home_page_should_get_open()"
});
formatter.result({
  "duration": 17871275,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.clicks_on_new_account()"
});
formatter.result({
  "duration": 271227590,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.new_account_page_should_be_displayed()"
});
formatter.result({
  "duration": 4229670674,
  "status": "passed"
});
});
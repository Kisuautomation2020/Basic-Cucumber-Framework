$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_Workspace/FreeCrmBDDFramework/src/main/java/Features/dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of Login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "shwetap",
        "shweta@123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 15254276600,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 15180600,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 158831500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 40972800,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 9532400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 24391100,
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id mainpanel\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027SHWETA\u0027, ip: \u0027192.168.0.24\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:982)\r\n\tat stepDefinitions.DealsStepWithMapDefinition.user_moves_to_new_contact_page(DealsStepWithMapDefinition.java:68)\r\n\tat ✽.Then user moves to new deal page(C:/Selenium_Workspace/FreeCrmBDDFramework/src/main/java/Features/dealsmap.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});
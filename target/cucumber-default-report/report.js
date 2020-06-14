$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EmergencyContact.feature");
formatter.feature({
  "name": "EmergencyContact",
  "description": "  Decription: As an admin I should be able to add employee Emergency Contacts by specifying",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add employee emergency contact",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory2"
    }
  ]
});
formatter.step({
  "name": "admin login successfully to Hrms Applicaiton",
  "keyword": "Given "
});
formatter.step({
  "name": "admin navigate to the PIM page and click on employee list",
  "keyword": "And "
});
formatter.step({
  "name": "admin search employee by id \"13389\" and click search",
  "keyword": "When "
});
formatter.step({
  "name": "admin click on employee name and the employee \"Farid Aryob\" is displayed successfully",
  "keyword": "And "
});
formatter.step({
  "name": "admin click on Emergency Contacts",
  "keyword": "When "
});
formatter.step({
  "name": "admin click on add",
  "keyword": "Then "
});
formatter.step({
  "name": "admin enters \"\u003cName\u003e\", \"\u003cRelationship\u003e\",\"\u003cMobilePhone\u003e\" ,\"\u003cWorkPhone\u003e\" and click save sucessfully",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Relationship",
        "MobilePhone",
        "WorkPhone"
      ]
    },
    {
      "cells": [
        "Sarmed Halabi",
        "Friend",
        "7031112220",
        "5713332221"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add employee emergency contact",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "admin login successfully to Hrms Applicaiton",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.ContactDetails.admin_login_successfully_to_Hrms_Applicaiton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin navigate to the PIM page and click on employee list",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.ContactDetails.admin_navigate_to_the_PIM_page_and_click_on_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin search employee by id \"13389\" and click search",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.ContactDetails.admin_search_employee_by_id_and_click_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin click on employee name and the employee \"Farid Aryob\" is displayed successfully",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.ContactDetails.admin_click_on_employee_name_and_the_employee_is_displayed_successfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin click on Emergency Contacts",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContact.admin_click_on_Emergency_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin click on add",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContact.admin_click_on_add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters \"Sarmed Halabi\", \"Friend\",\"7031112220\" ,\"5713332221\" and click save sucessfully",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContact.admin_enters_and_click_save_sucessfully(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add employee emergency contact");
formatter.after({
  "status": "passed"
});
});
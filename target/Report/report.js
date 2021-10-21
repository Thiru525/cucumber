$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddTariffPlan.feature");
formatter.feature({
  "name": "AddTariff plan flow validation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launche demo telecom application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_launche_demo_telecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click add tariff plan button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_click_add_tariff_plan_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Tariff plan details with 1 dimensional list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user fill all the fields by one dimensional list concept",
  "rows": [
    {
      "cells": [
        "500",
        "1200",
        "200",
        "50",
        "1",
        "2",
        "1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_fill_all_the_fields_by_one_dimensional_list_concept(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click  the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confirms the add plan",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_confirms_the_add_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the text is equals",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_verify_the_text_is_equals()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});
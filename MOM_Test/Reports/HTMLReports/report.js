$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/MOM.feature");
formatter.feature({
  "line": 1,
  "name": "Interview Testing Feature",
  "description": "",
  "id": "interview-testing-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "025 Contact Details - Validate Email Format",
  "description": "",
  "id": "interview-testing-feature;025-contact-details---validate-email-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Applicant Navigates to website \"https://public:Let$BeC001@bgp-qa.gds-gov.tech/\", Test_case \"025\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "He logs into BGP with CorpPass NRIC \"S1234567A\", Name \"Tan Ah Kow\", UEN \"BGPQEDEMO\", Role \"Acceptor\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "He selects \u0027Get New Grant\u0027 on the \u0027My Grants\u0027 dashboard to enter the Grant Picker",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "He clicks on a sector for your business Sector \"Education\", SubSector \"Early Childhood\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "He clicks on Development Area \"Upgrade key business areas, such as adopt technology, improve business processes or raise service standards\" button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "He clicks on Functional Area \"Innovation \u0026 Productivity\" button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "He clicks on \u0027Proceed\u0027 button to enter the form",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "He clicks on \"Yes\" in all Option in CHECK YOUR ELIGIBILITY form",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "He inputs Name \"025\", Job Title \"Manager\" , Contact No \"91234565\", Email \"hello@yahoo.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "He inputs Postal Code \"400032\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Verify Blk \"32\" Street \"EUNOS CRESCENT\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://public:Let$BeC001@bgp-qa.gds-gov.tech/",
      "offset": 32
    },
    {
      "val": "025",
      "offset": 92
    }
  ],
  "location": "StepDefinition.applicant_Navigates_to_website_Test_case(String,String)"
});
formatter.result({
  "duration": 4871163600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S1234567A",
      "offset": 37
    },
    {
      "val": "Tan Ah Kow",
      "offset": 55
    },
    {
      "val": "BGPQEDEMO",
      "offset": 73
    },
    {
      "val": "Acceptor",
      "offset": 91
    }
  ],
  "location": "StepDefinition.he_logs_into_BGP_with_CorpPass_NRIC_Name_Env_Role(String,String,String,String)"
});
formatter.result({
  "duration": 791109400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.he_selects_Get_New_Grant_on_the_My_Grants_dashboard_to_enter_the_Grant_Picker()"
});
formatter.result({
  "duration": 19737834900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Education",
      "offset": 48
    },
    {
      "val": "Early Childhood",
      "offset": 71
    }
  ],
  "location": "StepDefinition.he_clicks_on_a_sector_for_your_business_Sector_SubSector(String,String)"
});
formatter.result({
  "duration": 718494300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Upgrade key business areas, such as adopt technology, improve business processes or raise service standards",
      "offset": 31
    }
  ],
  "location": "StepDefinition.he_clicks_on_Development_Area_button(String)"
});
formatter.result({
  "duration": 113694200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Innovation \u0026 Productivity",
      "offset": 30
    }
  ],
  "location": "StepDefinition.he_clicks_on_Functional_Area_button(String)"
});
formatter.result({
  "duration": 190573800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.he_clicks_on_Proceed_button_to_enter_the_form()"
});
formatter.result({
  "duration": 3031179300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 14
    }
  ],
  "location": "StepDefinition.he_clicks_on_in_all_Option_in_CHECK_YOUR_ELIGIBILITY_form(String)"
});
formatter.result({
  "duration": 1957110200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "025",
      "offset": 16
    },
    {
      "val": "Manager",
      "offset": 33
    },
    {
      "val": "91234565",
      "offset": 56
    },
    {
      "val": "hello@yahoo.com",
      "offset": 74
    }
  ],
  "location": "StepDefinition.he_inputs_Name_Job_Title_Contact_No_Email(String,String,String,String)"
});
formatter.result({
  "duration": 930449800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400032",
      "offset": 23
    }
  ],
  "location": "StepDefinition.he_inputs_Postal_Code(String)"
});
formatter.result({
  "duration": 2098863700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 12
    },
    {
      "val": "EUNOS CRESCENT",
      "offset": 24
    }
  ],
  "location": "StepDefinition.verify_Blk_Street(String,String)"
});
formatter.result({
  "duration": 52645300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_Browser()"
});
formatter.result({
  "duration": 62370400,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature Files/Gmail_Compose.feature");
formatter.feature({
  "name": "Compose Function of Gmail",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Verify the compose function of Gmail",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launched the chrome browser and navigated to Gmail URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_launched_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Username",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if i navigated to Inbox Emails screen",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_verify_if_i_navigated_to_inbox_emails_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Compose button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_compose_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be displayed with Compose pop-up",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_be_displayed_with_compose_pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter To Email Address",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_enter_to_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Subject as \"Incubyte\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_enter_subject_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Body as \"Hello World\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_enter_body_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Send button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if mail is sent",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_verify_if_mail_is_sent()"
});
formatter.result({
  "status": "passed"
});
});
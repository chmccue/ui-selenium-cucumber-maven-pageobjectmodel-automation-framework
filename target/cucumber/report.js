$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contact.feature");
formatter.feature({
  "line": 2,
  "name": "Contact page",
  "description": "As a user\r\nI want to fill out contact page details\r\nSo I can test the contact functionality on the site",
  "id": "contact-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@contact"
    }
  ]
});
formatter.before({
  "duration": 85686,
  "status": "passed"
});
formatter.before({
  "duration": 614611,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Fill out contact page details",
  "description": "",
  "id": "contact-page;fill-out-contact-page-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I go to Contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I fill out the contact form",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I am able to submit the contact form",
  "keyword": "Then "
});
formatter.match({
  "location": "Contact_Steps.i_go_to_contact_page()"
});
formatter.result({
  "duration": 20299138100,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Steps.i_fill_out_contact_form()"
});
formatter.result({
  "duration": 524347297,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Steps.i_am_able_to_submit_contact_form()"
});
formatter.result({
  "duration": 16406420303,
  "status": "passed"
});
formatter.after({
  "duration": 68760,
  "status": "passed"
});
formatter.before({
  "duration": 30325,
  "status": "passed"
});
formatter.before({
  "duration": 282446,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Pressing submit without completing form",
  "description": "",
  "id": "contact-page;pressing-submit-without-completing-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I go to Contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I press submit button without filling in form",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I am not able to submit the contact form",
  "keyword": "Then "
});
formatter.match({
  "location": "Contact_Steps.i_go_to_contact_page()"
});
formatter.result({
  "duration": 3842710056,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Steps.i_press_submit_button_without_filling_in_form()"
});
formatter.result({
  "duration": 131510140,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Steps.i_am_not_able_to_submit_contact_form()"
});
formatter.result({
  "duration": 67579332,
  "status": "passed"
});
formatter.after({
  "duration": 19393,
  "status": "passed"
});
});
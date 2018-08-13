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
  "duration": 88154,
  "status": "passed"
});
formatter.before({
  "duration": 664330,
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
  "duration": 13460991960,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Steps.i_fill_out_contact_form()"
});
formatter.result({
  "duration": 503713583,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Steps.i_am_able_to_submit_contact_form()"
});
formatter.result({
  "duration": 37647488435,
  "status": "passed"
});
formatter.after({
  "duration": 57477,
  "status": "passed"
});
formatter.before({
  "duration": 45135,
  "status": "passed"
});
formatter.before({
  "duration": 267636,
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
  "duration": 13099409684,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Steps.i_press_submit_button_without_filling_in_form()"
});
formatter.result({
  "duration": 149103949,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Steps.i_am_not_able_to_submit_contact_form()"
});
formatter.result({
  "duration": 10081425178,
  "status": "passed"
});
formatter.after({
  "duration": 22920,
  "status": "passed"
});
formatter.uri("Navigation.feature");
formatter.feature({
  "line": 2,
  "name": "Navigate site",
  "description": "As a user\r\nI want to navigate the menu of the website\r\nSo I can access all areas of the website",
  "id": "navigate-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@navigation"
    }
  ]
});
formatter.before({
  "duration": 19393,
  "status": "passed"
});
formatter.before({
  "duration": 275746,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Navigate main menu",
  "description": "",
  "id": "navigate-site;navigate-main-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I want to navigate the main menu",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I navigate the options of the main menu",
  "keyword": "Then "
});
formatter.match({
  "location": "Navigation_Steps.i_want_to_navigate_the_main_menu()"
});
formatter.result({
  "duration": 126236,
  "status": "passed"
});
formatter.match({
  "location": "Navigation_Steps.i_navigate_the_options_of_the_main_menu()"
});
formatter.result({
  "duration": 22191631278,
  "status": "passed"
});
formatter.after({
  "duration": 20804,
  "status": "passed"
});
formatter.before({
  "duration": 20452,
  "status": "passed"
});
formatter.before({
  "duration": 263405,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Navigate archives menu",
  "description": "",
  "id": "navigate-site;navigate-archives-menu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@archiveMenu"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I want to navigate the archives menu",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I navigate the options of the archive menu",
  "keyword": "Then "
});
formatter.match({
  "location": "Navigation_Steps.i_want_to_navigate_the_archives_menu()"
});
formatter.result({
  "duration": 49719,
  "status": "passed"
});
formatter.match({
  "location": "Navigation_Steps.i_navigate_the_options_of_the_archive_menu()"
});
formatter.result({
  "duration": 16932960876,
  "status": "passed"
});
formatter.after({
  "duration": 15515,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 2,
  "name": "Search for articles",
  "description": "As a user\r\nI want to use search on website\r\nSo I can find articles relevant to my search",
  "id": "search-for-articles",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 20451,
  "status": "passed"
});
formatter.before({
  "duration": 284914,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search term to find more than 1 articles",
  "description": "",
  "id": "search-for-articles;search-term-to-find-more-than-1-articles",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I want to find many articles",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I search for \"automation\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see multiple search results for \"automation\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search_Steps.i_want_to_find_many_articles()"
});
formatter.result({
  "duration": 98028,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation",
      "offset": 14
    }
  ],
  "location": "Search_Steps.i_search_for(String)"
});
formatter.result({
  "duration": 1380702560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation",
      "offset": 42
    }
  ],
  "location": "Search_Steps.i_should_see_search_results_for(String)"
});
formatter.result({
  "duration": 60225160,
  "status": "passed"
});
formatter.after({
  "duration": 17983,
  "status": "passed"
});
formatter.before({
  "duration": 19393,
  "status": "passed"
});
formatter.before({
  "duration": 282799,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search term to find only 1 article",
  "description": "",
  "id": "search-for-articles;search-term-to-find-only-1-article",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I want to find only 1 article",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I search for \"python.org\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should see only a single search result for \"python.org\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "Search_Steps.i_want_to_find_only_article(int)"
});
formatter.result({
  "duration": 710875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "python.org",
      "offset": 14
    }
  ],
  "location": "Search_Steps.i_search_for(String)"
});
formatter.result({
  "duration": 631381964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "python.org",
      "offset": 46
    }
  ],
  "location": "Search_Steps.i_should_see_only_a_single_search_result_for(String)"
});
formatter.result({
  "duration": 66901251,
  "status": "passed"
});
formatter.after({
  "duration": 34203,
  "status": "passed"
});
formatter.before({
  "duration": 27857,
  "status": "passed"
});
formatter.before({
  "duration": 287382,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search term to find no articles",
  "description": "",
  "id": "search-for-articles;search-term-to-find-no-articles",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I want to find no articles",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I search for \"nope\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see no articles found",
  "keyword": "Then "
});
formatter.match({
  "location": "Search_Steps.i_want_to_find_no_articles()"
});
formatter.result({
  "duration": 55714,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nope",
      "offset": 14
    }
  ],
  "location": "Search_Steps.i_search_for(String)"
});
formatter.result({
  "duration": 596230669,
  "status": "passed"
});
formatter.match({
  "location": "Search_Steps.i_should_see_no_articles_found()"
});
formatter.result({
  "duration": 10093768876,
  "status": "passed"
});
formatter.after({
  "duration": 15163,
  "status": "passed"
});
});
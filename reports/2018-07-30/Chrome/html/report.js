$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Navigation.feature");
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
  "duration": 188643,
  "status": "passed"
});
formatter.before({
  "duration": 1138213,
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
  "name": "I select \"\u003cmenu\u003e\" item",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should be on \"\u003cmenu\u003e\" page",
  "rows": [
    {
      "comments": [
        {
          "line": 12,
          "value": "#Examples:"
        }
      ],
      "cells": [
        "menu"
      ],
      "line": 13
    },
    {
      "cells": [
        "About"
      ],
      "line": 14
    },
    {
      "cells": [
        "Home"
      ],
      "line": 15
    },
    {
      "cells": [
        "Blog"
      ],
      "line": 16
    },
    {
      "cells": [
        "Contact"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Navigation_Steps.i_want_to_navigate_the_main_menu()"
});
formatter.result({
  "duration": 149312552,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinition.Navigation_Steps.i_want_to_navigate_the_main_menu(Navigation_Steps.java:14)\r\n\tat ✽.Given I want to navigate the main menu(Navigation.feature:9)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cmenu\u003e",
      "offset": 10
    }
  ],
  "location": "Navigation_Steps.i_select_item(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cmenu\u003e",
      "offset": 16
    }
  ],
  "location": "Navigation_Steps.i_should_be_on_page(String,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 130975,
  "status": "passed"
});
formatter.before({
  "duration": 54247,
  "status": "passed"
});
formatter.before({
  "duration": 2688899,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Navigate archives menu",
  "description": "",
  "id": "navigate-site;navigate-archives-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I want to navigate the archives menu",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I select each menu and confirm it goes to the correct page",
  "keyword": "Then "
});
formatter.match({
  "location": "Navigation_Steps.i_want_to_navigate_the_archives_menu()"
});
formatter.result({
  "duration": 316198,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinition.Navigation_Steps.i_want_to_navigate_the_archives_menu(Navigation_Steps.java:35)\r\n\tat ✽.Given I want to navigate the archives menu(Navigation.feature:20)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "Navigation_Steps.i_select_each_menu_and_confirm_it_goes_to_the_correct_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 35188,
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
  "duration": 64021,
  "status": "passed"
});
formatter.before({
  "duration": 981335,
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
  "name": "I should see search results for \"automation\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search_Steps.i_want_to_find_many_articles()"
});
formatter.result({
  "duration": 1223248,
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
  "duration": 24218698059,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation",
      "offset": 33
    }
  ],
  "location": "Search_Steps.i_should_see_search_results_for(String)"
});
formatter.result({
  "duration": 184617663,
  "status": "passed"
});
formatter.after({
  "duration": 39586,
  "status": "passed"
});
formatter.before({
  "duration": 47893,
  "status": "passed"
});
formatter.before({
  "duration": 482360,
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
  "duration": 1381103,
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
  "duration": 1188169140,
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
  "duration": 126568340,
  "status": "passed"
});
formatter.after({
  "duration": 28345,
  "status": "passed"
});
formatter.before({
  "duration": 50826,
  "status": "passed"
});
formatter.before({
  "duration": 452060,
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
  "duration": 118757,
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
  "duration": 1242144062,
  "status": "passed"
});
formatter.match({
  "location": "Search_Steps.i_should_see_no_articles_found()"
});
formatter.result({
  "duration": 91806190,
  "status": "passed"
});
formatter.after({
  "duration": 66954,
  "status": "passed"
});
});
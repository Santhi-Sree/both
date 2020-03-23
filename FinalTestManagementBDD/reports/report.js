$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "\tIn order to login in Task management\n     I want to get access to the portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "ValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Administration Icon and I enter username as \u0027admin\u0027 and  I enter password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should access to the portal and check the presence of AddTask and TaskList",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task management page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_have_browser_with_Task_management_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Administration Icon and I enter username as \u0027admin\u0027 and  I enter password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_click_on_Administration_Icon_and_I_enter_username_as_and_I_enter_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal and check the presence of AddTask and TaskList",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_should_access_to_the_portal_and_check_the_presence_of_AddTask_and_TaskList()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Administration Icon and I enter invalid username as \u0027abc\u0027 and I enter valid password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "It should display an error message1 as \u0027Login or Password is incorrect.\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abc",
        "admin"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task management page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_have_browser_with_Task_management_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Administration Icon and I enter invalid username as \u0027abc\u0027 and I enter valid password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_click_on_Administration_Icon_and_I_enter_invalid_username_as_and_I_enter_valid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display an error message1 as \u0027Login or Password is incorrect.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.it_should_display_an_error_message1_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Administration Icon and I enter valid username as \u0027admin\u0027 and I enter invalid password as \u0027abcxyz\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "It should display an error message2 as \u0027Login or Password is incorrect.\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "abcxyz"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task management page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_have_browser_with_Task_management_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Administration Icon and I enter valid username as \u0027admin\u0027 and I enter invalid password as \u0027abcxyz\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_click_on_Administration_Icon_and_I_enter_valid_username_as_and_I_enter_invalid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display an error message2 as \u0027Login or Password is incorrect.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.it_should_display_an_error_message2_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Administration Icon and I enter invalid username as \u0027abc\u0027 and I enter invalid password as \u0027xyz\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "It should display an error message3 as \u0027Login or Password is incorrect.\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abc",
        "xyz"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task management page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_have_browser_with_Task_management_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Administration Icon and I enter invalid username as \u0027abc\u0027 and I enter invalid password as \u0027xyz\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_click_on_Administration_Icon_and_I_enter_invalid_username_as_and_I_enter_invalid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display an error message3 as \u0027Login or Password is incorrect.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.it_should_display_an_error_message3_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To check whether the logOut is working",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on the Administration Icon and I enter valid username as \u0027admin\u0027 and I enter valid password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should display the page and click on LogOut",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task management page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_have_browser_with_Task_management_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check whether the logOut is working",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on the Administration Icon and I enter valid username as \u0027admin\u0027 and I enter valid password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_click_on_the_Administration_Icon_and_I_enter_valid_username_as_and_I_enter_valid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should display the page and click on LogOut",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.LoginStepDefinition.i_should_display_the_page_and_click_on_LogOut()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/main/resources/feature/NewTaskAdd.feature");
formatter.feature({
  "name": "Add Task in Task Management website",
  "description": "\tIn order to login to website\n\tAs a Task Manager\n\tI want to get access to the portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search Task",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter data \u0027Alexander Atkinson\u0027 \u0027CodeCharge\u0027 \u0027Highest\u0027 \u0027Open\u0027 \u0027Task\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "Click on search button i shoud get the results",
  "keyword": "And "
});
formatter.step({
  "name": "I should access the portal with title as \u0027Task Manager\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Assigned To",
        "Project",
        "Priority",
        "Status",
        "Type"
      ]
    },
    {
      "cells": [
        "Alexander Atkinson",
        "CodeCharge",
        "Highest",
        "Open",
        "Task"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Task",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter data \u0027Alexander Atkinson\u0027 \u0027CodeCharge\u0027 \u0027Highest\u0027 \u0027Open\u0027 \u0027Task\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_enter_data(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button i shoud get the results",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.click_on_search_button_i_shoud_get_the_results()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access the portal with title as \u0027Task Manager\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_should_access_the_portal_with_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Access Task",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on task and enter username as \u0027admin\u0027 and password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_click_on_task_and_enter_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the text in Task field as \u0027Bored with your programming job? Get CodeCharge. Have Fun.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_should_get_the_text_in_Task_field_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add Task with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Add Task Icon and i enter username as \u0027admin\u0027 and password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I enter data \u0027Testing\u0027 \u0027I need to test the task\u0027 \u0027CodeCharge\u0027 \u0027High\u0027 \u0027In progress\u0027 \u0027Task\u0027 \u0027Stan Simon\u0027 \u002703/14/20\u0027 \u002703/18/20\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I should return to \u0027Task Manager\u0027 page by clicking on add button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Task",
        "Description",
        "Project",
        "Priority",
        "Status",
        "Type",
        "Assigned To",
        "Start Date",
        "Finish Date"
      ]
    },
    {
      "cells": [
        "Testing",
        "I need to test the task",
        "CodeCharge",
        "High",
        "In progress",
        "Task",
        "Stan Simon",
        "03/14/20",
        "03/18/20"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Task with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Add Task Icon and i enter username as \u0027admin\u0027 and password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_click_on_Add_Task_Icon_and_i_enter_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter data \u0027Testing\u0027 \u0027I need to test the task\u0027 \u0027CodeCharge\u0027 \u0027High\u0027 \u0027In progress\u0027 \u0027Task\u0027 \u0027Stan Simon\u0027 \u002703/14/20\u0027 \u002703/18/20\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_enter_data(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should return to \u0027Task Manager\u0027 page by clicking on add button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_should_return_to_page_by_clicking_on_add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add Task with Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Add Task Icon and i enter username as \u0027admin\u0027 and password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I enter data \u0027I need to test the task\u0027 \u0027CodeCharge\u0027 \u0027High\u0027 \u0027In progress\u0027 \u0027Task\u0027 \u0027Stan Simon\u0027 \u002703/14/20\u0027 \u002703/18/20\u0027 and click on add button",
  "keyword": "And "
});
formatter.step({
  "name": "I should get error message as \u0027The value in field Task is required.\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Description",
        "Project",
        "Priority",
        "Status",
        "Type",
        "Assigned To",
        "Start Date",
        "Finish Date"
      ]
    },
    {
      "cells": [
        "I need to test the task",
        "CodeCharge",
        "High",
        "In progress",
        "Task",
        "Stan Simon",
        "03/14/20",
        "03/18/20"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Task with Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Add Task Icon and i enter username as \u0027admin\u0027 and password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_click_on_Add_Task_Icon_and_i_enter_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter data \u0027I need to test the task\u0027 \u0027CodeCharge\u0027 \u0027High\u0027 \u0027In progress\u0027 \u0027Task\u0027 \u0027Stan Simon\u0027 \u002703/14/20\u0027 \u002703/18/20\u0027 and click on add button",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_enter_data_and_click_on_add_button(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get error message as \u0027The value in field Task is required.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_should_get_error_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser \u0027ch\u0027 with Task Management website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_have_browser_with_Task_Management_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit Task",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on existing task and i enter username as \u0027admin\u0027 and password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_click_on_existing_task_and_i_enter_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on task and enter data \u0027Enter code\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.click_on_task_and_enter_data(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should redirect to \u0027Task Manager\u0027 page when i  click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.NewTaskAddStepDefinition.i_should_redirect_to_page_when_i_click_on_submit_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/main/resources/feature/PrintTask.feature");
formatter.feature({
  "name": "Print Task List",
  "description": "\tIn order to print task lists in  the website\n\tAs a task manager\n\tI want to print the tasks list",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser \u0027ch\u0027 with Task Management",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_have_the_browser_with_Task_Management(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Admin button, i enter username as \u0027admin\u0027, password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Admin_button_i_enter_username_as_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Printing TaskList",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I should get the details of the tasks as i click on the Task List Icon",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_should_get_the_details_of_the_tasks_as_i_click_on_the_Task_List_Icon()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser \u0027ch\u0027 with Task Management",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_have_the_browser_with_Task_Management(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Admin button, i enter username as \u0027admin\u0027, password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Admin_button_i_enter_username_as_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Logging the application with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I should navigate to page with \u0027Administration\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_should_navigate_to_page_with_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser \u0027ch\u0027 with Task Management",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_have_the_browser_with_Task_Management(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Admin button, i enter username as \u0027admin\u0027, password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Admin_button_i_enter_username_as_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "printing Employees List",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Employees",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Employees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the details of the all the Employees",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_should_get_the_details_of_the_all_the_Employees()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser \u0027ch\u0027 with Task Management",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_have_the_browser_with_Task_Management(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Admin button, i enter username as \u0027admin\u0027, password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Admin_button_i_enter_username_as_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "printing Priorities List",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Priorities",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Priorities()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the details of the all the Priorities",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_should_get_the_details_of_the_all_the_Priorities()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser \u0027ch\u0027 with Task Management",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_have_the_browser_with_Task_Management(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Admin button, i enter username as \u0027admin\u0027, password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Admin_button_i_enter_username_as_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "printing Projects List",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Projects",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Projects()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the details of the all the  Projects",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_should_get_the_details_of_the_all_the_Projects()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser \u0027ch\u0027 with Task Management",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_have_the_browser_with_Task_Management(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Admin button, i enter username as \u0027admin\u0027, password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Admin_button_i_enter_username_as_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "printing Statuses List",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Statuses",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Statuses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the details of the all the Statuses",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_should_get_the_details_of_the_all_the_Statuses()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have the browser \u0027ch\u0027 with Task Management",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_have_the_browser_with_Task_Management(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Admin button, i enter username as \u0027admin\u0027, password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Admin_button_i_enter_username_as_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "printing Types List",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Types",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_click_on_Types()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the details of the all the Types",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PrintTaskListStepDefinition.i_should_get_the_details_of_the_all_the_Types()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/main/resources/feature/Priority.feature");
formatter.feature({
  "name": "Modify Priorities",
  "description": "\tIn order create a webpage\n\tAs a task manager\n\tI want to get access to the portal",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a browser \u0027ch\u0027 with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_have_a_browser_with_Administration_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "addingPrioritiesTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter Priority as  \u0027New Priority\u0027 and clicking add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_enter_Priority_as_and_clicking_add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Priority\u0027 should be added in the Priority List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.should_be_added_in_the_Priority_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a browser \u0027ch\u0027 with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_have_a_browser_with_Administration_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "editingPrioritiesTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I select Priority \u0027Highest\u0027 and  edited priority as \u0027New Highest\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_select_Priority_and_edited_priority_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Highest\u0027 edited Priority details should be added in the Priority List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.edited_Priority_details_should_be_added_in_the_Priority_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a browser \u0027ch\u0027 with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_have_a_browser_with_Administration_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "deletingPriorityTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I select Priority \u0027Normal\u0027 and  deleted the priority",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_select_Priority_and_deleted_the_priority(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Normal\u0027 Priority details should be deleted from the Priority list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.priority_details_should_be_deleted_from_the_Priority_list(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a browser \u0027ch\u0027 with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_have_a_browser_with_Administration_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "addingProjectsTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter Project as  \u0027New Project\u0027 and clicking add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_enter_Project_as_and_clicking_add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Project\u0027 should be added in the Project List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.should_be_added_in_the_Project_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a browser \u0027ch\u0027 with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_have_a_browser_with_Administration_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "editingProjectsTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I select Project \u0027Test Project\u0027 and  edited Project as \u0027New Test Project\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_select_Project_and_edited_Project_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Test Project\u0027 edited Project details should be added in the Project List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.edited_Project_details_should_be_added_in_the_Project_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a browser \u0027ch\u0027 with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_have_a_browser_with_Administration_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "deletingProjectsTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I select Project \u0027My Project\u0027 and  deleted the project",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.i_select_Project_and_deleted_the_project(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027My Project\u0027 Project details should be deleted from the Project list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.PriorityStepDefinition.project_details_should_be_deleted_from_the_Project_list(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});
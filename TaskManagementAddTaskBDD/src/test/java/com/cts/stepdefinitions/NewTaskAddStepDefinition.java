package com.cts.stepdefinitions;

import org.junit.Assert;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.AdministrationPage;
import com.cts.pages.LoginPage;
import com.cts.pages.TaskManagerPage;
import com.cts.pages.TaskRecordPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTaskAddStepDefinition {

	@Given("I have browser {string} with Task Management website")
	public void i_have_browser_with_Task_Management_website(String browserName) {

		// Access Task Management web page
		LaunchWebDriver.setUp(browserName);
	}

	@When("I enter data {string} {string} {string} {string} {string}")
	public void i_enter_data(String assinedTo, String project, String priority, String status, String type) {
		// Select assigned to
		TaskManagerPage.selectAssignedTo(LaunchWebDriver.driver, assinedTo);

		// Select Project
		TaskManagerPage.selectProject(LaunchWebDriver.driver, project);

		// Select Priority
		TaskManagerPage.selectPriority(LaunchWebDriver.driver, priority);

		// Select Status
		TaskManagerPage.selectStatus(LaunchWebDriver.driver, status);

		// Select Type
		TaskManagerPage.selectType(LaunchWebDriver.driver, type);
	}

	@When("Click on search button i shoud get the results")
	public void click_on_search_button_i_shoud_get_the_results() {
		// Click on Search
		TaskManagerPage.clickOnSearch(LaunchWebDriver.driver);

		// Get results into string
		String result = TaskManagerPage.getResults(LaunchWebDriver.driver);

		// Print result
		System.out.println(result);
	}

	@Then("I should access the portal with title as {string}")
	public void i_should_access_the_portal_with_title_as(String title) {
		// Get page title
		String actualTitle = LaunchWebDriver.driver.getTitle();

		// Assertion with expected title
		Assert.assertEquals(title, actualTitle);

		// Printing Actual title
		System.out.println(actualTitle);

		// Closing the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on task and enter username as {string} and password as {string}")
	public void i_click_on_task_and_enter_username_as_and_password_as(String username, String password) {
		// Click on Existing task
		TaskManagerPage.clickOnTask(LaunchWebDriver.driver);

		// Enter user name
		LoginPage.enterUserName(LaunchWebDriver.driver, username);

		// Enter Password
		LoginPage.enterPassWord(LaunchWebDriver.driver, password);

		// Click on Login Button
		LoginPage.clickOnLogin(LaunchWebDriver.driver);
	}

	@Then("I should get the text in Task field as {string}")
	public void i_should_get_the_text_in_Task_field_as(String text) {
		// Getting actual text from the task
		String actualText = TaskRecordPage.getExistingText(LaunchWebDriver.driver);

		// Assertion with Expected Text
		Assert.assertEquals(text, actualText);

		// Print the actual text
		System.out.println(actualText);

		// Click on Administration Icon
		TaskManagerPage.clickOnAdministrationIcon(LaunchWebDriver.driver);

		// Click on Logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);

		// Closing the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Add Task Icon and i enter username as {string} and password as {string}")
	public void i_click_on_Add_Task_Icon_and_i_enter_username_as_and_password_as(String username, String password) {
		// Click on Add Task Icon
		AdministrationPage.clickOnAddTaskIcon(LaunchWebDriver.driver);

		// Enter User name
		LoginPage.enterUserName(LaunchWebDriver.driver, username);

		// Enter Password
		LoginPage.enterPassWord(LaunchWebDriver.driver, password);

		// Click on Login button
		LoginPage.clickOnLogin(LaunchWebDriver.driver);

	}

	@When("I enter data {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void i_enter_data(String task, String description, String project, String priority, String status,
			String type, String assignedTo, String startDate, String finishDate) {

		// Enter Task name
		TaskRecordPage.enterTaskName(LaunchWebDriver.driver, task);

		// Enter description of the task
		TaskRecordPage.enterDescription(LaunchWebDriver.driver, description);

		// Select Project type
		TaskRecordPage.selectProject(LaunchWebDriver.driver, project);

		// Select Priority of the task
		TaskRecordPage.selectPriority(LaunchWebDriver.driver, priority);

		// Select Status of the task
		TaskRecordPage.selectStatus(LaunchWebDriver.driver, status);

		// Select the type of the task
		TaskRecordPage.selectType(LaunchWebDriver.driver, type);

		// Select the Assigned To to assign the task
		TaskRecordPage.selectAssignedTo(LaunchWebDriver.driver, assignedTo);

		// Enter Start date
		TaskRecordPage.enterStartDate(LaunchWebDriver.driver, startDate);

		// Enter Finish date
		TaskRecordPage.enterFinishDate(LaunchWebDriver.driver, finishDate);
	}

	@Then("I should return to {string} page by clicking on add button")
	public void i_should_return_to_page_by_clicking_on_add_button(String expectedtitle) {
		// Click on Add button
		TaskRecordPage.clickOnAddButton(LaunchWebDriver.driver);

		// Get the title of the page
		String actualTitle = LaunchWebDriver.driver.getTitle();

		// Assertion with expected title
		Assert.assertEquals(expectedtitle, actualTitle);

		// Print the actual title
		System.out.println(expectedtitle);

		// Click on Administration Icon
		TaskManagerPage.clickOnAdministrationIcon(LaunchWebDriver.driver);

		// Click on Logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);

		// Closing the browser
		LaunchWebDriver.tearDown();
	}

	@When("I enter data {string} {string} {string} {string} {string} {string} {string} {string} and click on add button")
	public void i_enter_data_and_click_on_add_button(String description, String project, String priority, String status,
			String type, String assignedTo, String startDate, String finishDate) {

		// Enter description of the task
		TaskRecordPage.enterDescription(LaunchWebDriver.driver, description);

		// Select Project type
		TaskRecordPage.selectProject(LaunchWebDriver.driver, project);

		// Select Priority of the task
		TaskRecordPage.selectPriority(LaunchWebDriver.driver, priority);

		// Select Status of the task
		TaskRecordPage.selectStatus(LaunchWebDriver.driver, status);

		// Select the type of the task
		TaskRecordPage.selectType(LaunchWebDriver.driver, type);

		// Select the Assigned To to assign the task
		TaskRecordPage.selectAssignedTo(LaunchWebDriver.driver, assignedTo);

		// Enter Start date
		TaskRecordPage.enterStartDate(LaunchWebDriver.driver, startDate);

		// Enter Finish date
		TaskRecordPage.enterFinishDate(LaunchWebDriver.driver, finishDate);

		// Click on Add button
		TaskRecordPage.clickOnAddButton(LaunchWebDriver.driver);
	}

	@Then("I should get error message as {string}")
	public void i_should_get_error_message_as(String expectedErrorText) {
		// Get the actual text of the error
		String actualError = TaskRecordPage.getErrorText(LaunchWebDriver.driver);

		// Assertion with expected error text
		Assert.assertEquals(expectedErrorText, actualError);

		// Print the actual error text
		System.out.println(actualError);

		// Click on Administration Icon
		TaskManagerPage.clickOnAdministrationIcon(LaunchWebDriver.driver);

		// Click on Logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);

		// Closing the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on existing task and i enter username as {string} and password as {string}")
	public void i_click_on_existing_task_and_i_enter_username_as_and_password_as(String username, String password) {
		// Click on existing task
		TaskManagerPage.clickOnExistingTask(LaunchWebDriver.driver);

		// Enter User name
		LoginPage.enterUserName(LaunchWebDriver.driver, username);

		// Enter password
		LoginPage.enterPassWord(LaunchWebDriver.driver, password);

		// Click on Login button
		LoginPage.clickOnLogin(LaunchWebDriver.driver);
	}

	@When("click on task and enter data {string}")
	public void click_on_task_and_enter_data(String text) {
		// Click on description and enter data
		TaskRecordPage.editTask(LaunchWebDriver.driver, text);
	}

	@Then("I should redirect to {string} page when i  click on submit button")
	public void i_should_redirect_to_page_when_i_click_on_submit_button(String expectedtitle) {
		// Click on Submit button
		TaskRecordPage.clickOnSubmitButton(LaunchWebDriver.driver);

		// Get the actual title of page after submit button is clicked
		String actualTitle = LaunchWebDriver.driver.getTitle();

		// Assertion with expected title
		Assert.assertEquals(expectedtitle, actualTitle);

		// Print the actual title
		System.out.println(actualTitle);

		// Click on Administration Icon
		TaskManagerPage.clickOnAdministrationIcon(LaunchWebDriver.driver);

		// Click on Logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);

		// Closing the browser
		LaunchWebDriver.tearDown();
	}

}

package com.cts.stepdefinitions;

import java.util.List;

import org.junit.Assert;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.AdministrationPage;
import com.cts.pages.HomePage;
import com.cts.pages.PriorityListPage;
import com.cts.pages.ProjectListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriorityStepDefinition {

	@Given("I have a browser {string} with Administration Page")
	public void i_have_a_browser_with_Administration_Page(String browserName) {
		// Launch browser with Task Management web page
		LaunchWebDriver.setUp(browserName);
		// Enter user name and password and click on login button
		HomePage.accountLogin(LaunchWebDriver.driver, "admin", "admin");
	}

	@When("I enter Priority as  {string} and clicking add button")
	public void i_enter_Priority_as_and_clicking_add_button(String priorityText) {
		// Click on priority
		AdministrationPage.clickingPriorities(LaunchWebDriver.driver);
		// Enter text and click on add
		PriorityListPage.addingPriority(LaunchWebDriver.driver, priorityText);
	}

	@Then("{string} should be added in the Priority List")
	public void should_be_added_in_the_Priority_List(String priorityText) {

		// Print Priority list
		List<String> cellData = PriorityListPage.assertionData(LaunchWebDriver.driver);

		if (cellData.contains(priorityText)) {
			Assert.assertTrue("Assertion Failed", cellData.contains(priorityText));
		} else {
			Assert.fail("Assertion Failed");
		}
		// Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		// Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		// Close the browser
		LaunchWebDriver.tearDown();

	}

	@When("I select Priority {string} and  edited priority as {string}")
	public void i_select_Priority_and_edited_priority_as(String editingPriority, String editingText) {
		//Click on priority
		AdministrationPage.clickingPriorities(LaunchWebDriver.driver);
		//Enter text in selected priority
		PriorityListPage.editingPriority(LaunchWebDriver.driver, editingPriority, editingText);
	}

	@Then("{string} edited Priority details should be added in the Priority List")
	public void edited_Priority_details_should_be_added_in_the_Priority_List(String editingText) {
		//Edit and print priority
		List<String> cellData = PriorityListPage.assertionData(LaunchWebDriver.driver);

		if (cellData.contains(editingText)) {
			Assert.assertTrue("Assertion Failed", cellData.contains(editingText));
		} else {
			Assert.fail("Assertion Failed");
		}
		// Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		// Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		// Close the browser
		LaunchWebDriver.tearDown();

	}

	@When("I select Priority {string} and  deleted the priority")
	public void i_select_Priority_and_deleted_the_priority(String deletingPriority) {
		//Click on priority
		AdministrationPage.clickingPriorities(LaunchWebDriver.driver);
		//Delete priority
		PriorityListPage.deletingPriority(LaunchWebDriver.driver, deletingPriority);
	}

	@Then("{string} Priority details should be deleted from the Priority list")
	public void priority_details_should_be_deleted_from_the_Priority_list(String deletingPriority) {
		//Delete and print priority list
		List<String> cellData = PriorityListPage.assertionData(LaunchWebDriver.driver);

		if (cellData.contains(deletingPriority)) {
			Assert.fail("Assertion Failed");
		} else {
			System.out.println("Assertion passed ");
		}
		// Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		// Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		// Close the browser
		LaunchWebDriver.tearDown();

	}

	@When("I enter Project as  {string} and clicking add button")
	public void i_enter_Project_as_and_clicking_add_button(String projectText) {
		//Click on project
		AdministrationPage.clickingProjects(LaunchWebDriver.driver);
		//Add project
		ProjectListPage.addingProject(LaunchWebDriver.driver, projectText);
	}

	@Then("{string} should be added in the Project List")
	public void should_be_added_in_the_Project_List(String projectText) {
		//Add and print project list
		List<String> cellData = ProjectListPage.assertionData(LaunchWebDriver.driver);
		if (cellData.contains(projectText)) {
			Assert.assertTrue("Assertion Failed", cellData.contains(projectText));
		} else {
			Assert.fail("Assertion Failed");
		}
		// Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		// Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		// Close the browser
		LaunchWebDriver.tearDown();

	}

	@When("I select Project {string} and  edited Project as {string}")
	public void i_select_Project_and_edited_Project_as(String editingProject, String editingText) {
		//Click on project
		AdministrationPage.clickingProjects(LaunchWebDriver.driver);
		//Edit project list
		ProjectListPage.editingProject(LaunchWebDriver.driver, editingProject, editingText);

	}

	@Then("{string} edited Project details should be added in the Project List")
	public void edited_Project_details_should_be_added_in_the_Project_List(String editingText) {
		//Assertion and print edited project list
		List<String> cellData = ProjectListPage.assertionData(LaunchWebDriver.driver);
		if (cellData.contains(editingText)) {
			Assert.assertTrue("Assertion Failed", cellData.contains(editingText));
		} else {
			Assert.fail("Assertion Failed");
		}
		// Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		// Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		// Close the browser
		LaunchWebDriver.tearDown();

	}

	@When("I select Project {string} and  deleted the project")
	public void i_select_Project_and_deleted_the_project(String deletingProject) {
		//Click on project
		AdministrationPage.clickingProjects(LaunchWebDriver.driver);
		//Delete the project
		ProjectListPage.deletingProject(LaunchWebDriver.driver, deletingProject);
	}

	@Then("{string} Project details should be deleted from the Project list")
	public void project_details_should_be_deleted_from_the_Project_list(String deletingProject) {
		//Print, Assertion on Deletion of the project details
		List<String> cellData = ProjectListPage.assertionData(LaunchWebDriver.driver);
		if (cellData.contains(deletingProject)) {
			Assert.fail("Assertion Failed");
		} else {
			System.out.println("Assertion passed ");
		}
		// Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		// Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		// Close the browser
		LaunchWebDriver.tearDown();

	}
}

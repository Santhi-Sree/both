package com.cts.stepdefinitions;

import org.junit.Assert;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.AdministrationPage;
import com.cts.pages.DefaultPage;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintTaskListStepDefinition {

	@Given("I have the browser {string} with Task Management")
	public void i_have_the_browser_with_Task_Management(String browserName) {
		//Launch browser with Task Management web page
		LaunchWebDriver.setUp(browserName);

	}

	@When("I click on Admin button, i enter username as {string}, password as {string}")
	public void i_click_on_Admin_button_i_enter_username_as_password_as(String username, String password) {
		//Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		//Enter user name
		LoginPage.enterUserName(LaunchWebDriver.driver, username);
		//Enter password
		LoginPage.enterPassWord(LaunchWebDriver.driver, password);
		//Click on login button
		LoginPage.clickOnLogin(LaunchWebDriver.driver);

	}

	@Then("I should get the details of the tasks as i click on the Task List Icon")
	public void i_should_get_the_details_of_the_tasks_as_i_click_on_the_Task_List_Icon() {
		//Print List of tasks
		DefaultPage.getPrintTaskListData(LaunchWebDriver.driver);
		//Click on Task list
		HomePage.clicOnTaskList(LaunchWebDriver.driver);
		//Click on Administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		//Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		//Close the browser
		LaunchWebDriver.tearDown();
	}

	@Then("I should navigate to page with {string} page")
	public void i_should_navigate_to_page_with_page(String title) {
		//Get actual title
		String actualTitle = LaunchWebDriver.driver.getTitle();
		//Assertion with expected title
		Assert.assertEquals(title, actualTitle);
		//Print title
		System.out.println(title);
		//Click on administration icon 
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		//Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		//Close the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Employees")
	public void i_click_on_Employees() {
		//Click on Employees
		AdministrationPage.clickOnEmployees(LaunchWebDriver.driver);

	}

	@Then("I should get the details of the all the Employees")
	public void i_should_get_the_details_of_the_all_the_Employees() {
		//Print the Employees details
		AdministrationPage.printList(LaunchWebDriver.driver);
		//Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		//Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		//Close the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Priorities")
	public void i_click_on_Priorities() {
		//Click on priorities
		AdministrationPage.clickOnPriorities(LaunchWebDriver.driver);

	}

	@Then("I should get the details of the all the Priorities")
	public void i_should_get_the_details_of_the_all_the_Priorities() {
		//Print Priorities list
		AdministrationPage.printList(LaunchWebDriver.driver);
		//Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		//Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		//Close the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Projects")
	public void i_click_on_Projects() {
		//Click on projects
		AdministrationPage.clickOnProjects(LaunchWebDriver.driver);
	}

	@Then("I should get the details of the all the  Projects")
	public void i_should_get_the_details_of_the_all_the_Projects() {
		//Print projects list
		AdministrationPage.printList(LaunchWebDriver.driver);
		//Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		//Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		//Close the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Statuses")
	public void i_click_on_Statuses() {
		//Click on Status
		AdministrationPage.clickOnStatuses(LaunchWebDriver.driver);
	}

	@Then("I should get the details of the all the Statuses")
	public void i_should_get_the_details_of_the_all_the_Statuses() {
		//Print status list
		AdministrationPage.printList(LaunchWebDriver.driver);
		//Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		//Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		//Close the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Types")
	public void i_click_on_Types() {
		//Click on Type
		AdministrationPage.clickOnTypes(LaunchWebDriver.driver);
	}

	@Then("I should get the details of the all the Types")
	public void i_should_get_the_details_of_the_all_the_Types() {
		//Print type list
		AdministrationPage.printList(LaunchWebDriver.driver);
		//Click on administration icon
		HomePage.clickOnAdministrator(LaunchWebDriver.driver);
		//Click on logout button
		AdministrationPage.clickOnLogout(LaunchWebDriver.driver);
		//Close the browser
		LaunchWebDriver.tearDown();
	}

}

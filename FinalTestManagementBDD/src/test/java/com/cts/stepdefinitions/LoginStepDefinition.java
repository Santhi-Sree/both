package com.cts.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.AdministrationPage;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	// scenario 1
	@Given("I have browser {string} with Task management page")
	public void i_have_browser_with_Task_management_page(String browserName) {

		// Launch Task Management web page
		LaunchWebDriver.setUp(browserName);

	}

	@When("I click on Administration Icon and I enter username as {string} and  I enter password as {string}")
	public void i_click_on_Administration_Icon_and_I_enter_username_as_and_I_enter_password_as(String username,
			String password) {
		// Click on My Account Icon
		HomePage.clickOnMyAccountIcon(LaunchWebDriver.driver);
		// Enter User Name
		LoginPage.enterUserName(LaunchWebDriver.driver, username);
		// Enter Password
		LoginPage.enterPassWord(LaunchWebDriver.driver, password);
		// Click on Login button
		LoginPage.clickOnLogin(LaunchWebDriver.driver);

	}

	@Then("I should access to the portal and check the presence of AddTask and TaskList")
	public void i_should_access_to_the_portal_and_check_the_presence_of_AddTask_and_TaskList() {

		// To check presence of Add task Icon
		HomePage.checkAddTaskPresence(LaunchWebDriver.driver);
		// To check presence of Task list Icon
		HomePage.checkTaskListPresence(LaunchWebDriver.driver);

		// Close the browser
		LaunchWebDriver.tearDown();

	}

	@When("I click on Administration Icon and I enter invalid username as {string} and I enter valid password as {string}")
	public void i_click_on_Administration_Icon_and_I_enter_invalid_username_as_and_I_enter_valid_password_as(
			String username, String password) {
		// Click on My account Icon
		HomePage.clickOnMyAccountIcon(LaunchWebDriver.driver);
		// Enter Invalid user name
		LoginPage.enterInvalidUser(LaunchWebDriver.driver, username);
		// Enter Valid password
		LoginPage.enterValidPass(LaunchWebDriver.driver, password);
		// Click on login button
		LoginPage.clickOnLogin(LaunchWebDriver.driver);

	}

	@Then("It should display an error message1 as {string}")
	public void it_should_display_an_error_message1_as(String expectedText) {
		// Get actual error text
		String actualText = AdministrationPage.getErrorText(LaunchWebDriver.driver);
		// Assertion with expected error text
		Assert.assertEquals(expectedText, actualText);
		// Print actual text
		System.out.println(actualText);
		// Close the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Administration Icon and I enter valid username as {string} and I enter invalid password as {string}")
	public void i_click_on_Administration_Icon_and_I_enter_valid_username_as_and_I_enter_invalid_password_as(
			String username, String password) {
		// Click on my account icon
		HomePage.clickOnMyAccountIcon(LaunchWebDriver.driver);
		// Enter valid user name
		LoginPage.enterValidUserName(LaunchWebDriver.driver, username);
		// Enter Invalid password
		LoginPage.enteInvalidPassword(LaunchWebDriver.driver, password);
		// Click on Login button
		LoginPage.clickOnLogin(LaunchWebDriver.driver);

	}

	@Then("It should display an error message2 as {string}")
	public void it_should_display_an_error_message2_as(String expectedText) {
		// Get actual error text
		String actualText = AdministrationPage.getErrorText(LaunchWebDriver.driver);
		// Assertion with expected error text
		Assert.assertEquals(expectedText, actualText);
		// Print actual text
		System.out.println(actualText);
		// Close the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on Administration Icon and I enter invalid username as {string} and I enter invalid password as {string}")
	public void i_click_on_Administration_Icon_and_I_enter_invalid_username_as_and_I_enter_invalid_password_as(
			String username, String password) {
		// Click on my account icon
		HomePage.clickOnMyAccountIcon(LaunchWebDriver.driver);
		// Enter invalid user name
		LoginPage.enterInValidUserName(LaunchWebDriver.driver, username);
		// Enter Invalid password
		LoginPage.enteInvalidPass(LaunchWebDriver.driver, password);
		// Click on login button
		LoginPage.clickOnLogin(LaunchWebDriver.driver);
	}

	@Then("It should display an error message3 as {string}")
	public void it_should_display_an_error_message3_as(String expectedText) {
		// Get actual error text
		String actualText = AdministrationPage.getErrorText(LaunchWebDriver.driver);
		// Assertion with expected error text
		Assert.assertEquals(expectedText, actualText);
		// Print actual text
		System.out.println(actualText);
		// Close the browser
		LaunchWebDriver.tearDown();
	}

	@When("I click on the Administration Icon and I enter valid username as {string} and I enter valid password as {string}")
	public void i_click_on_the_Administration_Icon_and_I_enter_valid_username_as_and_I_enter_valid_password_as(
			String username, String password) {
		// Click on my account icon
		HomePage.clickOnMyAccountIcon(LaunchWebDriver.driver);
		// Check for logout user
		LoginPage.checkForLogOutuser(LaunchWebDriver.driver, username);
		// Check for logout pass
		LoginPage.checkForLogOutpass(LaunchWebDriver.driver, password);
		// Click on login
		LoginPage.clickOnLogin(LaunchWebDriver.driver);

	}

	@Then("I should display the page and click on LogOut")
	public void i_should_display_the_page_and_click_on_LogOut() {
		// Click on Administration Icon
		LoginPage.ClickOnAdminIcon(LaunchWebDriver.driver);
		// Check for logout
		LoginPage.checkForLogOut(LaunchWebDriver.driver);
		// Close the browser
		LaunchWebDriver.tearDown();
	}

}

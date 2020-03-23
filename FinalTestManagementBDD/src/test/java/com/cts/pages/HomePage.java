package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cts.base.LaunchWebDriver;

public class HomePage {
	private static By myAdminLoc = By.xpath("//a[@href='Administration.php']");
	private static By administrationLoc = By.xpath("//a[@href='Administration.php']");
	private static By loginLoc = By.xpath("//input[@name='login']");
	private static By passwordLoc = By.xpath("//input[@name='password']");
	private static By submitLoc = By.xpath("//input[@name='DoLogin']");
	private static By taskListLoc = By.xpath("//img[@src='images/task-list-button.gif']");
	private static By administratorLoc = By.xpath("//img[@src='images/administration-button.gif']");
	private static By addTaskLoc = By.xpath("//img[@src='images/add-task-button.gif']");
	
	public static void clickOnMyAccountIcon(WebDriver driver) {
		driver.findElement(myAdminLoc).click();
	}

	public static void accountLogin(WebDriver driver, String login, String password) {
		driver.findElement(administrationLoc).click();
		driver.findElement(loginLoc).sendKeys(login);
		driver.findElement(passwordLoc).sendKeys(password);
		driver.findElement(submitLoc).click();
	}
	
	public static void clicOnTaskList(WebDriver driver)
	{
		driver.findElement(taskListLoc).click();
				
	}
	
	public static void clickOnAdministrator(WebDriver driver) 
	{
		driver.findElement(administratorLoc).click();
	}
	public static void checkAddTaskPresence(WebDriver driver) {
		
		WebElement actualTitle = LaunchWebDriver.driver.findElement(addTaskLoc);
		actualTitle.click();
	}
	public static void checkTaskListPresence(WebDriver driver) {
		
		WebElement actualTitle1 = LaunchWebDriver.driver.findElement(taskListLoc);
		actualTitle1.click();
	}



}

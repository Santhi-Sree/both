package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cts.base.LaunchWebDriver;

public class AdministrationPage {

	private static By addTaskIconLoc = By.xpath("//img[@src='images/add-task-button.gif']");
	private static By taskListLoc = By.xpath("//img[@src='images/task-list-button.gif']");
	private static By prioritiesLoc = By.xpath("//a[text()='Priorities']");
	private static By projectsLoc = By.xpath("//a[text()='Projects']");
	private static By statusesLoc = By.xpath("//a[text()='Statuses']");
	private static By typesLoc = By.xpath("//a[text()='Types']");
	private static By logoutLoc = By.linkText("Logout");
	private static By errorTextLoc = By.xpath("//td[contains(text(),'Login or Password is incorrect.')]");

	public static void clickOnAddTaskIcon(WebDriver driver) {

		driver.findElement(addTaskIconLoc).click();

	}

	public static void clickOnTaskListIcon(WebDriver driver) {

		driver.findElement(taskListLoc).click();
	}

	public static void clickingPriorities(WebDriver driver) {
		driver.findElement(prioritiesLoc).click();
	}

	public static void clickingProjects(WebDriver driver) {
		driver.findElement(projectsLoc).click();
	}

	public static void clickingStatuses(WebDriver driver) {
		driver.findElement(statusesLoc).click();
	}

	public static void clickingTypes(WebDriver driver) {
		driver.findElement(typesLoc).click();
	}

	public static void clickOnLogout(WebDriver driver) {
		driver.findElement(logoutLoc).click();
	}

	public static String getErrorText(WebDriver driver) {

		return LaunchWebDriver.driver.findElement(errorTextLoc).getText();
	}

}

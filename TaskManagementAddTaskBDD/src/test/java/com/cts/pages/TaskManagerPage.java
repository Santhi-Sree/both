package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskManagerPage {

	private static By AdministrationLoc = By.xpath("//img[@src='images/administration-button.gif']");
	private static By addNewTaskLoc = By.linkText("Add New Task");
	private static By existingTaskLoc = By.linkText("Sleep");
	private static By taskLoc = By.linkText("Have fun");
	private static By assinedToLoc = By.name("assign_to");
	private static By projectLoc = By.name("project_id");
	private static By priorityLoc = By.name("priority_id");
	private static By statusLoc = By.name("status_id");
	private static By typeLoc = By.name("type_id");
	private static By searchLoc = By.name("DoSearch");
	private static By resultLoc = By.linkText("Code with one hand.");

	public static void clickOnAdministrationIcon(WebDriver driver) {

		driver.findElement(AdministrationLoc).click();
	}

	public static void clickOnaddNewTask(WebDriver driver) {

		driver.findElement(addNewTaskLoc).click();
	}

	public static void clickOnTask(WebDriver driver) {

		driver.findElement(taskLoc).click();
	}

	public static void clickOnExistingTask(WebDriver driver) {

		driver.findElement(existingTaskLoc).click();
	}

	public static void selectAssignedTo(WebDriver driver, String assinedTo) {

		Select select = new Select(driver.findElement(assinedToLoc));
		select.selectByVisibleText(assinedTo);
	}

	public static void selectProject(WebDriver driver, String project) {

		Select select = new Select(driver.findElement(projectLoc));
		select.selectByVisibleText(project);
	}

	public static void selectPriority(WebDriver driver, String priority) {

		Select select = new Select(driver.findElement(priorityLoc));
		select.selectByVisibleText(priority);
	}

	public static void selectStatus(WebDriver driver, String status) {

		Select select = new Select(driver.findElement(statusLoc));
		select.selectByVisibleText(status);
	}

	public static void selectType(WebDriver driver, String type) {

		Select select = new Select(driver.findElement(typeLoc));
		select.selectByVisibleText(type);
	}

	public static void clickOnSearch(WebDriver driver) {

		driver.findElement(searchLoc).click();
	}

	public static String getResults(WebDriver driver) {

		return driver.findElement(resultLoc).getText();
	}

}

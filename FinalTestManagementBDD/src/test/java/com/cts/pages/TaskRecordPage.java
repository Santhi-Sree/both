package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskRecordPage {

	private static By taskNameLoc = By.name("task_name");
	private static By DescriptionLoc = By.name("task_desc");
	private static By projectIdLoc = By.name("project_id");
	private static By priorityLoc = By.name("priority_id");
	private static By statusLoc = By.name("status_id");
	private static By typeLoc = By.name("type_id");
	private static By assignedToLoc = By.name("user_id_assign_to");
	private static By startDateLoc = By.name("task_start_date");
	private static By finishDateLoc = By.name("task_finish_date");
	private static By addButtonLoc = By.name("Insert");
	private static By errorMessageLoc = By.xpath("//tr[@class='Error']");
	private static By submitLoc = By.name("Update");
	private static By actualTextLoc = By.xpath("//textarea[@name='task_desc']");

	public static void enterTaskName(WebDriver driver, String taskName) {

		driver.findElement(taskNameLoc).sendKeys(taskName);
	}

	public static void enterDescription(WebDriver driver, String description) {

		driver.findElement(DescriptionLoc).sendKeys(description);
	}

	public static void selectProject(WebDriver driver, String projectName) {

		Select select = new Select(driver.findElement(projectIdLoc));
		select.selectByVisibleText(projectName);
	}

	public static void selectPriority(WebDriver driver, String priorityType) {

		Select select = new Select(driver.findElement(priorityLoc));
		select.selectByVisibleText(priorityType);
	}

	public static void selectStatus(WebDriver driver, String status) {
	
		
		Select select = new Select(driver.findElement(statusLoc));
		select.selectByVisibleText(status);
	}

	public static void selectType(WebDriver driver, String type) {
		

		
		Select select = new Select(driver.findElement(typeLoc));
		select.selectByVisibleText(type);
	}

	public static void selectAssignedTo(WebDriver driver, String assignedTo) {

		Select select = new Select(driver.findElement(assignedToLoc));
		select.selectByVisibleText(assignedTo);
	}

	public static void enterStartDate(WebDriver driver, String startDate) {

		driver.findElement(startDateLoc).sendKeys(startDate);
	}

	public static void enterFinishDate(WebDriver driver, String finishDate) {

		driver.findElement(finishDateLoc).sendKeys(finishDate);
	}

	public static void clickOnAddButton(WebDriver driver) {

		driver.findElement(addButtonLoc).click();
	}

	public static String getErrorText(WebDriver driver) {

		return driver.findElement(errorMessageLoc).getText();
	}

	public static String getExistingText(WebDriver driver) {
		
		return driver.findElement(actualTextLoc).getText();
	}

	public static void editTask(WebDriver driver, String text) {

		driver.findElement(DescriptionLoc).sendKeys(text);
	}

	public static void clickOnSubmitButton(WebDriver driver) {

		driver.findElement(submitLoc).click();
	}

}

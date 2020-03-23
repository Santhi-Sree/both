package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusListPage {
	private static By newStatusLoc = By.xpath("//a[text()='Add New Status']");
	private static By statusTextLoc = By.xpath("//input[@name='status_name']");
	private static By addLoc = By.xpath("//input[@name='Insert']");
	private static By submitLoc = By.xpath("//input[@name='Update']");
	private static By deleteLoc = By.xpath("//input[@name='Delete']");

	public static void addingStatus(WebDriver driver, String statusText)
	{
		driver.findElement(newStatusLoc).click();
		driver.findElement(statusTextLoc).sendKeys(statusText);
		driver.findElement(addLoc).click();
	}

	public static void editingStatus(WebDriver driver,String editingStatus, String editingText)
	{
		driver.findElement(By.xpath("//a[text()='"+editingStatus+"']")).click();
		driver.findElement(statusTextLoc).clear();
		driver.findElement(statusTextLoc).sendKeys(editingText);
		driver.findElement(submitLoc).click();
	}

	public static void deletingProject(WebDriver driver, String deletingStatus)
	{
		driver.findElement(By.xpath("//a[text()='"+deletingStatus+"']")).click();
		driver.findElement(deleteLoc).click();
	}
}

package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypesListPage {
	private static By newTypeLoc = By.xpath("//a[text()='Add New Type']");
	private static By typeTextLoc = By.xpath("//input[@name='type_name']");
	private static By addLoc = By.xpath("//input[@name='Insert1']");
	private static By submitLoc = By.xpath("//input[@name='Update1']");
	private static By deleteLoc = By.xpath("//input[@name='Delete1']");

	public static void addingType(WebDriver driver, String typeText)
	{
		driver.findElement(newTypeLoc).click();
		driver.findElement(typeTextLoc).sendKeys(typeText);
		driver.findElement(addLoc).click();
	}

	public static void editingType(WebDriver driver,String editingType, String editingText)
	{
		driver.findElement(By.xpath("//a[text()='"+editingType+"']")).click();
		driver.findElement(typeTextLoc).clear();
		driver.findElement(typeTextLoc).sendKeys(editingText);
		driver.findElement(submitLoc).click();
	}

	public static void deletingProject(WebDriver driver, String deletingType)
	{
		driver.findElement(By.xpath("//a[text()='"+deletingType+"']")).click();
		driver.findElement(deleteLoc).click();
	}
}

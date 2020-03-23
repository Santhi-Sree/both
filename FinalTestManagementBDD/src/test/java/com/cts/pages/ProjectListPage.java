package com.cts.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectListPage {
	private static By newProjectLoc = By.xpath("//a[text()='Add New Project']");
	private static By projectTextLoc = By.xpath("//input[@name='project_name']");
	private static By addLoc = By.xpath("//input[@name='Insert']");
	private static By submitLoc = By.xpath("//input[@name='Update']");
	private static By deleteLoc = By.xpath("//input[@name='Delete']");
	public static By tableLoc = By.xpath("//table[@class='Grid']//tbody//tr");

	public static void addingProject(WebDriver driver, String projectText)
	{
		driver.findElement(newProjectLoc).click();
		driver.findElement(projectTextLoc).sendKeys(projectText);
		driver.findElement(addLoc).click();
	}

	public static void editingProject(WebDriver driver,String editingProject, String editingText)
	{
		driver.findElement(By.xpath("//a[text()='"+editingProject+"']")).click();
		driver.findElement(projectTextLoc).clear();
		driver.findElement(projectTextLoc).sendKeys(editingText);
		driver.findElement(submitLoc).click();
	}

	public static void deletingProject(WebDriver driver, String deletingProject)
	{
		driver.findElement(By.xpath("//a[text()='"+deletingProject+"']")).click();
		driver.findElement(deleteLoc).click();
	}
	
	public static List<String> assertionData(WebDriver driver) {
		List<String> cellData = new ArrayList<String>();
		List<WebElement> rowList = driver.findElements(tableLoc);
		for (WebElement row : rowList) {
			List<WebElement> cellList = row.findElements(By.tagName("td"));
			for (WebElement cell : cellList) {
				String data = cell.getText();
				cellData.add(data);
				System.out.println(cellData);
			}
		}
		return cellData;
	}
}

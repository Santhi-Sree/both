package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private static By userNameLoc = By.xpath("//input[@name='login']");
	private static By passWordLoc = By.xpath("//input[@name='password']");
	private static By loginButtonLoc = By.xpath("//input[@name='DoLogin']");
	private static By AdminIcon = By.xpath("//img[@src='images/administration-button.gif']");
	private static By logOut = By.xpath("//a[contains(text(),'Logout')]");

	public static void enterUserName(WebDriver driver, String username) {

		driver.findElement(userNameLoc).sendKeys(username);
	}

	public static void enterPassWord(WebDriver driver, String password) {

		driver.findElement(passWordLoc).sendKeys(password);
	}

	public static void clickOnLogin(WebDriver driver) {

		driver.findElement(loginButtonLoc).click();
	}

	public static void ClickOnAdminIcon(WebDriver driver) {
		driver.findElement(AdminIcon).click();
	}

	public static void ClickOnLogOut(WebDriver driver) {
		driver.findElement(logOut).click();
	}

}

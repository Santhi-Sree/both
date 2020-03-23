package com.cts.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DefaultPage {
	WebDriver driver;

	public static void getPrintTaskListData(WebDriver driver) {
		List<WebElement> allRows = driver.findElements(By.xpath(" //table[@class='Grid']//tbody//tr"));

		for (WebElement row : allRows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			for (WebElement cellData : cells) {
				System.out.print(cellData.getText() + "  ");

			}
			System.out.println();
			System.out.println();
		}

	}

}

package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qwinix.entaly.qa.StepsDefinitions;

public class CommonUtil
{
	public static WebDriver driver;
	public void onMouseOver(WebElement we)
	{
		Actions action = new Actions(StepsDefinitions.driver);
		action.moveToElement(we).perform();
//		action.click().perform();
	}
}

package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Bubblechartpage {
	WebDriver driver = StepsDefinitions.driver;
	
	@FindBy(xpath="//div[@class='amcharts-balloon-div']")
	public WebElement getdata;

	
	public void onMouseOver(WebElement element)
	{
		Actions action = new Actions(StepsDefinitions.driver);
		action.moveToElement(element).perform();
//		action.click().perform();
	}
	 public String getdata() {
	 return driver.findElement(By.xpath("//div[@class='amcharts-balloon-div']")).getText();
	 }
}

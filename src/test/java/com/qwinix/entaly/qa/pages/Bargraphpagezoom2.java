package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Bargraphpagezoom2 {
	
	WebDriver driver = StepsDefinitions.driver;
	
	@FindBy(xpath="//div[@class='hintStyle']")
	public WebElement getdata;
    
	@FindBy(xpath="//button[@class='backbtn btn btn-primary']")
	public WebElement barbackbutton;
	
	public void onMouseOver(WebElement we)
	{
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();

		
		
	}
	public void gettext() {
		driver.findElement(By.xpath("//div[@class='hintStyle']")).getText();
	}
}

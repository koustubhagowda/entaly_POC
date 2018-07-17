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
	
	public String gettext() {
		return driver.findElement(By.xpath("//div[@class='hintStyle']")).getText();
	}
	
	public int getsize() {
		int sizeofbargraph = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']//*[name()='rect']")).size();
		int sizeoflist = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']//*[name()='circle']")).size();
		return sizeofbargraph;
	}
	
	public int getsize1() {
	 int sizeoflist = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']//*[name()='circle']")).size();
	return sizeoflist;
	}
	
	public void barbackbutton_click() {
		driver.findElement(By.xpath("//button[@class='backbtn btn btn-primary']")).click();
	}
}

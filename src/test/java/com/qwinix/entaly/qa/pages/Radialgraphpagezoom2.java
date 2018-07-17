package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Radialgraphpagezoom2 {
	WebDriver driver = StepsDefinitions.driver;
	
	@FindBy(xpath="*//[name()='svg']*/[name()='g']*/[name()='path']")
	public WebElement radialpath;
	
	@FindBy(xpath="//div[@class='hintStyle']")
	public WebElement getdata;
	
	@FindBy(xpath="//button[@class='butn-top btn btn-primary']")
	public WebElement radialbackbutton;
	
	public int getsize() {
	    int sizeoflist = driver.findElements(By.xpath("//div[@class='col-md-6 col-xs-6']//*[name()='svg']/*[name()='g']/*[name()='path']")).size();
		return sizeoflist;

	}
	public int getsize1() {
	    int sizeof = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path']")).size();
		return sizeof;

	}
	
	public String gettext() {
		return driver.findElement(By.xpath("//div[@class='hintStyle']")).getText();
	}
	
	public void radialbackbutton_click() {
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	}
	
}

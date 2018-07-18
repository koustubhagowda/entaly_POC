package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qwinix.entaly.qa.StepsDefinitions;

public class LineChartPageZoomTwo {

	
	WebDriver driver = StepsDefinitions.driver;
	
	@FindBy(xpath="//div[@class='hintStyle']")
	public WebElement getdata;
	
	public int getsize() {
		return driver.findElements(By.xpath("//div[1]/div/div/div[5]/div/center/div/div/div")).size();
	}
	
	public int getsize1() {
		return driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']//*[name()='rect']")).size();
	}

	public String gettext() {
		 return driver.findElement(By.xpath("//div[@class='hintStyle']")).getText();
	}  
	
	public void linebackbutton_click() {
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	}
}

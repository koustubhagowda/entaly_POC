package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.Bubblechartpage;


public class Scatterchartsteps {
	
	
	public void getdata_scatter_chart() throws InterruptedException {
	WebDriver driver = StepsDefinitions.driver;
	Bubblechartpage objBP = new Bubblechartpage();
	
	driver.get("https://www.amcharts.com/demos/scatter-chart");
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)", "");
	int size = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][12]/*[name()='g'][1]/*[name()='path']")).size();
	Thread.sleep(3000);
	System.out.println(size);
	for(int i=1;i<=size;i++) {
		WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][12]/*[name()='g'][1]/*[name()='path'][" + i +"]")); 
		objBP.onMouseOver(element);
		Thread.sleep(3000);
  		String text = objBP.getdata();
  		System.out.println(text);
		
	}
	int sizeof = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][12]/*[name()='g'][2]/*[name()='path']")).size();
	Thread.sleep(3000);
	System.out.println(sizeof);
	for(int j=1;j<=sizeof;j++) {
		WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][12]/*[name()='g'][2]/*[name()='path'][" + j +"]")); 
		objBP.onMouseOver(element);
		Thread.sleep(3000);
  		String text = objBP.getdata();
  		System.out.println(text);
		
	}
}

}

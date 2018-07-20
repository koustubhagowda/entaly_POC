package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.Bubblechartpage;

public class Sunburstchartsteps {
	
	
	public void getdata_sunburst_chart() throws InterruptedException {
		WebDriver driver = StepsDefinitions.driver;
		Bubblechartpage objBP = new Bubblechartpage();
		
		driver.get("https://www.highcharts.com/demo/sunburst");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		int size = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]//*[name()='text']/*[name()='tspan']")).size();
		Thread.sleep(3000);
		System.out.println(size);
		for(int i=1;i<=size;i++) {
			WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][7]//*[name()='text'][ " + i + "]/*[name()='tspan']")); 
			objBP.onMouseOver(element);
			Thread.sleep(3000);
	  		String text = driver.findElement(By.id("highcharts-ze4ztfe-0")).getText();
	  		System.out.println(text);
			
		}
	}
	
}
//*[name()='svg']/*[name()='g'][7]//*[name()='text']/*[name()='tspan']
//tspan[@class='highcharts-text-outline']
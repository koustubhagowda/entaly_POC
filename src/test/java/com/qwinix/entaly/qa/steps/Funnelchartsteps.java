package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.BarGraphPageZoomTwo;
import com.qwinix.entaly.qa.pages.RadialChartPageZoomOne;

public class Funnelchartsteps {
	
	
	public void getdata_funnel_chart() throws InterruptedException {
		WebDriver driver = StepsDefinitions.driver;
		BarGraphPageZoomTwo objBG = new  BarGraphPageZoomTwo();
		RadialChartPageZoomOne objRP = new RadialChartPageZoomOne();
		
		driver.get("https://www.amcharts.com/demos/funnel-chart");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		int size = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='text']")).size();
		Thread.sleep(3000);
		System.out.println(size);
		for(int i=1;i<=size;i++) {
			WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g'][" + i + "]/*[name()='text']")); 
			objBG.onMouseOver(element);
			Thread.sleep(3000);
	  		String text = objRP.getdata.getText();
	  		System.out.println(text);
			
		}
}

}

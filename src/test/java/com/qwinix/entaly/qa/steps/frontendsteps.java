package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;

import com.qwinix.entaly.qa.StepsDefinitions;

public class frontendsteps {
	
	public void display() throws InterruptedException {
		
		StepsDefinitions.driver.get("https://entaly-demo.herokuapp.com/");
		Thread.sleep(2000);
		 boolean autorefersh = StepsDefinitions.driver.findElement(By.xpath("//div[@class='switch-toggle']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println(autorefersh);
		StepsDefinitions.driver.findElement(By.xpath("//div[@class='switch-toggle']")).click();
		Thread.sleep(3000);
		boolean pause =StepsDefinitions.driver.findElement(By.xpath("//a/i[@class='fa fa-pause']")).isDisplayed();
		System.out.println(pause);
		Thread.sleep(3000);
		boolean undo =StepsDefinitions.driver.findElement(By.xpath("//a/i[@class='fa fa-undo']")).isDisplayed();
		System.out.println(undo);
		
		Thread.sleep(3000);
		boolean undo_rotate =StepsDefinitions.driver.findElement(By.xpath("//a/i[@class='fa fa-undo gly-rotate-252']")).isDisplayed();
		System.out.println(undo_rotate);
		
		Thread.sleep(3000);
		boolean undo_rotate1=StepsDefinitions.driver.findElement(By.xpath("//a/i[@class='fa fa-undo gly-rotate-80']")).isDisplayed();
		System.out.println(undo_rotate1);
	}

}

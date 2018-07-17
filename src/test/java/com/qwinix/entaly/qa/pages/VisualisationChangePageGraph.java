package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.entaly.qa.StepsDefinitions;

public class VisualisationChangePageGraph
{
	@FindBy(xpath="//button[@id='g1GraphChange']")
	public WebElement changegraph;
	
	@FindBy(xpath="//a[contains(text(),'Pie Chart')]")
	public WebElement piechart;
	
	@FindBy(xpath="//div[@class='hintStyle']")
	public WebElement fetchdata;
	
	public VisualisationChangePageGraph()
	{
		PageFactory.initElements(StepsDefinitions.driver,this);
	}

}

package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.entaly.qa.StepsDefinitions;

public class BarGraphPageZoomThree
{
	@FindBy(xpath="//a[contains(text(),'Pie Chart')]")
	public WebElement piechart;
	
	public BarGraphPageZoomThree()
	{
		PageFactory.initElements(StepsDefinitions.driver,this);
	}

}

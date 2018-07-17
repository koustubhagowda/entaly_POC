package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.entaly.qa.StepsDefinitions;

public class RadialChartPageZoomOne
{
//	@FindBy(xpath="//*[name()='svg']/*[name()='g']/*[name()='path'][1]")
//	public WebElement mouseover;
	
	@FindBy(xpath="//div[@class='hintStyle']")
	public WebElement fetchdata;
	
	public RadialChartPageZoomOne()
	{
		PageFactory.initElements(StepsDefinitions.driver,this);
	}

}

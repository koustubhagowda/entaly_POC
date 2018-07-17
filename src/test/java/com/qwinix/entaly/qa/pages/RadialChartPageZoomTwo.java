package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadialChartPageZoomTwo {
	
	@FindBy(xpath="*//[name()='svg']*/[name()='g']*/[name()='path']")
	public WebElement linechartbutton;
	
	@FindBy(xpath="//div[@class='hintStyle']")
	public WebElement getdata;
	
	@FindBy(xpath="//button[@class='butn-top btn btn-primary']")
	public WebElement radialbackbutton;
	
	
	
}

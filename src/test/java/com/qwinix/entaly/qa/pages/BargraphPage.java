package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.entaly.qa.StepsDefinitions;

public class BargraphPage
{
	@FindBy(xpath="//h3[contains(text(),'Repositories and Commits:')]")
	public WebElement verify;
//	@FindBy(xpath="//*[name()='svg']/*[name()='g'][4]/*[name()='rect']")
//	public WebElement mouseover;
	
//	@FindBy(xpath="(//*[name()='svg']/*[name()='g'][4]/*[name()='rect'])[6]")
//	public WebElement mouseover;
	
	@FindBy(xpath="//div[@class='hintStyle']")
	public WebElement fetchdata;
	
	public BargraphPage()
	{
		PageFactory.initElements(StepsDefinitions.driver,this);
	}

}

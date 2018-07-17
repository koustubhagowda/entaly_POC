package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.entaly.qa.StepsDefinitions;

public class LoginPage
{
	@FindBy(xpath="//button[contains(text(),'Login')]")
	public WebElement login;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	public WebElement sign_in;
	
	@FindBy(xpath="//h3[contains(text(),'Repositories and Commits:')]")
	public WebElement verify;
	
	public LoginPage()
	{
		PageFactory.initElements(StepsDefinitions.driver,this);
	}

}

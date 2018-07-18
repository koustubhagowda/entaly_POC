package com.qwinix.entaly.qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.qwinix.entaly.qa.steps.ConfigUtil;

import com.qwinix.entaly.qa.pages.LoginPage;
import com.qwinix.entaly.qa.steps.CommonUtil;
import com.qwinix.entaly.qa.StepsDefinitions;

public class UserSteps
{
	public WebDriver driver=StepsDefinitions.driver;
	ConfigUtil config = new  ConfigUtil();
    String url=config.getUrl();
    
    CommonUtil commonUtilObj = new CommonUtil();
	LoginPage LoginObj = new LoginPage();
    
  //To open url
  	public void openUrl()
  	{
  		driver.manage().window().maximize();
  		driver.get(url);
  		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  	}
  	
  	
  //Sign In
  	public void signIn(String un,String pwd) throws InterruptedException 
  	{
  		LoginObj.login.click();
  		LoginObj.email.sendKeys(un);
  		LoginObj.password.sendKeys(pwd);
  		LoginObj.sign_in.click();
  	}
  	
  	//Dashboard verify
  	public void Pageverify() throws InterruptedException
  	{
  		LoginObj.verify.getText();
  	}
    	
}

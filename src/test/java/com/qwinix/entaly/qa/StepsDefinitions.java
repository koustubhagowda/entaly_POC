package com.qwinix.entaly.qa;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.qwinix.entaly.qa.steps.ConfigUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepsDefinitions
{
	public static WebDriver driver; 
	ConfigUtil config = new  ConfigUtil();
	@Before
	public void beforeEveryScenario(Scenario scenario) 
	{
	        switch (config.getBrowser())
	        {
	            case "chrome":
	                System.setProperty("webdriver.chrome.driver",config.getChromePath());
	                driver = new ChromeDriver();
	                break;
	            case "firefox":
	            	System.setProperty("webdriver.gecko.driver",config.getFirefoxPath());
	                driver = new FirefoxDriver();
	                break;
	            case "ie":
	                driver = new InternetExplorerDriver();
	                break;
	            case "safari":
	                driver = new SafariDriver();
	                break;
	            default:
	                driver = new ChromeDriver();
	                break;
	        }
	          System.out.println("Opening Browser...."+config.getBrowser());
	          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        	  driver.manage().deleteAllCookies();
            	  
    }
	@After
	 public void embedScreenshot(Scenario scenario)  
	{
	  if(scenario.isFailed()) 
	  {
		  try 
		  {
			  scenario.write("Current Page URL is " + driver.getCurrentUrl());
			  byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			  scenario.embed(screenshot, "image/png");
		  } 
		  catch (WebDriverException somePlatformsDontSupportScreenshots)
		  {
			  System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		  } 
	  }
	  driver.quit();
	}
	  
}
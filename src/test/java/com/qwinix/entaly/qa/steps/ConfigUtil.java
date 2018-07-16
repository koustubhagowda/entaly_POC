package com.qwinix.entaly.qa.steps;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigUtil
{
	Properties pro;
    public ConfigUtil()
    {
   	try
   	{
   		File src = new File("./Configuration/config.properties");
   		FileInputStream fis = new FileInputStream(src);
   		pro = new Properties();
   		pro.load(fis);	
   	}
   	catch(Exception e)
   	{
   		System.out.println("Exception is =="+e.getMessage());
   	} 
    }
    
    
    public String getChromePath()
    {
   	 String path = pro.getProperty("ChromeDriver");
   	 return path;
    }
    public String getFirefoxPath()
    {
   	 String path = pro.getProperty("FirefoxDriver");
   	 return path;
    }
    public String getBrowser()
    {
   	 String path = pro.getProperty("Browser");
   	 return path;
    }
    public String getUrl()
    {
   	 String path = pro.getProperty("URL");
   	 return path;
    }
}

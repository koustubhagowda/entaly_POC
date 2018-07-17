package com.qwinix.entaly.qa.steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.VisualisationChangePageGraph;

public class VisualisationChangeStepsGraph
{
	public WebDriver driver=StepsDefinitions.driver;
    CommonUtil commonUtilObj = new CommonUtil();
    VisualisationChangePageGraph VisualChangeObj = new VisualisationChangePageGraph();
	ArrayList<JsonModel> listofarray5 = new ArrayList<>();
	public void Multiplegraph_test() throws InterruptedException
  	{
		VisualChangeObj.changegraph.click();
		VisualChangeObj.piechart.click();
  		Thread.sleep(3000);
  		WebElement displayed = driver.findElement(By.xpath("(//*[name()='svg']//*[name()='text'])[1]"));
  		WebElement ele = driver.findElement(By.xpath("//div[@class='show-grid row'][1]//*[name()='svg']//*[name()='path'][1]"));
		if(displayed.isDisplayed())
  		{
  			int sizeoflist = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][4]/*[name()='rect']")).size();
  	  		for(int i=1;i<=sizeoflist;i++)
  	  		{
//  	  			if(i==6 || i==8 || i==17)
//  				{
//  					continue;
//  				}
  	  			WebElement individualbar_graph = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g'][4]/*[name()='rect'])[" + i +"]")); 
  	  			commonUtilObj.onMouseOver(individualbar_graph);
  	  	  		String text = VisualChangeObj.fetchdata.getText();
  	  	  		System.out.println(text);
  	  	  		Thread.sleep(3000);
  	  	  		
  	  	  		for(int j=0;j<listofarray5.size();j++)
  				{
  		  			JsonModel mm = listofarray5.get(j);
  		  			String abc = mm.getXval()+" :\n"+mm.getYval();
  		  			if(abc.equalsIgnoreCase(text))
  		  			{
  		  				
  		  				System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"'");
//  		  				assertThat("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"' doesn't matching",abc.equals(text));
  		  				break;
  		  			}
  				}
  	  		}
  		}
		if(ele.isDisplayed())
  		{
  			int sizelist = driver.findElements(By.xpath("//div[@class='show-grid row'][1]//*[name()='path']")).size();
  	  		System.out.println(sizelist);
  	  		for(int i=1;i<=sizelist;i++)
  	  		{
  	  			if(i==3 || i==13 || i==19)
  				{
  					continue;
  				}
  	  			WebElement individualbar_graph = driver.findElement(By.xpath("(//div[@class='show-grid row'][1]//*[name()='path'])[" + i + "]"));
  	  			commonUtilObj.onMouseOver(individualbar_graph);
  	  	  		String text = VisualChangeObj.fetchdata.getText();
  	  	  		Thread.sleep(3000);
  	  	  		
  	  	  		for(int j=0;j<listofarray5.size();j++)
  	  	  		{
  	  	  			JsonModel mm = listofarray5.get(j);
  	  	  			String abc = mm.getXval()+" :\n"+mm.getYval();
  	  	  			if(abc.equalsIgnoreCase(text))
  	  	  			{	  				
  	  	  				System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"'");
//    					assertThat("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"' doesn't matching",abc.equals(text));
  	  	  				break;	
  	  	  			}
  	  	  		}
  	  	  	
  			}
    	}
  			
  	}

}

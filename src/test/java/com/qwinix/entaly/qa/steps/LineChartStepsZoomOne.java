package com.qwinix.entaly.qa.steps;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.LineChartPageZoomOne;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LineChartStepsZoomOne
{
	public WebDriver driver=StepsDefinitions.driver;
    CommonUtil commonUtilObj = new CommonUtil();
	LineChartPageZoomOne linechartObj = new LineChartPageZoomOne();
	ArrayList<JsonModel> listofarray2 = new ArrayList<>();
	public void LineAccessToken() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		JavascriptExecutor js = (JavascriptExecutor)driver;
  		String token_id = js.executeScript("return localStorage.getItem('access_token')").toString();
		String mailid = ("qwinix@yopmail.com").toString();
		Response  teamsNMembers = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("teamsNMembersNPrs").header("Authorization","Bearer "+token_id).contentType("application/json").log().body().when().get();
		String Stringofjson = teamsNMembers.asString();
		System.out.println(Stringofjson);		
		
		JSONObject objects = new JSONObject(Stringofjson);
		
		try
		{
			JSONArray teammembers = objects.getJSONArray("teamsNMembersNPrs");
			for(int i=0;i<teammembers.length();i++)
			{
				JSONObject team = teammembers.getJSONObject(i);
				JSONArray teammembersArr = team.getJSONArray("graphValues");
				 for(int j=0;j<teammembersArr.length();j++)
				 {
					 JsonModel mModel = new JsonModel();
					 JSONObject teammembersObj = teammembersArr.getJSONObject(j);
					 mModel.setXval(teammembersObj.getString("x"));
					 mModel.setYval(teammembersObj.getInt("y"));
					 listofarray2.add(mModel);
				 }

			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	}
	
	//Line chart onmouseover
  	public void LinechartOnmouseover() throws InterruptedException
  	{
  		JavascriptExecutor jse = (JavascriptExecutor)driver;
  		jse.executeScript("window.scrollBy(0,700)", "");
//  		WebElement elements = driver.findElement(By.xpath("//div[@class='rv-xy-plot']"));
//  		Actions actions = new Actions(driver);
//  		actions.moveToElement(elements);
//  		actions.perform();
//  		WebElement elements = driver.findElement(By.xpath("//div[@class='rv-xy-plot']/*[name()='svg']/*[name()='g']"));
//  		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);
//  		Thread.sleep(500); 
  		int sizeoflistof = driver.findElements(By.xpath("//div[@class='margin-fix col-md-12 col-xs-12']//*[name()='svg']/*[name()='g']")).size();
  		System.out.println(sizeoflistof);
  		for(int i=5;i<=sizeoflistof;i++)
  		{
  			int individualline_graph = driver.findElements(By.xpath("(//*[name()='svg']/*[name()='g'][" + i + "]//*[name()='circle'])")).size();
  			for(int j=1;j<=individualline_graph;j++)
  			{
  				if(j==5 || j==7 || j==1)
  				{
  					continue;
  				}
  				WebElement element = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g'][" + i + "]//*[name()='circle'])[" + j + "]"));
  				commonUtilObj.onMouseOver(element);
  				String text = linechartObj.fetchdata.getText();
  				Thread.sleep(3000);
  				
  				for(int k=0;k<listofarray2.size();k++)
  				{
  		  			JsonModel mm = listofarray2.get(k);
//  		  			System.out.println(mm);
  		  			String abc = mm.getXval()+" :\n"+mm.getYval();
//  		  			System.out.println(abc);
  		  			if(abc.equalsIgnoreCase(text))
  		  			{
  		  				
  		  				System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"'");
//  		  				assertThat("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"' doesn't matching",abc.equals(text));
  		  				break;
  		  			}
  				}
  			}
   		}
  	}
  	
  	
  	//Line chart onmousrover
//  	public boolean LinechartGettext()
//  	{
//  		if(linechartObj.fetchdata.isDisplayed())
//  		{
//  			linechartObj.fetchdata.getText();
//  			return true;
//  		}
//  		else
//  		{
//  			return false;
//  		}
//  	}

}

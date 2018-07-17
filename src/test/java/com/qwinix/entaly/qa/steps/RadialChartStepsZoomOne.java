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
import com.qwinix.entaly.qa.pages.RadialChartPageZoomOne;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RadialChartStepsZoomOne
{
	public WebDriver driver=StepsDefinitions.driver;
    CommonUtil commonUtilObj = new CommonUtil();
	RadialChartPageZoomOne radialchartObj = new RadialChartPageZoomOne();

	ArrayList<JsonModel> listofarray1 = new ArrayList<>();
	public void RadialAccessToken() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		JavascriptExecutor js = (JavascriptExecutor)driver;
  		String token_id = js.executeScript("return localStorage.getItem('access_token')").toString();
		String emailid = ("qwinix@yopmail.com").toString();
		Response  userAndPullreq = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("usersAndPullreq?usersCount=20").header("Authorization","Bearer "+token_id).contentType("application/json").log().body().when().get();
		String Stringjson = userAndPullreq.asString();
		System.out.println(Stringjson);		
		
		JSONObject objects = new JSONObject(Stringjson);
		
		try
		{
			JSONArray pullrequest = objects.getJSONArray("usersAndPullreq");
			for(int i=0;i<pullrequest.length();i++)
			{
				JsonModel mModel = new JsonModel();
				JSONObject userpull = pullrequest.getJSONObject(i);
				mModel.setXval(userpull.getString("label"));
				mModel.setYval(userpull.getInt("theta"));
				listofarray1.add(mModel);
			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		
  	}
	
	
	//Radial chart onmouseover
  	public void RadialchartOnmouseover() throws InterruptedException
  	{
  		int sizeoflist = driver.findElements(By.xpath("//div[@class='col-md-6 col-xs-6']//*[name()='svg']/*[name()='g']/*[name()='path']")).size();
  		System.out.println(sizeoflist);
  		for(int i=1;i<=sizeoflist;i++)
  		{
  			if(i==2 || i==3 || i==4 || i==9 || i==12 || i==14 || i==20)
			{
				continue;
			}
  			WebElement individualradial_graph = driver.findElement(By.xpath("(//div[@class='col-md-6 col-xs-6']//*[name()='svg']/*[name()='g']/*[name()='path'])[" + i + "]")); 
  			commonUtilObj.onMouseOver(individualradial_graph);
  	  		String text = radialchartObj.fetchdata.getText();
  	  		Thread.sleep(3000);
  	  		
  	  		for(int j=0;j<listofarray1.size();j++)
			{
	  			JsonModel mm = listofarray1.get(j);
//	  			System.out.println(mm);
	  			String abc = mm.getXval()+" :\n"+mm.getYval();
//	  			System.out.println(abc);
	  			if(abc.equalsIgnoreCase(text))
	  			{
	  				
	  				System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"'");
//	  				assertThat("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"' doesn't matching",abc.equals(text));
	  				break;
	  			}
			}
  		}
  	}
  	
  	//Radial chart gettext
//  	public boolean RadialchartGettext()
//  	{
//  		if(radialchartObj.fetchdata.isDisplayed())
//  		{
//  			radialchartObj.fetchdata.getText();
//  			return true;
//  		}
//  		else
//  		{
//  			return false;
//  		}
//  	}
}

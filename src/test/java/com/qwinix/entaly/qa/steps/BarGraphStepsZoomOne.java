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
import com.qwinix.entaly.qa.pages.BarGraphPageZoomOne;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BarGraphStepsZoomOne
{
	public WebDriver driver=StepsDefinitions.driver;
    CommonUtil commonUtilObj = new CommonUtil();
	BarGraphPageZoomOne bargraphObj = new BarGraphPageZoomOne();
	ArrayList<JsonModel> listofarray = new ArrayList<>();
	
	//fetch access token
  	public void BarAccessToken() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		JavascriptExecutor js = (JavascriptExecutor)driver;
  		String token_id = js.executeScript("return localStorage.getItem('access_token')").toString();
		String email = ("qwinix@yopmail.com").toString();
		Response  reposNcommits = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("reposAndCommits?repoCount=20").header("Authorization","Bearer "+token_id).contentType("application/json").log().body().when().get();
		String jsonString = reposNcommits.asString();
		System.out.println(jsonString);
		
		JSONObject object = new JSONObject(jsonString);
		
		try
		{
			JSONArray repos = object.getJSONArray("repoNCommits");
			for(int i=0;i<repos.length();i++)
			{
				JsonModel mModel = new JsonModel();
				JSONObject rcommits=repos.getJSONObject(i);
				mModel.setXval(rcommits.getString("x"));
				mModel.setYval(rcommits.getInt("y"));
				listofarray.add(mModel);
			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	}
	
	//Bar Graph onmouseover
  	public void BargraphOnmouseover() throws InterruptedException
  	{
 		int sizeoflist = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][4]/*[name()='rect']")).size();
  		System.out.println(sizeoflist);
  		for(int i=1;i<=sizeoflist;i++)
  		{
  			if(i==6 || i==8 || i==17)
			{
				continue;
			}
  			WebElement individualbar_graph = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g'][4]/*[name()='rect'])[" + i +"]")); 
  			commonUtilObj.onMouseOver(individualbar_graph);
  	  		String text = bargraphObj.fetchdata.getText();
  	  		Thread.sleep(3000);
  	  		
  	  		for(int j=0;j<listofarray.size();j++)
			{
	  			JsonModel mm = listofarray.get(j);
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
  	
  	//Bar graph gettext
//  	public void BargraphGettext()
//  	{
//  		if(bargraphObj.fetchdata.isDisplayed())
//  		{
////  			bargraphObj.fetchdata.getText();
//  			//System.out.println();
//  			String xvv = "q-dash";
//  			int yvv = 52;
//  			for(int i=0;i<listofarray.size();i++){
//  	  			JsonModel mm = listofarray.get(i);
//  	  			if(mm.getXval().equalsIgnoreCase(xvv) && mm.getYval() == yvv){
//  	  				System.out.println("value present");
//  	  			}
//  	  		}
//  			return true;
//  		}
//  		else
//  		{
//  			return false;
//  		}
  		
//  	}

}

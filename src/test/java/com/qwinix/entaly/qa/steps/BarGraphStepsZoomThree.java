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
import com.qwinix.entaly.qa.pages.BarGraphPageZoomThree;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BarGraphStepsZoomThree
{
	public WebDriver driver=StepsDefinitions.driver;
    CommonUtil commonUtilObj = new CommonUtil();
	BarGraphPageZoomThree bargraphObj = new BarGraphPageZoomThree();
	ArrayList<JsonModel> listofarray3 = new ArrayList<>();
	public void BarZoom3AccessToken() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		JavascriptExecutor js = (JavascriptExecutor)driver;
  		String token_id = js.executeScript("return localStorage.getItem('access_token')").toString();
		String email = ("qwinix@yopmail.com").toString();
		
		Response  committedDateMessage = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("committedDateNMessage/q-dash/acc_setting").header("Authorization","Bearer "+token_id).contentType("application/json").log().body().when().get();
		String jsonString = committedDateMessage.asString();
		System.out.println(jsonString);
		
		JSONObject object = new JSONObject(jsonString);
		
		try
		{
			JSONArray noofcommits = object.getJSONArray("committedDateNMessage");
			for(int i=0;i<noofcommits.length();i++)
			{
				JsonModel mModel = new JsonModel();
				JSONObject rcommits=noofcommits.getJSONObject(i);
				mModel.setdata(rcommits.getString("committedDate"), rcommits.getString("message"), rcommits.getString("id"));
				listofarray3.add(mModel);
			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	}
	
	
	public void zoom3bargraph() throws InterruptedException
  	{
  		Thread.sleep(2000);
  		int sizeoflist = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][4]/*[name()='rect']")).size();
  		System.out.println(sizeoflist);
//  		for(int i=1;i<=sizeoflist;)
//  		{
//  			if(i==6 || i==8 || i==17)
//			{
//				continue;
//			}
  			WebElement individualbar_graph = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g'][4]/*[name()='rect'])[1]"));
  			individualbar_graph.click();
  	  		Thread.sleep(4000);
  	  		int listsize = driver.findElements(By.xpath("//*[name()='svg']//*[name()='circle']")).size();
  	  		System.out.println(listsize);
//  	  		for(int j=1;j<=listsize;j++)
//  	  		{
  	  			WebElement individualline_graph = driver.findElement(By.xpath("(//*[name()='svg']//*[name()='circle'])[1]"));
  	  			individualline_graph.click();
  	  	  		Thread.sleep(3000);
  	  	  		int ele = driver.findElements(By.xpath("//*[@id='root']//tbody/tr")).size();
  	  	  		System.out.println(ele);
  	  	  		for(int k=1;k<=ele;k++)
  	  	  		{
  	  	  			WebElement tablecontent = driver.findElement(By.xpath("(//*[@id='root']//tbody/tr)[" + k + "]"));
  	  	  			String text = tablecontent.getText();
//  	  	  			System.out.println(text); 	
  	  	  			
  	  	  			for(int l=0;l<listofarray3.size();l++)
  	  	  			{
  	  	  				JsonModel mm = listofarray3.get(l);
////	  				System.out.println(mm);
  	  	  				String abc = mm.getcDateval()+" "+mm.getmval()+" "+mm.getidval();
////	  				System.out.println(abc);
  	  	  				if(abc.equalsIgnoreCase(text))
  	  	  				{
  	  	  					System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"'");
////	  					assertThat("value present in web '"+ text +"' and value present in JSON Obj '"+ abc +"' doesn't matching",abc.equals(text));
  	  	  					break;
  	  	  				}
  	  	  			}
  	  	  		}
	  	  		driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
	  	  		Thread.sleep(2000);
  	  		}
//  	  	driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
//  	  	Thread.sleep(2000);
//  		}
  		
//  	}

}

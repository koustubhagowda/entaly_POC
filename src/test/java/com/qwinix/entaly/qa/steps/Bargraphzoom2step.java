package com.qwinix.entaly.qa.steps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.Bargraphpagezoom2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Bargraphzoom2step {
	
		WebDriver driver = StepsDefinitions.driver;
		ConfigUtil config = new ConfigUtil();
		ArrayList<Jsonobject> arrayoflist = new ArrayList<>();
		Bargraphpagezoom2 objBG = new  Bargraphpagezoom2();
		
public void barchart_access_token() throws InterruptedException {
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object test= (js.executeScript("return localStorage.getItem('access_token')"));
			String token_id = (test).toString();
			String email = ("qwinix@yopmail.com").toString();
			Response repoNcommits = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("singleRepoNCommits/q-dash").header("Authorization","Bearer "+token_id)
			.contentType("application/json").log().body().
			when().get();
			String jsonobject = repoNcommits.asString();
			System.out.println(jsonobject);
			JSONObject object = new JSONObject(jsonobject);
			try
			{
				JSONArray repos = object.getJSONArray("singleRepoNCommits");
				for(int i=0;i<repos.length();i++)
				{
					
					Jsonobject jObject = new Jsonobject();
					JSONObject lj=repos.getJSONObject(i);
					jObject.setXval(lj.getString("x"));
					jObject.setYval(lj.getInt("y"));
					arrayoflist.add(jObject);
				}
			} catch (JSONException e)
			{
				
				e.printStackTrace();
			}
			}
		

public void barchart_fetchdata() throws InterruptedException {
		int sizeofbargraph = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']//*[name()='rect']")).size();
		for(int k=1;k<=sizeofbargraph;k++) {
			 if(k==6 || k==8 || k==17)
				{
						continue;
				}
			  driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g']//*[name()='rect'])[" + k + "]")).click();
			  System.out.println(sizeofbargraph);
			  Thread.sleep(4000);
			  int sizeoflist = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']//*[name()='circle']")).size();
			   System.out.println(sizeoflist);
			   for(int i=1;i<=sizeoflist;i++)
			{
				
				WebElement element = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g']//*[name()='circle'])[" + i +"]")); 
				objBG.onMouseOver(element);
				Thread.sleep(3000);
		  		String text = driver.findElement(By.xpath("//div[@class='hintStyle']")).getText();
		  		System.out.println(text);
		  		Thread.sleep(3000);
		  		for(int j=0;j<arrayoflist.size();j++)
				{
				   Jsonobject jo = arrayoflist.get(j);
		 			String value = jo.getXval()+" :\n"+jo.getYval();

		 			if(value.equalsIgnoreCase(text))
		 			{
		 				
		 				System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ value +"'");
//		 				break;
		 			}
		 		
				}
			}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@class='backbtn btn btn-primary']")).click();
		 		Thread.sleep(3000);
			   
				}
		}
		  
		}
			







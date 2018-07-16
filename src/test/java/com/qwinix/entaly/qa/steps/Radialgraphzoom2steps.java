package com.qwinix.entaly.qa.steps;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.Bargraphpagezoom2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Radialgraphzoom2steps {
	
	WebDriver driver = StepsDefinitions.driver;
	ArrayList<Basemodel> arrayoflist2 = new ArrayList<>();
	Bargraphpagezoom2 objBG = new  Bargraphpagezoom2();

	public void radial_access_token() {
		String actual = driver.findElement(By.xpath("//h3[text()='Repositories and Commits:']")).getText();
		System.out.println("actualvalue is = "+actual);
		Assert.assertEquals("Repositories and Commits:", actual);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object test= (js.executeScript("return localStorage.getItem('access_token')"));
		String token_id = (test).toString();
		String email = ("qwinix@yopmail.com").toString();
		
		
		Response repoNcommits = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("singleUserNCommits/saikiranmothe").header("Authorization","Bearer "+token_id)
		.contentType("application/json").log().body().
		when().get();
		String jsonobject = repoNcommits.asString();
		System.out.println(jsonobject);
		JSONObject objects = new JSONObject(jsonobject);
		try
		{
			JSONArray pullrequest = objects.getJSONArray("singleUserNCommits");
			for(int i=0;i<pullrequest.length();i++)
			{
				
				Basemodel bModel = new Basemodel();
				JSONObject lk = pullrequest.getJSONObject(i);
				bModel.setXval(lk.getInt("label"));
				bModel.setYval(lk.getInt("theta"));
				bModel.setZval(lk.getString("repo"));
				arrayoflist2.add(bModel);
			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		


	public void radial_fetchdata() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(4000);
	    int sizeoflist = driver.findElements(By.xpath("//div[@class='col-md-6 col-xs-6']//*[name()='svg']/*[name()='g']/*[name()='path']")).size();
	    System.out.println(sizeoflist);
	    Thread.sleep(4000);
		for(int k=3;k<=sizeoflist;k++)
		{
			if(k==2 || k==4 || k==5 || k==6 || k==7 || k==8 || k==9 || k==12 || k==15 || k==17 || k==18|| k==19)
			{
				continue;
			}

	     driver.findElement(By.xpath("(//div[@class='col-md-6 col-xs-6']//*[name()='svg']/*[name()='g']/*[name()='path'])["+ k +"]")).click();
	     Thread.sleep(4000);
	     int sizeof = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']//*[name()='path']")).size();
		 System.out.println(sizeof);
		 for(int i=1;i<=sizeof;i++)
		 	{
			 if (k==3 || k==10 || k==11 || k==14) {
			 if(i==4 || i==5 || i==3 || i==4 || i==2 || i==3 || i==4 ||  i==6 || i==8 || i==17 || i==18 || i==19 || i==20)
					{
						continue;
					}
			   }
			 WebElement element = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g']//*[name()='path'])[" + i +"]")); 
			 Thread.sleep(4000);
			 objBG.onMouseOver(element);
			 String text =driver.findElement(By.xpath("//div[@class='hintStyle']")).getText();
			 Thread.sleep(4000);
	  		 System.out.println(text);
	  		
	  		 
	  		 
	  		for(int j=0;j<arrayoflist2.size();j++)
			{
	  			Basemodel jo = arrayoflist2.get(j);
	 			String value = jo.getXval()+":\n"+jo.getYval()+":\n"+jo.getZval()+":\n";

	 			if(value.equalsIgnoreCase(text))
	 			{
	 				
	 				System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ value +"'");
//	 				break;
	 			}
	 		
			}
	  	
		}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	 		Thread.sleep(5000);
		
			}
	  

		
	}
	}

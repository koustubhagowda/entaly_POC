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
import com.qwinix.entaly.qa.pages.Bargraphpagezoom2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Bargraphzoom2step {
	
		WebDriver driver = StepsDefinitions.driver;
		ConfigUtil config = new ConfigUtil();
		ArrayList<JsonModel> arrayoflist4 = new ArrayList<>();
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
					
					JsonModel jm = new JsonModel();
					JSONObject lj=repos.getJSONObject(i);
					jm.setXval(lj.getString("x"));
					jm.setYval(lj.getInt("y"));
					arrayoflist4.add(jm);
				}
			} catch (JSONException e)
			{
				
				e.printStackTrace();
			}
			}
		

public void barchart_fetchdata() throws InterruptedException {		
	int sizeofbargraph = objBG.getsize();
	for(int k=1;k<=sizeofbargraph;k++) {
			 if(k==6 || k==8 || k==17)
				{
						continue;
				}
			  driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g']//*[name()='rect'])[" + k + "]")).click();
			  System.out.println(sizeofbargraph);
			  Thread.sleep(4000);
			  int sizeoflist = objBG.getsize1();
			   System.out.println(sizeoflist);
			   for(int i=1;i<=sizeoflist;i++)
			{
				WebElement element = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g']//*[name()='circle'])[" + i +"]")); 
				objBG.onMouseOver(element);
				Thread.sleep(3000);
		  		String text = objBG.gettext();
		  		System.out.println(text);
		  		Thread.sleep(3000);
		  		for(int j=0;j<arrayoflist4.size();j++)
				{
		  			JsonModel jo = arrayoflist4.get(j);
		 			String value = jo.getXval()+" :\n"+jo.getYval();

		 			if(value.equalsIgnoreCase(text))
		 			{
		 				
		 				System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ value +"'");
//		 				break;
		 			}
		 		
				}
			}
				objBG.barbackbutton_click();
				Thread.sleep(3000);
		}
}
		  
}
			







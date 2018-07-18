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
import com.qwinix.entaly.qa.pages.BarGraphPageZoomTwo;
import com.qwinix.entaly.qa.pages.LineChartPageZoomTwo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LineChartStepsZoomTwo {
	WebDriver driver = StepsDefinitions.driver;
	ArrayList<JsonModel> arrayoflist8 = new ArrayList<>();
	BarGraphPageZoomTwo objbs = new BarGraphPageZoomTwo();
	LineChartPageZoomTwo  objLP = new LineChartPageZoomTwo();
	
	public void linechart_access_token(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object test= (js.executeScript("return localStorage.getItem('access_token')"));
		String token_id = (test).toString();
		String email = ("qwinix@yopmail.com").toString();
		Response teamAdditionsDeletions = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("teamAdditionsDeletions/core").header("Authorization","Bearer "+token_id)
		.contentType("application/json").log().body().
		when().get();
		String jsonobject = teamAdditionsDeletions.asString();
		System.out.println(jsonobject);
		JSONObject object = new JSONObject(jsonobject);
		try
		{
			JSONObject additioNdeletion = object.getJSONObject("teamAdditionsDeletions");
			System.out.println(additioNdeletion);
			JSONArray linegrapValueArr = additioNdeletion.getJSONArray("additions");
			System.out.println(linegrapValueArr);
			for(int j=0;j<linegrapValueArr.length();j++)
			 {
				JsonModel bm = new JsonModel();
				JSONObject graphValueObj = linegrapValueArr.getJSONObject(j);
				bm.setXval(graphValueObj.getString("x"));
				bm.setType(graphValueObj.getString("type"));
				bm.setYval(graphValueObj.getInt("y"));
				 arrayoflist8.add(bm);
			 }
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  		
	
	public void linechart_fetchdata() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(4000);
		int size = objLP.getsize();
		Thread.sleep(4000);
		System.out.println(size);
		for(int k=1;k<=size;k++) {
			if(k== 4 )
			{
				continue;
			}
		 driver.findElement(By.xpath("(//div[1]/div/div/div[5]/div/center/div/div/div)["+ k +"]")).click();
		 Thread.sleep(4000);
		 int sizeoflinegraph = objLP.getsize1();
		  System.out.println(sizeoflinegraph);
		  for(int i=1;i<=sizeoflinegraph;i++) {
//			  if(k==4) {
//				  if(i==2 || i==3 || i==4) {
//					  continue;
//				  }
//			  }
		Thread.sleep(4000);
		 
		 WebElement element = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g']//*[name()='rect'])[" + i +"]")); 
		 objbs.onMouseOver(element);
		Thread.sleep(3000);
		String text = objLP.gettext();
		  System.out.println(text);
		  Thread.sleep(3000);
		  for(int j=0;j<arrayoflist8.size();j++)
			{
			  JsonModel jo = arrayoflist8.get(j);
	 			String value = jo.getXval()+"\n"+jo.getType()+":\n"+jo.getYval();

	 			if(value.equalsIgnoreCase(text))
	 			{
	 				
	 				System.out.println("value present in web '"+ text +"' and value present in JSON Obj '"+ value +"'");
//	 				break;
	 			}
	 		
			}

			   
		  }
		  objLP.linebackbutton_click();
		  Thread.sleep(3000);
		
		}
		 
	}


}

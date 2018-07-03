package com.qwinix.entaly.qa.steps;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qwinix.entaly.qa.steps.ConfigUtil;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import com.qwinix.entaly.qa.pages.BargraphPage;
import com.qwinix.entaly.qa.pages.LinechartPage;
import com.qwinix.entaly.qa.pages.RadialchartPage;
import com.qwinix.entaly.qa.pages.SigninPage;
import com.qwinix.entaly.qa.steps.CommonUtil;
import com.google.gson.JsonParser;
//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.response.Response;
import com.qwinix.entaly.qa.StepsDefinitions;

public class UserSteps
{
	public WebDriver driver=StepsDefinitions.driver;
	ConfigUtil config = new  ConfigUtil();
    String url=config.getUrl();
    
    CommonUtil commonUtilObj = new CommonUtil();
	SigninPage signinObj = new SigninPage();
	BargraphPage bargraphObj = new BargraphPage();
	RadialchartPage radialchartObj = new RadialchartPage();
	LinechartPage linechartObj = new LinechartPage();
	ArrayList<JsonModel> listofarray = new ArrayList<>();
	ArrayList<JsonModel> listofarray1 = new ArrayList<>();
	ArrayList<JsonModel> listofarray2 = new ArrayList<>();
    
  //To open url
  	public void openUrl()
  	{
  		driver.manage().window().maximize();
  		driver.get(url);
  		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  	}
  	
  	
  //Sign In
  	public void signIn(String un,String pwd) throws InterruptedException 
  	{
  		signinObj.login.click();
  		signinObj.email.sendKeys(un);
  		signinObj.password.sendKeys(pwd);
  		signinObj.sign_in.click();
  	}
  	
  	//Dashboard verify
  	public void Pageverify()
  	{
  		bargraphObj.verify.getText();
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
//  	  		System.out.println(text);
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
  			WebElement individualradial_graph = driver.findElement(By.xpath("(//div[@class='col-md-6 col-xs-6']//*[name()='svg']/*[name()='g']/*[name()='path'])[" + i +"]")); 
  			commonUtilObj.onMouseOver(individualradial_graph);
  	  		String text = radialchartObj.fetchdata.getText();
//  	  		System.out.println(text);
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
//  		Thread.sleep(5000);
//  		commonUtilObj.onMouseOver(radialchartObj.mouseover);
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
  				if(j==5 || j==7 ||j==1)
  				{
//  					if(j==5 || j==7)
  					continue;
  				}
//  				if(j==3)
//  				{
//  					if()
//  				}
  				WebElement element = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g'][" + i + "]//*[name()='circle'])[" + j + "]"));
  				commonUtilObj.onMouseOver(element);
  				String text = linechartObj.fetchdata.getText();
//  	  		System.out.println(text);
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

  	  		
//  		Thread.sleep(5000);
//  		commonUtilObj.onMouseOver(linechartObj.mouseover);
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
  	
  	//fetch access token
  	public void BarAccessToken() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		JavascriptExecutor js = (JavascriptExecutor)driver;
  		String token_id = js.executeScript("return localStorage.getItem('access_token')").toString();
//		System.out.println(token_id);
		String email = ("qwinix@yopmail.com").toString();
		Response  reposNcommits = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("reposAndCommits?repoCount=20").header("Authorization","Bearer "+token_id).contentType("application/json").log().body().when().get();
		String jsonString = reposNcommits.asString();
		//System.out.println(reposNcommits.asString());
		System.out.println(jsonString);
				
//		JsonParser parser = new JsonParser();
//		JSONObject json = (JSONObject)parser.parse(repo.);
		
		
		
		JSONObject object = new JSONObject(jsonString);
		//JSONObject object =(JSONObject) json;
		try
		{
			JSONArray repos = object.getJSONArray("repoNCommits");
			for(int i=0;i<repos.length();i++)
			{
				//System.out.println(holidays.getString(arg0));
				JsonModel mModel = new JsonModel();
				JSONObject lj=repos.getJSONObject(i);
				//System.out.println(lj.get("x"));
				//System.out.println(lj.get("y"));
				mModel.setXval(lj.getString("x"));
				mModel.setYval(lj.getInt("y"));
				listofarray.add(mModel);
			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	}
  	
  	
  	public void RadialAccessToken() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		JavascriptExecutor js = (JavascriptExecutor)driver;
  		String token_id = js.executeScript("return localStorage.getItem('access_token')").toString();
//		System.out.println(token_id);
		String email = ("qwinix@yopmail.com").toString();
		Response  userAndPullreq = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("usersAndPullreq?usersCount=20").header("Authorization","Bearer "+token_id).contentType("application/json").log().body().when().get();
		String Stringjson = userAndPullreq.asString();
		//System.out.println(userAndPullreq.asString());
		System.out.println(Stringjson);
				
//		JsonParser parser = new JsonParser();
//		JSONObject json = (JSONObject)parser.parse(repo.);
		
		
		
		JSONObject objects = new JSONObject(Stringjson);
		//JSONObject object =(JSONObject) json;
		try
		{
			JSONArray pullrequest = objects.getJSONArray("usersAndPullreq");
			for(int i=0;i<pullrequest.length();i++)
			{
				//System.out.println(holidays.getString(arg0));
				JsonModel mModel = new JsonModel();
				JSONObject lk = pullrequest.getJSONObject(i);
				//System.out.println(lk.get("label"));
				//System.out.println(lk.get("theta"));
				mModel.setXval(lk.getString("label"));
				mModel.setYval(lk.getInt("theta"));
				listofarray1.add(mModel);
			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		
  	}
  	
  	
  	public void LineAccessToken1() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		JavascriptExecutor js = (JavascriptExecutor)driver;
  		String token_id = js.executeScript("return localStorage.getItem('access_token')").toString();
//		System.out.println(token_id);
		String email = ("qwinix@yopmail.com").toString();
		Response  teamsNMembers = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("teamsNMembersNPrs").header("Authorization","Bearer "+token_id).contentType("application/json").log().body().when().get();
		String Stringofjson = teamsNMembers.asString();
		//System.out.println(teamsNMembers.asString());
		System.out.println(Stringofjson);
				
//		JsonParser parser = new JsonParser();
//		JSONObject json = (JSONObject)parser.parse(repo.);
		
		
		JSONObject objects = new JSONObject(Stringofjson);
		//JSONObject object =(JSONObject) json;
		try
		{
			JSONArray teammembers = objects.getJSONArray("teamsNMembersNPrs");
//			System.out.println(teammembers);
			for(int i=0;i<teammembers.length();i++)
			{
				JSONObject lm = teammembers.getJSONObject(i);
				JSONArray grapValueArr = lm.getJSONArray("graphValues");
				 for(int j=0;j<grapValueArr.length();j++)
				 {
					 JsonModel mModel = new JsonModel();
					 JSONObject graphValueObj = grapValueArr.getJSONObject(j);
//					 System.out.println(graphValueObj.getString("x"));
//					 System.out.println(graphValueObj.getInt("y"));
					 mModel.setXval(graphValueObj.getString("x"));
					 mModel.setYval(graphValueObj.getInt("y"));
					 listofarray2.add(mModel);
				 }

			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		
  	}
}
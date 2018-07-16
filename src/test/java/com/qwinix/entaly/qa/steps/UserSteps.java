package com.qwinix.entaly.qa.steps;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

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
	ArrayList<JsonModel> listofarray3 = new ArrayList<>();
    
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
  	public void Pageverify() throws InterruptedException
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
  	
  	public void radialZoom3AccessToken() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		JavascriptExecutor js = (JavascriptExecutor)driver;
  		String token_id = js.executeScript("return localStorage.getItem('access_token')").toString();
		String email = ("qwinix@yopmail.com").toString();
		
		Response  singlePullreqcommits = RestAssured.given().baseUri("http://gitviz.qwinix.net:8000").basePath("singlePullreqNcommits/gopherconindia.github.io/193").header("Authorization","Bearer "+token_id).contentType("application/json").log().body().when().get();
		String jsonString = singlePullreqcommits.asString();
		System.out.println(jsonString);
		
		JSONObject object = new JSONObject(jsonString);
		
		try
		{
			JSONArray singlecommits = object.getJSONArray("singlePullreqNcommits");
			for(int i=0;i<singlecommits.length();i++)
			{
				JsonModel mModel = new JsonModel();
				JSONObject rcommits=singlecommits.getJSONObject(i);
				mModel.setdata(rcommits.getString("oid"), rcommits.getString("message"), rcommits.getString("author"));
				listofarray3.add(mModel);
			}
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	}
  	
  	
  	public void Multiplegraph_test() throws InterruptedException
  	{
  		bargraphObj.changegraph.click();
  		bargraphObj.piechart.click();
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
  	  	  		String text = radialchartObj.fetchdata.getText();
  	  	  		System.out.println(text);
  	  	  		Thread.sleep(3000);
  	  	  		
  	  	  		for(int j=0;j<listofarray.size();j++)
  				{
  		  			JsonModel mm = listofarray.get(j);
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
  	  	  		String text = bargraphObj.fetchdata.getText();
  	  	  		Thread.sleep(3000);
  	  	  		
  	  	  		for(int j=0;j<listofarray.size();j++)
  	  	  		{
  	  	  			JsonModel mm = listofarray.get(j);
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
  	
 
  	public void zoom3radialgraph() throws InterruptedException
  	{
  		Thread.sleep(2000);
  		int sizeoflist = driver.findElements(By.xpath("//div[2]//*[name()='svg']/*[name()='g']/*[name()='path']")).size();
  		System.out.println(sizeoflist);
//  		for(int i=1;i<=sizeoflist;)
//  		{
//  			if(i==6 || i==8 || i==17)
//			{
//				continue;
//			}
  			WebElement individualbar_graph = driver.findElement(By.xpath("(//div[2]//*[name()='svg']/*[name()='g']/*[name()='path'])[14]"));
  			individualbar_graph.click();
  	  		Thread.sleep(4000);
  	  		int listsize = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='path']")).size();
  	  		System.out.println(listsize);
//  	  		for(int j=1;j<=listsize;j++)
//  	  		{
  	  			WebElement individualline_graph = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g']/*[name()='path'])[10]"));
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
//  	  	  				Thread.sleep(3000);
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
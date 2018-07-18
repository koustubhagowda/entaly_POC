package com.qwinix.entaly.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.steps.BarGraphStepsZoomThree;
import com.qwinix.entaly.qa.steps.UserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BarGraphStepDefinitionsZoomThree
{
	public WebDriver driver=StepsDefinitions.driver;
	UserSteps objUserSteps = new UserSteps();
	BarGraphStepsZoomThree barzoomthree = new BarGraphStepsZoomThree();
	@Given("^Im on home page of barchart$")
	public void im_on_home_page_of_barchart() throws Throwable
	{
		objUserSteps.Pageverify();	    
	}

	@When("^I navigate to zoom(\\d+) barchart table page$")
	public void i_navigate_to_zoom_barchart_table_page(int arg1) throws Throwable
	{
		barzoomthree.BarZoom3AccessToken();
	}

	@Then("^I should able to fetch the content in tabel of bargraph$")
	public void i_should_able_to_fetch_the_content_in_tabel_of_bargraph() throws Throwable
	{
		barzoomthree.zoom3bargraph();
	}

}

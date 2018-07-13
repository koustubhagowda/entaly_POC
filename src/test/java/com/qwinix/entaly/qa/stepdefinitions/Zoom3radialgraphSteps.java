package com.qwinix.entaly.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.steps.UserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Zoom3radialgraphSteps
{
	public WebDriver driver=StepsDefinitions.driver;
	UserSteps objUserSteps = new UserSteps();
	@Given("^Im on home page of radialchart$")
	public void im_on_home_page_of_radialchart() throws Throwable
	{
		objUserSteps.Pageverify();	    
	}

	@When("^I navigate to zoom(\\d+) radialchart table page$")
	public void i_navigate_to_zoom_radialchart_table_page(int arg1) throws Throwable
	{
		objUserSteps.radialZoom3AccessToken();
	}

	@Then("^I should able to fetch the content in tabel of radialgraph$")
	public void i_should_able_to_fetch_the_content_in_tabel_of_radialgraph() throws Throwable
	{
		objUserSteps.zoom3radialgraph();
	}

}

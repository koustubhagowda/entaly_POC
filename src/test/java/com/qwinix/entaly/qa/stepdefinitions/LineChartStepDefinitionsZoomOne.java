package com.qwinix.entaly.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.steps.LineChartStepsZoomOne;
import com.qwinix.entaly.qa.steps.UserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LineChartStepDefinitionsZoomOne
{
	public WebDriver driver=StepsDefinitions.driver;
	UserSteps objUserSteps = new UserSteps();
	LineChartStepsZoomOne linezoomone = new LineChartStepsZoomOne();
	@Given("^Im on dashboard home page$")
	public void im_on_dashboard_home_page() throws Throwable
	{
		objUserSteps.Pageverify();
	}
	
	@When("^I navigate on linechart$")
	public void i_navigate_on_linechart() throws Throwable
	{
		linezoomone.LineAccessToken();
	}

	@Then("^I should able to fetch the data with in linegraph$")
	public void i_should_able_to_fetch_the_data_with_in_linegraph() throws Throwable
	{
		linezoomone.LinechartOnmouseover();
	}
}
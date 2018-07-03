package com.qwinix.entaly.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.steps.UserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BargraphSteps
{
	public WebDriver driver=StepsDefinitions.driver;
	UserSteps objUserSteps = new UserSteps();
	@Given("^Im on dashboard$")
	public void im_on_dashboard() throws Throwable
	{
		objUserSteps.Pageverify();
	}

	@When("^I navigate on bargraph$")
	public void i_navigate_on_bargraph() throws Throwable
	{
		objUserSteps.BarAccessToken();
	}

	@Then("^I should able to fetch the data with in bargraph$")
	public void i_should_able_to_fetch_the_data_with_in_bargraph() throws Throwable
	{
		objUserSteps.BargraphOnmouseover();
	}
}
package com.qwinix.entaly.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.steps.UserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplegraphSteps
{
	public WebDriver driver=StepsDefinitions.driver;
	UserSteps objUserSteps = new UserSteps();
	@Given("^Im on dashboard logged in page$")
	public void im_on_dashboard_logged_in_page() throws Throwable
	{
		objUserSteps.Pageverify();
	}

	
//	@When("^I navigate on \"([^\"]*)\" page \"([^\"]*)\" page$")
//	public void i_navigate_on_page_page(String arg1, String arg2) throws Throwable
//	{
//		
//	}
	
	@When("^I navigate on graph page$")
	public void i_navigate_on_graph_page() throws Throwable
	{
		objUserSteps.BarAccessToken();
	}

	@Then("^I should able to fetch the data with graph$")
	public void i_should_able_to_fetch_the_data_with_graph() throws Throwable
	{
		objUserSteps.Multiplegraph_test();
	}
	

}

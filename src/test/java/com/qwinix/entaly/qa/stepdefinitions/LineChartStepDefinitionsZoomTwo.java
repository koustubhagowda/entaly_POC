package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.LineChartStepsZoomTwo;
import com.qwinix.entaly.qa.steps.UserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LineChartStepDefinitionsZoomTwo {
	UserSteps objUS = new UserSteps();
	LineChartStepsZoomTwo objLS = new LineChartStepsZoomTwo();
	
	@Given("^I am on Dashboard page$")
	public void i_am_on_Dashboard_page() throws Throwable {
	    objUS.Pageverify();
	}

	@When("^I navigate on line chart$")
	public void i_navigate_on_line_chart() throws Throwable {
	    objLS.linechart_access_token();
	}

	@Then("^I should able to fetch all the data in char$")
	public void i_should_able_to_fetch_all_the_data_in_char() throws Throwable {
	  objLS.linechart_fetchdata();
	}



}

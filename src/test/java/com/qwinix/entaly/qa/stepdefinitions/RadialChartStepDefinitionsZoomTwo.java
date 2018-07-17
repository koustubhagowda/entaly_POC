package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.RadialChartStepsZoomTwo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RadialChartStepDefinitionsZoomTwo {
	
	RadialChartStepsZoomTwo objRS = new RadialChartStepsZoomTwo();
	
	@When("^I navigate on the radial chart$")
	public void i_navigate_on_the_radial_chart() throws Throwable {
		objRS.radial_access_token();
	}

	@Then("^I should able to fetch all the data in radial chart$")
	public void i_should_able_to_fetch_all_the_data_in_radial_chart() throws Throwable {
		objRS.radial_fetchdata();
	}


}

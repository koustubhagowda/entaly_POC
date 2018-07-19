package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Funnelchartsteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Funnelchartstepsdef {
	Funnelchartsteps objFS = new Funnelchartsteps();
	
	@When("^I navigate to funnel chart$")
	public void i_navigate_to_funnel_chart() throws Throwable {
		objFS.getdata_funnel_chart();
	}

	@Then("^I should able to fetch all data in funnel chart$")
	public void i_should_able_to_fetch_all_data_in_funnel_chart() throws Throwable {
	   
	}



}

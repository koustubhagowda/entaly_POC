 package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Scatterchartsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scatterchartstepdef {
	Scatterchartsteps objSS = new Scatterchartsteps();
	
	@Given("^Iam on scatterchart homepage$")
	public void iam_on_scatterchart_homepage() throws Throwable {
		objSS.getdata_scatter_chart();
	}

	@When("^I navigate to sactter chart$")
	public void i_navigate_to_sactter_chart() throws Throwable {
		
	}

	@Then("^I should able to fetch all data in scatter chart$")
	public void i_should_able_to_fetch_all_data_in_scatter_chart() throws Throwable {
	    
	}

}

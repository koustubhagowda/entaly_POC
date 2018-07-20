package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Sunburstchartsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sunburstchartstepdef {
	Sunburstchartsteps objSP = new Sunburstchartsteps();
	
	
	@Given("^Iam on sunbrust homepage$")
	public void iam_on_sunbrust_homepage() throws Throwable {
		objSP.getdata_sunburst_chart();
	}

	@When("^I navigate to sunburst chart$")
	public void i_navigate_to_sunburst_chart() throws Throwable {
	    
	}

	@Then("^I should able to fetch all data in sunburst chart$")
	public void i_should_able_to_fetch_all_data_in_sunburst_chart() throws Throwable {
	  
	}



}

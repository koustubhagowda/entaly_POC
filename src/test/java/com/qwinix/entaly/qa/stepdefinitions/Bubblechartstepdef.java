package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Bubblechartsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bubblechartstepdef {
	Bubblechartsteps  objSP = new Bubblechartsteps();
	

	@Given("^Iam on bubblechart homepage$")
	public void iam_on_bubblechart_homepage() throws Throwable {
		objSP.getdata_bubblechart();
	}

	@When("^I navigate to bubble chart$")
	public void i_navigate_to_bubble_chart() throws Throwable {
	  
	}

	@Then("^I should albe to fetch all the data in bubble chart$")
	public void i_should_albe_to_fetch_all_the_data_in_bubble_chart() throws Throwable {
	    
	}


}

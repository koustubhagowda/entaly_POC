package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Bargraphzoom2step;
import com.qwinix.entaly.qa.steps.UserSteps;
import com.qwinix.entaly.qa.steps.frontendsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Bargraphzoom2stepdef {
	Bargraphzoom2step objBP = new Bargraphzoom2step();
	UserSteps objUS = new UserSteps();
	frontendsteps objfd = new frontendsteps();
	
	@Given("^Iam on Dashboard page$")
	public void iam_on_Dashboard_page() throws Throwable {
	  objUS.Pageverify();
//		objfd.display();
	}

	@When("^I navigate to Barchart$")
	public void i_navigate_to_Barchart() throws Throwable {
		objBP.barchart_access_token();
	}

	@Then("^I should able to fetch all data$")
	public void i_should_able_to_fetch_all_data() throws Throwable {
		objBP.barchart_fetchdata();
	}

}

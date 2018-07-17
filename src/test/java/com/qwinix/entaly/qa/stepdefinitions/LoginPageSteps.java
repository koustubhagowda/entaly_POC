package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.UserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageSteps
{
	UserSteps objUserSteps = new UserSteps();
	@Given("^I am on entaly website$")
	public void i_am_on_entaly_website() throws Throwable
	{
		objUserSteps.openUrl();
	}

	@When("^I enter valid login crediential for \"([^\"]*)\" & \"([^\"]*)\" & click on SignIn$")
	public void i_enter_valid_login_crediential_for_click_on_SignIn(String username, String password) throws Throwable
	{
		objUserSteps.signIn(username, password);
	}

}

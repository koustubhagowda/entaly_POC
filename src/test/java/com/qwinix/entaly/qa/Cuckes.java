package com.qwinix.entaly.qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"},tags = {"@entaly_zoom_one,@Zoom2graphS,@entaly_zoom_three,@multiple_graphs"},
		glue = {"com.qwinix.entaly.qa"},
		plugin = {"pretty",
				"html:target/cucumber-html-report"}
		)
public class Cuckes
{
	

}

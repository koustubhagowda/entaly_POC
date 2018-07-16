package com.qwinix.entaly.qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src/test/resources"},tags = {"@Linechart"},
//				@entaly_graphs,
//				@multiple_graphs,
//				@zoom3_graphs
//				@Bargraph
		glue = {"com.qwinix.entaly.qa"},
		plugin = {"pretty",
				"html:target/cucumber-html-report"}
		)
public class Cuckes
{
	

}

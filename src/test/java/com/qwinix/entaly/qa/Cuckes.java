package com.qwinix.entaly.qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD

=======
>>>>>>> poc_koustu
		features = {"src/test/resources"},tags = {"@zoom3_graphs"},
//				@entaly_graphs,
//				@multiple_graphs,
//				@zoom3_graphs
<<<<<<< HEAD

=======
>>>>>>> poc_koustu
		glue = {"com.qwinix.entaly.qa"},
		plugin = {"pretty",
				"html:target/cucumber-html-report"}
		)
public class Cuckes
{
	

}

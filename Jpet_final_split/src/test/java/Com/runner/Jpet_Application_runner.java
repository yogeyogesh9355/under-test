package Com.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Jpet_final_split/src/main/resources/jpet.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@jpet_test_cases1"},
		glue = {"com.steps"},
		monochrome = true	
		)
public class Jpet_Application_runner {
}

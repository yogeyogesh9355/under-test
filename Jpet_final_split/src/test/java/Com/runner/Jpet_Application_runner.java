package Com.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/jpet.Feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},
		tags = {"@jpet_test_cases1"},
		glue = {"Com.steps"},
		monochrome = true	
		)
public class Jpet_Application_runner {
}

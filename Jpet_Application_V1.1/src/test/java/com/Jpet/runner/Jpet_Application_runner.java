package com.Jpet.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Jpet_Application.Feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@jpet_test_case_Register,@jpet_test_case_AddToCart,@jpet_test_case_PrintProductTable,@jpet_test_case_SearchForProduct,@jpet_test_case_SearchForLink,@jpet_test_case_SignIn,@jpet_test_case_PrintBill,@jpet_test_case_RemoveProductFromCart,@jpet_test_case_CompareUserName,@jpet_test_case_PrintMyOrderTable"},
		glue = {"com.Jpet.steps"},
		monochrome = true	
		)
public class Jpet_Application_runner {
	
}
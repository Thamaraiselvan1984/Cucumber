package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/AppFeature/Billing.feature"},
		glue = {"stepdefinitions"},
		plugin= {"pretty",
			"xml:target/MyReports/report.xml","json:target/MyReports/report.json"},
		publish = true
		)

public class BillingRunner {
	
	

}

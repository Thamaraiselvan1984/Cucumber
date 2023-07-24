package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/AppFeature/Uber.feature"},
		glue = {"stepdefinitions"},
	    tags = "@Regression or not @smoke",
	    plugin= {"pretty",
	    		"json:target/MyReports/report.json",
	    		"junit:target/MyReports/report.xml"
	    		},
	    publish = true
		)

public class UberRunner {
	
}

package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/AppFeature/ScenarioOutline.feature"},
		glue = {"stepdefinitions"},
		plugin= {"pretty",
			"json:target/MyReports/report.json","xml:target/MyReports/report.xml"},
		publish = true
	)

public class ScenarioOutlineRunner {

}

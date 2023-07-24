package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/AppFeature/Orders.feature"},
		glue = {"stepdefinitions","Hooks"},
		tags = "@smoke",
	    plugin= {"pretty"}
			)
public class OrdersRunner {

}

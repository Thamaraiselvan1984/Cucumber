package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\AppFeature\\UserRegistration.feature"},
		glue = {"stepdefinition"},
		plugin= {"pretty",
		"json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml"
		},
		publish = true
		)
		
public class UserRegistrationRunner 
{
		
}

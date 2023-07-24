package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazonHooks {
	
	@Before(order = 1)
	public void setup_Browser() {
		
		System.out.println("Launch Chrome Browser");
	}
	
	@Before(order = 2)
	public void setup_URL() {
		
		System.out.println("Launch Amazon Homepage");
	}
	
	@After
	public void teardown() {
		System.out.println("Close the Browser");
	}
	
	@BeforeStep
	public void TakeScreenshot() {
		
		System.out.println("Take the Screenshot");
	}
	
	@AfterStep
	public void RefreshPage() {
		System.out.println("Refreshed the Page");
	}	
}

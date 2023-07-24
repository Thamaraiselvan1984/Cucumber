package stepdefinitions;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	 
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable datatable) 
	{
	   
		List<List<String>> userList = datatable.asLists(String.class);
		
		for(List<String> e : userList) 
		{
			System.out.println(e);
		}
	}

	@Then("user registration should be sucessful")
	public void user_registration_should_be_sucessful() {
	    
	}
}

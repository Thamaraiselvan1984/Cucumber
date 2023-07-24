package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Billing {
	
	int Billingamount;
	double taxamount;
	double finalamount;
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
		
	}

	@When("user enters billing amount {int}")
	public void user_enters_billing_amount(Integer Billingamount) {
	    this.Billingamount = Billingamount;
	}

	@When("user enters tax amount {double}")
	public void user_enters_tax_amount(double taxamount) {
	    this.taxamount = taxamount;
	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {
		
	}
	
	@Then("it gives the final amount {double}")
	public void it_gives_the_final_amount(double finalamount) {
	    this.finalamount= this.Billingamount + this.taxamount;
	}
}	


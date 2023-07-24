package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {
	
	@Given("User wants to select a cab type {string} from uber app")
	public void user_wants_to_select_a_cab_type_from_uber_app(String CarType) {
	    System.out.println("Step1: " + CarType);
	}

	@When("User selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String CarType, String PickupPoint, String DropPoint) 
	{
	    System.out.println("Step2: " + CarType + " " + PickupPoint + " " + DropPoint);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    System.out.println("Step3: Started at PickupPoint");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    System.out.println("Step4: Ended at DropPoint");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
	    System.out.println("Step5: "+ price);
	}
}

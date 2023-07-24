package stepdefinitions;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps 
{
		Product product;
		Search search;

		@Given("I have a search field on Amazon Page")
		public void Search_field() 
		{
			System.out.println("Step 1: I am on a Search Page");
		   	}

		@When("I search for a product with name {string} and price {int}")
		public void Search_Product(String productName, Integer price) {
		    System.out.println("Step 2: Search the product with name: " + productName + "Price: " + price);
		    
		    product = new Product(productName, price);
		}

		@Then("Product with name {string} should be displayed")
	    public void Search_Result(String productName)
		{
		    System.out.println("Product " + productName + " is displayed");
		    
		    search = new Search();
		    String name = search.displayProduct(product);
		    System.out.println("searched product is: " + name);
		    
		    Assert.assertEquals(product.getProductName(), name);
		    }
		
		@Then("order id is {int} and username is {string}")
		public void order_id_is_and_username_is(Integer int1, String string) {    
		}
}



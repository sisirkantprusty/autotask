package stepdefinitions;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingPurchase extends BaseUtil {
	
	private BaseUtil baseUtil;
	public ShoppingPurchase(BaseUtil baseUtil) {
		// TODO Auto-generated constructor stub
		this.baseUtil=baseUtil;
	}
	
	@Given("^The user logs in with valid userId and Password$")
	public void the_user_logs_in_with_valid_userId_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    baseUtil.dr.navigate().to("https://www.yahoo.co.in");
	}

	@Then("^Adds products to shopping bag$")
	public void adds_products_to_shopping_bag() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^The user is in Checkout$")
	public void the_user_is_in_Checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Selects Payment(\\d+) as Payment method$")
	public void selects_Payment_as_Payment_method(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^Enters the details of Payment method$")
	public void enters_the_details_of_Payment_method() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Submits the order$")
	public void submits_the_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Purchase should be successful$")
	public void purchase_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}

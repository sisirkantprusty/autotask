package stepdefinitions;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.PageObjectsRegistration;

public class Registration extends BaseUtil {
	private BaseUtil baseUtil;

	public Registration(BaseUtil baseUtil) {
		this.baseUtil = baseUtil;
	}
	PageObjectsRegistration objRegistration;

	@Given("^The user navigates to newtours site$")
	public void the_user_navigates_to_newtours_site() throws Throwable {
		System.out.println("The user navigates to club registration page");
		objRegistration = new PageObjectsRegistration(baseUtil.dr);
 		baseUtil.dr.navigate().to("http://newtours.demoaut.com/");
		baseUtil.dr.manage().window().maximize();
	}

	@When("^Enters the necessary user details$")
	public void enters_the_necessary_user_details() throws Throwable {
		objRegistration.setTxtUserName("admin");
		objRegistration.setTxtPassword("admin");
		objRegistration.setTxtConfirmPassword("admin");
		System.out.println("System enters id and passwords");
	}

	@When("^Clicks on Submit button$")
	public void clicks_on_Submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Clicks on Submit button");
		objRegistration.clickBtnRegister();
	}

	@Then("^Clicks on Register$")
	public void clicks_on_Register() throws Throwable {
		objRegistration.clickLnkRegister();
	}

	@Then("^Registration should be successful$")
	public void registration_should_be_successful() throws Throwable {
		if (objRegistration.lnkSignoff.isDisplayed()) {
			System.out.println("REGISTRATION is successful");
		} else {
			System.err.println("REGISTRATION is NOT successful");
		}
	}
	
	@Then("^Enters the necessary user name$")
	public void enters_the_necessary_user_name() throws Throwable {
		objRegistration.setTxtUserName("admin");
	}


	@Then("^Registation should not be successful$")
	public void registation_should_not_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Registration is not successful");
	}


}

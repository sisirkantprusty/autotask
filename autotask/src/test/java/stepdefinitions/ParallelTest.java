package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ParallelTest extends BaseUtil {
	private BaseUtil baseUtil;
	WebDriver dr = null;

	public ParallelTest (BaseUtil baseUtil) 
	 {
		this.baseUtil = baseUtil;
	}
	@Given("^The user in eclipse$")
	public void the_user_in_eclipse() throws Throwable {
		
	    System.out.println("The user is in eclipse");
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		System.out.println(System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.gmail.com");
		
				
		
	}

	@Then("^runs the tc$")
	public void runs_the_tc() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("The user run the tc");
		 dr.close();
	}

	@Then("^try again$")
	public void try_again() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("The user tries again");
	}

	@Then("^run should be successful$")
	public void run_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Run is successful");
	}


}

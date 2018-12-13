package testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/shoppingpurchase.feature", glue = ""/*, format = { "pretty",
		"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" }*/)

public class TestRunnerShoppingPurchase extends AbstractTestNGCucumberTests {

}

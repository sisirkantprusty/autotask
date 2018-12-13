package testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/search.feature", 
glue = ""
/*format = { "pretty",
"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
"rerun:target/cucumber-reports/rerun.txt" }*/)

public class TestRunnerSearch extends AbstractTestNGCucumberTests{

}

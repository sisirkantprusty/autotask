package testrunners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        //strict = true,
        features = {"src/test/resources/features/registration.feature"},
      //  plugin = {"json:C:/Users/Sisirkant/workspace/autotask/target/cucumber-parallel/2.json", "html:C:/Users/Sisirkant/workspace/autotask/target/cucumber-parallel/2"},
        monochrome = false,
        tags = {"~@ignored"},
        glue = {""})

public class TestRunnerOne extends AbstractTestNGCucumberTests {
	

}

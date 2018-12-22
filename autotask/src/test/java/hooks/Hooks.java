package hooks;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil{
	//private BaseUtil baseUtil;
	private BaseUtil base;
	public Hooks(BaseUtil base) {
		// TODO Auto-generated constructor stub
		this.base=base;
	}
	@Before
	public void initializeTest(Scenario scenario) {
		System.out.println("Open the browser: "+ scenario.getName()+ "\n");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		System.out.println(System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		base.dr = new ChromeDriver();
		System.out.println("Chrome driver initialized -- JENKINS TEST");
		
	}

	@After
	public void tearDownTest(Scenario scenario) {
		System.out.println("Close the browser:  " + scenario.getName() + "\n");
		base.dr.quit();
	}
}

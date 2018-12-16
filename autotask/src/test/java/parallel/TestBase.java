package parallel;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {

	WebDriver dr = null;
	
  @BeforeClass
  @Parameters("browser")
  public void beforeTest(String browserName) {
	  if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver\\chromedriver.exe");
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", "Nexus 5X");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			dr = new ChromeDriver(capabilities);
			//new RemoteWebDriver(service.getUrl(), capabilities);
			dr.get("https://www.hm.com/sv_se/index.html");
			System.out.println("hm.com is opened");

		} else {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\firefoxgeccodriver\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			// This is the location where you have installed Firefox on your
			// machine
			options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("moz:firefoxOptions", options);
			dr = new FirefoxDriver(capabilities);
			dr.get("https://www.hm.com/sv_se/index.html");
			System.out.println("hm.com is opened");
		}
  }

  @AfterClass
  public void afterTest() {
	  dr.close();
	  System.out.println("driver is closed");
  }

}

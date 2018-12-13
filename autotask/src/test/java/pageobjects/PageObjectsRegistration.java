package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsRegistration {

	public PageObjectsRegistration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'REGISTER')]")
	public WebElement lnkRegister;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement txtUserName;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public WebElement txtPassword;

	@FindBy(how = How.XPATH, using = "//input[@name='confirmPassword']")
	public WebElement txtConfirmPassword;

	// input[@name='register']

	@FindBy(how = How.XPATH, using = "//input[@name='register']")
	public WebElement btnRegister;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'SIGN-OFF')]")
	public WebElement lnkSignoff;


	public void clickLnkRegister() {
		lnkRegister.click();
	}

	public void setTxtUserName(String userName) {
		txtUserName.sendKeys(userName);
	}

	public void setTxtPassword(String userPassword) {
		txtPassword.sendKeys(userPassword);
	}

	public void setTxtConfirmPassword(String userPassword) {
		txtConfirmPassword.sendKeys(userPassword);
	}

	public void clickBtnRegister() {
		btnRegister.click();
	}
}

package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsSearch {
	public PageObjectsSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[@class='done']")
	public WebElement btnCookiePopUp;

	public void clickBtnCookiePopUp() {
		if (btnCookiePopUp.isDisplayed())
			btnCookiePopUp.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@id='search-input']")
	public WebElement txtSearchField;

	public void setTextSearchField(String searchKeyword) {
		txtSearchField.sendKeys(searchKeyword);
	}

	@FindBy(how = How.XPATH, using = "//a[@id='make-search-icon']")
	public WebElement btnSearch;

	public void clickBtnSearch() {
		btnSearch.click();
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Passende Artikel:')]")
	public WebElement lblArticlesFound;

}

package stepdefinitions;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.PageObjectsRegistration;
import pageobjects.PageObjectsSearch;

public class Search extends BaseUtil {
	
	private BaseUtil baseUtil;

	public Search(BaseUtil baseUtil) {
		this.baseUtil = baseUtil;
	}
	PageObjectsSearch objSearch;

	@Given("^The user in portal$")
	public void the_user_in_portal() throws Throwable {
		objSearch = new PageObjectsSearch(baseUtil.dr);
		baseUtil.dr.navigate().to("https://www.hm.com/de");
		baseUtil.dr.manage().window().maximize();
		objSearch.clickBtnCookiePopUp();

	}

	@Then("^Clicks on search field$")
	public void clicks_on_search_field() throws Throwable {
	  objSearch.txtSearchField.click();
	}

	@Then("^Searches for a key word$")
	public void searches_for_a_key_word() throws Throwable {
	    objSearch.setTextSearchField("Kitty");
	    objSearch.clickBtnSearch();
	}

	@Then("^Search result is displayed$")
	public void search_result_is_displayed() throws Throwable {
		String resultsFound = objSearch.lblArticlesFound.getText();
		System.out.println("Results found : " + resultsFound);

	}
	
	@Then("^Searches for a keyword such as \"([^\"]*)\"$")
	public void searches_for_a_keyword_such_as(String searchKeyword) throws Throwable {
		objSearch.setTextSearchField(searchKeyword);
	    objSearch.clickBtnSearch();
	}
	
	@Then("^No Search result found page is displayed$")
	public void no_Search_result_found_page_is_displayed() throws Throwable {
		System.out.println("No results found");
	}



}

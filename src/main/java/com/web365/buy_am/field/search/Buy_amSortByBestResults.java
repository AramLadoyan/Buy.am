package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amSortByBestResults extends Buy_amBasePage {

	public Buy_amSortByBestResults(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SORT_BY_BUTTON_XPATH)
	public WebElement sortByButton;

	@FindBy(xpath = BEST_RESULTS_BUTTON_XPATH)
	public WebElement bestresultsButton;

	@FindBy(xpath = BEST_RESULTS_RESULT_XPATH)
	public WebElement bestResultsResult;
	
	public Buy_amSortByBestResults searchFieldClick() {
		searchField.click();
		return new Buy_amSortByBestResults(this.driver);
	}

	public Buy_amSortByBestResults searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amSortByBestResults(this.driver);
	}

	public Buy_amSortByBestResults enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amSortByBestResults(this.driver);
	}

	public Buy_amSortByBestResults sortByButtonClick() {
		sortByButton.click();
		return new Buy_amSortByBestResults(this.driver);
	}

	public Buy_amSortByBestResults bestresultsButtonClick() {
		bestresultsButton.click();
		return new Buy_amSortByBestResults(this.driver);
	}

}

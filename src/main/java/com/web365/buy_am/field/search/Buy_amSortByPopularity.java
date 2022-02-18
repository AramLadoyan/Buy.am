package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amSortByPopularity extends Buy_amBasePage {

	public Buy_amSortByPopularity(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SORT_BY_BUTTON_XPATH)
	public WebElement sortByButton;

	@FindBy(xpath = POPULARITY_BUTTON_XPATH)
	public WebElement popularityButton;

	@FindBy(xpath = POPULARITY_RESULT_XPATH)
	public WebElement popularityResult;

	public Buy_amSortByPopularity searchFieldClick() {
		searchField.click();
		return new Buy_amSortByPopularity(this.driver);
	}

	public Buy_amSortByPopularity searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amSortByPopularity(this.driver);
	}

	public Buy_amSortByPopularity enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amSortByPopularity(this.driver);
	}

	public Buy_amSortByPopularity sortByButtonClick() {
		sortByButton.click();
		return new Buy_amSortByPopularity(this.driver);
	}

	public Buy_amSortByPopularity popularityButtonClick() {
		popularityButton.click();
		return new Buy_amSortByPopularity(this.driver);
	}


}

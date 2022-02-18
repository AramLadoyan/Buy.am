package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amSortByReleaseDate extends Buy_amBasePage {

	public Buy_amSortByReleaseDate(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SORT_BY_BUTTON_XPATH)
	public WebElement sortByButton;

	@FindBy(xpath = RELEASE_DATE_BUTTON_XPATH)
	public WebElement releaseDateButton;

	@FindBy(xpath = RELEASE_DATE_RESULT_XPATH)
	public WebElement releaseDateButtonResult;

	public Buy_amSortByReleaseDate searchFieldClick() {
		searchField.click();
		return new Buy_amSortByReleaseDate(this.driver);
	}

	public Buy_amSortByReleaseDate searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amSortByReleaseDate(this.driver);
	}

	public Buy_amSortByReleaseDate enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amSortByReleaseDate(this.driver);
	}

	public Buy_amSortByReleaseDate sortByButtonClick() {
		sortByButton.click();
		return new Buy_amSortByReleaseDate(this.driver);
	}

	public Buy_amSortByReleaseDate releaseDateButtonClick() {
		releaseDateButton.click();
		return new Buy_amSortByReleaseDate(this.driver);
	}

}

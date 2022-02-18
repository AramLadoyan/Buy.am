package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amSortByHighestPrice extends Buy_amBasePage {

	public Buy_amSortByHighestPrice(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SORT_BY_BUTTON_XPATH)
	public WebElement sortByButton;

	@FindBy(xpath = HIGHEST_PRICE_BUTTON_XPATH)
	public WebElement highestPriceButton;

	@FindBy(xpath = HIGHEST_PRICE_RESULT_XPATH)
	public WebElement highestPriceResult;

	public Buy_amSortByHighestPrice searchFieldClick() {
		searchField.click();
		return new Buy_amSortByHighestPrice(this.driver);
	}

	public Buy_amSortByHighestPrice searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amSortByHighestPrice(this.driver);
	}

	public Buy_amSortByHighestPrice enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amSortByHighestPrice(this.driver);
	}

	public Buy_amSortByHighestPrice sortByButtonClick() {
		sortByButton.click();
		return new Buy_amSortByHighestPrice(this.driver);
	}

	public Buy_amSortByHighestPrice highestPriceButtonClick() {
		highestPriceButton.click();
		return new Buy_amSortByHighestPrice(this.driver);
	}

}

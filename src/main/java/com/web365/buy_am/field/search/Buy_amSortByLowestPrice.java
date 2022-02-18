package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amSortByLowestPrice extends Buy_amBasePage {

	public Buy_amSortByLowestPrice(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SORT_BY_BUTTON_XPATH)
	public WebElement sortByButton;

	@FindBy(xpath = LOWEST_PRICE_BUTTON_XPATH)
	public WebElement lowestPriceButton;

	@FindBy(xpath = LOWEST_PRICE_RESULT_XPATH)
	public WebElement lowestPriceResult;

	public Buy_amSortByLowestPrice searchFieldClick() {
		searchField.click();
		return new Buy_amSortByLowestPrice(this.driver);
	}

	public Buy_amSortByLowestPrice searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amSortByLowestPrice(this.driver);
	}

	public Buy_amSortByLowestPrice enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amSortByLowestPrice(this.driver);
	}

	public Buy_amSortByLowestPrice sortByButtonClick() {
		sortByButton.click();
		return new Buy_amSortByLowestPrice(this.driver);
	}

	public Buy_amSortByLowestPrice lowestPriceButtonClick() {
		lowestPriceButton.click();
		return new Buy_amSortByLowestPrice(this.driver);
	}


}

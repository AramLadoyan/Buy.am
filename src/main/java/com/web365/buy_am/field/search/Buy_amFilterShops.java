package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amFilterShops extends Buy_amBasePage {
	
	public Buy_amFilterShops(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SECTIONS_BUTTON_XPATH)
	public WebElement sectionsButton;

	@FindBy(xpath = SHOPS_BUTTON_XPATH)
	public WebElement shopsButton;

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SEARCH_RESULT_XPATH)
	public WebElement searchResult;

	public Buy_amFilterShops sectionsButtonClick() {
		sectionsButton.click();
		return new Buy_amFilterShops(this.driver);
	}

	public Buy_amFilterShops shopsButtonClick() {
		shopsButton.click();
		return new Buy_amFilterShops(this.driver);
	}

	public Buy_amFilterShops searchFieldClick() {
		searchField.click();
		return new Buy_amFilterShops(this.driver);
	}

	public Buy_amFilterShops searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amFilterShops(this.driver);
	}

	public Buy_amFilterShops enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amFilterShops(this.driver);
	}


}

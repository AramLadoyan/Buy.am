package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amFilterCarrefour extends Buy_amBasePage {
	
	public Buy_amFilterCarrefour(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SECTIONS_BUTTON_XPATH)
	public WebElement sectionsButton;

	@FindBy(xpath = CARREFOUR_BUTTON_XPATH)
	public WebElement carrefourButton;

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = CARREFOUR_RESULT_XPATH)
	public WebElement searchResult;

	public Buy_amFilterCarrefour sectionsButtonClick() {
		sectionsButton.click();
		return new Buy_amFilterCarrefour(this.driver);
	}

	public Buy_amFilterCarrefour carrefourButtonClick() {
		carrefourButton.click();
		return new Buy_amFilterCarrefour(this.driver);
	}

	public Buy_amFilterCarrefour searchFieldClick() {
		searchField.click();
		return new Buy_amFilterCarrefour(this.driver);
	}

	public Buy_amFilterCarrefour searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amFilterCarrefour(this.driver);
	}

	public Buy_amFilterCarrefour enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amFilterCarrefour(this.driver);
	}


}

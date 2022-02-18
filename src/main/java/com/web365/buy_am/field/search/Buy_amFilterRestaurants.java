package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amFilterRestaurants extends Buy_amBasePage{
	
	public Buy_amFilterRestaurants(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SECTIONS_BUTTON_XPATH)
	public WebElement sectionsButton;

	@FindBy(xpath = RESTAURANTS_BUTTON_XPATH)
	public WebElement restaurantsButton;

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SEARCH_RESULT_XPATH)
	public WebElement searchResult;

	public Buy_amFilterRestaurants sectionsButtonClick() {
		sectionsButton.click();
		return new Buy_amFilterRestaurants(this.driver);
	}

	public Buy_amFilterRestaurants restaurantsButtonClick() {
		restaurantsButton.click();
		return new Buy_amFilterRestaurants(this.driver);
	}

	public Buy_amFilterRestaurants searchFieldClick() {
		searchField.click();
		return new Buy_amFilterRestaurants(this.driver);
	}

	public Buy_amFilterRestaurants searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amFilterRestaurants(this.driver);
	}

	public Buy_amFilterRestaurants enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amFilterRestaurants(this.driver);
	}


}

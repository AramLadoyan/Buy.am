package com.web365.buy_am.field.search;

import static com.web365.buy_am.field.search.Buy_amSearchFieldConstants.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.buy.am.page.base.Buy_amBasePage;

public class Buy_amSearchFilterAll extends Buy_amBasePage {

	public Buy_amSearchFilterAll(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SECTIONS_BUTTON_XPATH)
	public WebElement sectionsButton;

	@FindBy(xpath = ALL_BUTTON_XPATH)
	public WebElement allButton;

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SEARCH_RESULT_XPATH)
	public WebElement searchResult;

	public Buy_amSearchFilterAll sectionsButtonClick() {
		sectionsButton.click();
		return new Buy_amSearchFilterAll(this.driver);
	}

	public Buy_amSearchFilterAll allButtonType() {
		allButton.click();
		return new Buy_amSearchFilterAll(this.driver);
	}

	public Buy_amSearchFilterAll searchFieldClick() {
		searchField.click();
		return new Buy_amSearchFilterAll(this.driver);
	}

	public Buy_amSearchFilterAll searchFieldType() {
		searchField.sendKeys("shops");
		return new Buy_amSearchFilterAll(this.driver);
	}

	public Buy_amSearchFilterAll enterKeyClick() {
		searchField.sendKeys(Keys.ENTER);
		return new Buy_amSearchFilterAll(this.driver);
	}

}

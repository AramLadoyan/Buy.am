package com.we365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.Buy_amBaseTest;
import com.web365.buy_am.field.search.Buy_amFilterShops;

public class Buy_amFilterShopsTest extends Buy_amBaseTest {
	
	@Test
	public void searchFilterShopsTest() {
		System.out.println("Test Case ID  Search10");
		System.out.println("Verify user is able to filter searches to Shops");
		Buy_amFilterShops search = new Buy_amFilterShops(driver);
		System.out.println("Navigate to buy.am");
		search = search.sectionsButtonClick();
		System.out.println("Step1 Click on the 'Sections' button");
		search = search.shopsButtonClick();
		System.out.println("Step2 Click on the 'Shops' button");
		search = search.searchFieldClick();
		System.out.println("Step3 Click on the Search Field");
		search = search.searchFieldType();
		System.out.println("Step4 Enter 'shops' in the search field");
		search = search.enterKeyClick();
		System.out.println("Step5 Click on the ENTER key");

		Assert.assertTrue(search.searchResult.isDisplayed());
	}

}

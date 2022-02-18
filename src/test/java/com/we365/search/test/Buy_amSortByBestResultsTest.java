package com.we365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.Buy_amBaseTest;
import com.web365.buy_am.field.search.Buy_amSortByBestResults;

public class Buy_amSortByBestResultsTest extends Buy_amBaseTest {
	
	@Test
	public void searchSortByBestresultsTest() {
		System.out.println("Test Case ID  Search11");
		System.out.println("Verify user is able to filter products to Best Results");
		Buy_amSortByBestResults search = new Buy_amSortByBestResults(driver);
		System.out.println("Navigate to buy.am");
		search = search.searchFieldClick();
		System.out.println("Step1 Click on the Search Field");
		search = search.searchFieldType();
		System.out.println("Step2 Enter 'shops' in the search field");
		search = search.enterKeyClick();
		System.out.println("Step3 Click on the ENTER key");
		search = search.sortByButtonClick();
		System.out.println("Step4 Click on the 'Sort By' button");
		search = search.bestresultsButtonClick();
		System.out.println("Step5 Click on the 'Best Results' option");

		Assert.assertTrue(search.bestResultsResult.isDisplayed());

	}

}

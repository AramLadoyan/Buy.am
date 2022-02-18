package com.we365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.Buy_amBaseTest;
import com.web365.buy_am.field.search.Buy_amSortByReleaseDate;

public class Buy_amSortByReleaseDateTest extends Buy_amBaseTest {
	
	@Test
	public void searchSortByReleaseDateTest() {
		System.out.println("Test Case ID  Search12");
		System.out.println("Verify user is able to filter products to Release Date");
		Buy_amSortByReleaseDate search = new Buy_amSortByReleaseDate(driver);
		System.out.println("Navigate to buy.am");
		search = search.searchFieldClick();
		System.out.println("Step1 Click on the Search Field");
		search = search.searchFieldType();
		System.out.println("Step2 Enter 'shops' in the search field");
		search = search.enterKeyClick();
		System.out.println("Step3 Click on the ENTER key");
		search = search.sortByButtonClick();
		System.out.println("Step4 Click on the 'Sort By' button");
		search = search.releaseDateButtonClick();
		System.out.println("Step5 Click on the 'Release Date' option");

		Assert.assertTrue(search.releaseDateButtonResult.isDisplayed());

	}

}

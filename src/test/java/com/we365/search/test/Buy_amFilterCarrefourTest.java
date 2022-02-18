package com.we365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.Buy_amBaseTest;
import com.web365.buy_am.field.search.Buy_amFilterCarrefour;

public class Buy_amFilterCarrefourTest extends Buy_amBaseTest{
	
	@Test
	public void searchFilterCarrefourTest() {
		System.out.println("Test Case ID  Search8");
		System.out.println("Verify user is able to filter searches to Carrefour");
		Buy_amFilterCarrefour search = new Buy_amFilterCarrefour(driver);
		System.out.println("Navigate to buy.am");
		search = search.sectionsButtonClick();
		System.out.println("Step1 Click on the 'Sections' button");
		search = search.carrefourButtonClick();
		System.out.println("Step2 Click on the 'Carrefour' button");
		search = search.searchFieldClick();
		System.out.println("Step3 Click on the Search Field");
		search = search.searchFieldType();
		System.out.println("Step4 Enter 'shops' in the search field");
		search = search.enterKeyClick();
		System.out.println("Step5 Click on the ENTER key");

		Assert.assertTrue(search.searchResult.isDisplayed());
	}

}

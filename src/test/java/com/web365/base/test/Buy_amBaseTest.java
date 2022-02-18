package com.web365.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Buy_amBaseTest {
	
	protected WebDriver driver;
	@BeforeClass
	public void openBrowser () {
		driver = new ChromeDriver();
		driver.get("https://buy.am/en/");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}

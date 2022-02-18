package com.web365.buy.am.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Buy_amBasePage {
	
protected WebDriver driver;
	
	public Buy_amBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}


}

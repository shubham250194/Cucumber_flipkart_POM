package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;



public class HomePage extends TestBase {

	
	
	@FindBy (xpath = "//div[contains(text(),'My Account')])")
			WebElement myacc;
	
	
	
	public String verifyHomePageTitile() {
		
		return driver.getTitle();
	}
	
	
}

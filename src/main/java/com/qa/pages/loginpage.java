package com.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class loginpage extends TestBase {

//	@FindBy(xpath="//a[contains(text(),'Login')]")
//	WebElement loginlink;
	
	@FindBy(xpath = "//*[contains(text(),'Login')]")
	WebElement loginlink;
	
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginbtn;
	
//	@FindBy(xpath="//input[contains(@class,'_2zrpKA _1dBPDZ')]")
//	WebElement username;
//	
//	@FindBy(xpath="//input[contains(@class, '_2zrpKA _3v41xv _1dBPDZ')]")
//	WebElement password;
//	
//	@FindBy(xpath="//button[contains(@class,'_2AkmmA _1LctnI _7UHT_c')]")
//	WebElement loginbtn;
	
	
//	public void account() {
//		loginlink.click();
//	}
	
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage login(String un, String pass) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginlink);
		
		username.sendKeys(un);
		password.sendKeys(pass);
		
		loginbtn.click();
		
		return new HomePage();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

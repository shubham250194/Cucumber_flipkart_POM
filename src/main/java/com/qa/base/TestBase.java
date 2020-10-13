package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
			
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("G:/automation/Cucumber_Practice/src/main/java/com/qa/base/config.properties");
			prop.load(fis);
	}	catch(FileNotFoundException e) {
				e.printStackTrace();
	}	catch(IOException e) {
		e.printStackTrace();
		}
	}
	
	public void Initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "G:/automation/Cucumber_Practice/src/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
				driver = new FirefoxDriver(); 
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}
	

	
	
}

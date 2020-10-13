package stepDefinitions;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.loginpage;

import cucumber.api.java.en.*;

public class loginpageSteps extends TestBase{
	
	public static loginpage lp;
	public static HomePage hp;
	
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		Initialization();
		lp = new loginpage();
	}

	@When("^user login with valid credentials$")
	public void user_login_with_valid_credentials()  {
//		lp = new loginpage();
//		lp.account();
		
		System.out.println("username*************************" + prop.getProperty("username") + prop.getProperty("password"));
		
		
	    lp.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}

	
	@Then("^user lands on homepage and verify the titile of the home page$")
	public void user_lands_on_homepage() {
	   
		hp = new HomePage();
		hp.verifyHomePageTitile();
		
	}



}

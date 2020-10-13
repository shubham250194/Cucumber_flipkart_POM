package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

   @RunWith(Cucumber.class)
   @CucumberOptions(
		   features="G:/automation/Cucumber_Practice/src/main/java/features/login.feature",
   			glue= {"stepDefinitions"},
   			format= {"pretty", "html:test-output"},
   			dryRun = false,
   			monochrome = true
   			


)


public class testRunner {

}

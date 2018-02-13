
package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		         features = {"src/main/java/features"},
		         format = {"html:target/cucumber-pretty", "json:target/cucumber.json" },
		         glue = {"helpers","stepDefination"}
		        
		     )
        
                
        


public class RunSalesforceApp {
	
  
    
	

        
        
}

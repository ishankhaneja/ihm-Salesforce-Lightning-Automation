package stepDefination;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;
import cucumber.api.java.en.Then;
import utils.CommonUtils;

public class NavigationStepDefination extends AbstractPageStepDefination { 
//	public static WebDriver driver;
	public WebDriverWait wait;
	

	 
	 CommonUtils utils = new CommonUtils();
	    JSONObject env = utils.getDataFile("environment.json");
	 
	    @Then("^the user navigate to the salesforce page$")
	    public void salesforceurl() {	
	    	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	        //Create a wait. All test and page classes use this wait.
	        wait = new WebDriverWait(driver,15);
	        //Maximize Window
	        driver.manage().window().maximize();
	    	driver.get(env.get("SFDC_Lightning").toString()); 
	    	System.out.println(env.get("SFDC_Lightning"));
	    	
	    }
	    
	    

}

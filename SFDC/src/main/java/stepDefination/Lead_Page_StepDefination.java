package stepDefination;
import static org.testng.AssertJUnit.assertTrue;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import Pages.AccountsPage;
import Pages.BasePage;
import Pages.LeadsPathPage;
import Pages.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.AccountPageActions;
import utils.CommonUtils;
import utils.AccountPageActions;

public class Lead_Page_StepDefination {
	public static WebDriver driver;
    public WebDriverWait wait;
    LoginPage login;
    AccountsPage account;
    LeadsPathPage lead;
    public String role;
    String URL;

    CommonUtils utils = new CommonUtils();
    
    JSONObject testData1 = utils.getDataFile("AccountPage.json");
    JSONObject testData = utils.getDataFile("LeadPage.json");
    JSONObject testData2 = utils.getDataFile("Setup_Page_Data.json");
    
    
    
//
//    @Given("^the user converts the lead$")
//	 public void the_user_converts_the_lead() {
//    	lead = new LeadsPathPage(driver);
//		  lead.convertbutton();
//	 }
    
    
   
    
    

}

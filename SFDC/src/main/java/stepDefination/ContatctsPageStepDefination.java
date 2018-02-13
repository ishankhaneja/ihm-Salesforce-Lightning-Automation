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
import Pages.ContactsPage;
import Pages.LeadsPathPage;
import Pages.Leads_add_task_page;
import Pages.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.AccountPageActions;
import utils.CommonUtils;
import utils.AccountPageActions;


public class ContatctsPageStepDefination extends AbstractPageStepDefination{
//	public static WebDriver driver;
//	Webdriver driver;
    ContactsPage contact;
    AccountsPage account;
    LeadsPathPage lead;
    Leads_add_task_page leadtask;
    
    
    
    CommonUtils utils = new CommonUtils();
    
   
    JSONObject testData = utils.getDataFile("LeadPage.json");
    JSONObject testData2 = utils.getDataFile("Setup_Page_Data.json");
    
    

//    @Given("^the user create a new contact$")
//    public void createnewcontact() {
//    	contact = new ContactsPage(driver);
//    	contact.newcontactbutton();
//    	
//    }
    	
    	
    	
    	
    	
    
    
    
}

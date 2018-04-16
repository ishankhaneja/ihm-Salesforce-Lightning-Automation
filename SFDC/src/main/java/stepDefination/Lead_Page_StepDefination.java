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

public class Lead_Page_StepDefination extends AbstractPageStepDefination{
//	public static WebDriver driver;
//    public WebDriverWait wait;
    LoginPage login;
    AccountsPage account;
    LeadsPathPage lead;
    public String role;
    String URL;
    Leads_add_task_page leadtask;

    CommonUtils utils = new CommonUtils();
    
    JSONObject testData = utils.getDataFile("LeadPage.json");
    JSONObject testData2 = utils.getDataFile("Setup_Page_Data.json");
    
    
    @Then("^the user create a new lead account")
    public void createleadaccount() {
        lead = new LeadsPathPage(driver);
        lead.aeleadstab();
        lead.newleadsbutton();
        lead.lastname(testData.get("Lastname").toString());
        lead.company(testData.get("Company").toString());
        lead.street(testData.get("Street").toString());
        lead.city(testData.get("City").toString());
        lead.zipcode(testData.get("Zipcode").toString());
        lead.stateselect();
        lead.statename();
        lead.selectleadsource();
        lead.leadsourcename1();
        lead.selectleadsourcetype();
        lead.leadsourcetype1();
        lead.selectindustrytype();
        lead.selectsubindustrytype();
        lead.selectsubindustry();
        lead.clicksavebutton();

    }
    
    
    @Given("^the user converts the lead$")
	 public void the_user_converts_the_lead() {
    	lead = new LeadsPathPage(driver);
		  lead.convertbutton();
	 }
    
    @Given("^the user convert the lead to account$")
    public void convertlead() {
    	lead = new LeadsPathPage(driver);
    	lead.convertleadbutton(); 	
    }
    
    @And("^the user create a new task$")
    public void createnewtask() {
    	leadtask = new Leads_add_task_page(driver);
    	leadtask.createnewtask("Testdata", "4/2/2018");	
    }	
    
    @And("^the user add a new task$")
    public void createtask() {
    	leadtask = new Leads_add_task_page(driver);
//    	leadtask.selectstatus("Completed");
    	leadtask.filltaskdetails("Completed", "Email", "Low");
    }
       
    
    
    
    
    
//    @And("^the user clicks the (.*)$")
//    public void clicks(String button) {
//    		 
//    System.out.println("*****************" + button);
//    click(By.xpath(button));
//    
//    }
    
    
    private void createtaskdata() {
		// TODO Auto-generated method stub
		
	}


	@And("^the user clicks the leadaccount$")
    public void clickleadaccount() {
    	lead = new LeadsPathPage(driver);
    	lead.leadaccount();
    }
    
//
//    @Given("^the user converts the lead$")
//	 public void the_user_converts_the_lead() {
//    	lead = new LeadsPathPage(driver);
//		  lead.convertbutton();
//	 }
    
    
   
    
    

}

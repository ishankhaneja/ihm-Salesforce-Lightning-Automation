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
import Pages.National_accounts_page;
import Pages.New_Opportunity_Edit_Page;
import Pages.New_Opportunity_Page;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.AccountPageActions;
import utils.CommonUtils;
import utils.AccountPageActions;



public class homestepDefination extends AbstractPageStepDefination {
//	public static WebDriver driver;
    public WebDriverWait wait;
    LoginPage login;
    AccountsPage account;
    National_accounts_page nationalaccount;
    LeadsPathPage lead;
    public String role;
    String URL;
    Leads_add_task_page leadtask;
    ContactsPage contact;
    New_Opportunity_Page newopportunitypage;
    New_Opportunity_Edit_Page newopportunityeditpage;
    
   
    
    
    String baseURL = "https://ihm--lightngqa.lightning.force.com/";
	
//    public void AccountsPageInfo () throws Exception{
//    }
    
    
    CommonUtils utils = new CommonUtils();
   
 
    JSONObject testData = utils.getDataFile("LeadPage.json");
    JSONObject testData2 = utils.getDataFile("Setup_Page_Data.json");
    JSONObject testData3 = utils.getDataFile("OpportunityPage.json");
    
    
    @Given("^the user opens the chrome page$")
    public void setup () throws Exception{   	
    	 //*************PAGE INSTANTIATIONS*************
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1114813\\Downloads\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        //Create a wait. All test and page classes use this wait.
        wait = new WebDriverWait(driver,15);
        //Maximize Window
        driver.manage().window().maximize();
    }
 
    @Then("^the user navigate to the salesforce page$")
    public void salesforceurl() {	
    	login = new LoginPage(driver);
    	driver.get(baseURL); 
    	System.out.println(baseURL);
    	
    }
    
    @Given("^the user login in as '(.*)'$")
    public void salesforceuser(String profile) {
    	
    	login = new LoginPage(driver);
    	login.loginAsAdmin();
    	WebElement setupsearch = driver.findElement(By.id("setupSearch"));
        setupsearch.sendKeys(profile);
        login.loginsalesforce();       
        
    }
    
    
    @Then("^the user create a new advertiser account")
    public void createadvertiser() {
    	account = new AccountsPage(driver);
    	account.newaccount();
    	account.nextbutton();
    	account.accountname();
    	account.selectindustrytype();
    	account.selectindustryname();
    	account.selectsubindustrytype();
    	account.selectsubindustry();
    	account.street(testData.get("Street").toString());
    	account.city(testData.get("City").toString());
    	account.zipcode(testData.get("Zipcode").toString());
    	account.stateselect();
    	account.clicksavebutton();
    	account.details_tab();
//    	account.verifyaddress();

    }
    
    
    @Then("^the user create a new national advertiser account")
    public void createnationaladvertiser() {
    	account = new AccountsPage(driver);
    	nationalaccount= new National_accounts_page(driver);
    	account.newaccount();
    	account.nextbutton();
    	account.accountname();
    	nationalaccount.selectindustrytype();
    	nationalaccount.selectindustryname();
    	nationalaccount.selectsubindustrytype();
    	nationalaccount.selectsubindustry();
    	nationalaccount.street(testData.get("Street").toString());
    	nationalaccount.city(testData.get("City").toString());
    	nationalaccount.zipcode(testData.get("Zipcode").toString());
    	nationalaccount.stateselect();
    	account.clicksavebutton();
    	account.details_tab();
//    	account.verifyaddress();

    }
    @Then("^the user create a new agency account")
    public void createagencyaccount() {
    	account = new AccountsPage(driver);
    	account.newaccount();
    	account.selectagency();
    	account.nextbutton();
    	account.agencyname();
    	account.street(testData.get("Street").toString());
    	account.city(testData.get("City").toString());
    	account.zipcode(testData.get("Zipcode").toString());
    	account.stateselect();
    	account.clicksavebutton();
    	
    }
   
    
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
    
    @And("^the user create new task$")
    public void createnewtask() {
    	leadtask = new Leads_add_task_page(driver);
    	leadtask.createnewtask("Testdata", "4/2/2018");	
    	leadtask.filltaskdetails("Completed", "Email", "Low");
    }
    
    
    
//    @And("^the user clicks the (.*)$")
//    public void clicks(String button) {
//    		 
//    System.out.println("*****************" + button);
//    click(By.xpath(button));
//    
//    }
    
    
    @And("^the user clicks the leadaccount$")
    public void clickleadaccount() {
    	lead = new LeadsPathPage(driver);
    	lead.leadaccount();
    }
    
    @Given("^the user clicks the related tab$")
    public void clickrelatedtab() {
       account.relatedtab();	
    	
    }
    
    @Then("^the user clicks the account tab$")
    public void loginsalesforce() throws Exception {
    	account = new AccountsPage(driver);
    	account.aeaccountstab();
    }
    
    @And("^the user verify the address$")
    public void the_user_verify_address() throws InterruptedException {
    	account = new AccountsPage(driver);
    	account.details_tab();
    	account.verifyaddress();
    	
    	account.acceptchange();
    }
    
   
    
    @Given("^the user views the page$")
    public void sleep() {
    	
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("^the user clicks the '(.*)'$")
		public void click (By elementLocation) {
		  login = new LoginPage(driver);
		  account = new AccountsPage(driver);
	        driver.findElement(elementLocation).click();
           System.out.println("Given statement executed successfully");
	}
	
	
	
	@And("^the user clicks the export button$")
		public void clickexport() {
		account = new AccountsPage(driver);
		account.showmore();
		account.account_export();
		
//		AccountsPage.show_more.click();
//		AccountsPage.account_export.click();
	}
	
	 @Then("^I see a browser title containing \"([^\"]*)\"$")
	    public void i_see_a_browser_title_containing(String text) throws Throwable {
	        assertTrue(driver.getTitle().contains(text));
	    }
   @And("^the user captures the url$")
   public void captureurl() {
	   URL = driver.getCurrentUrl();
	   System.out.println(URL);
   }
   
	@And("^the user navigate to the captured url$")
	public void navigatecaptureurl() {
		driver.navigate().to(URL);	
		System.out.println(URL);
	}
	
	@And("^the user logout from the salesforce page$")
	public void logoutprofile() {
		account = new AccountsPage(driver);
		account.logout();
	}
	
	 @Given("^the user enters the value '(.*?)'$")
	 public void searchFor(By elementLocation,String searchTerm) {
		WebElement searchField = driver.findElement(elementLocation);
		searchField.sendKeys(searchTerm);
	}
	 
      @And("^the user verifies the records on the related list for Advertiser$")
      public void verifyrecords() {
    	  
      }

      @And("^the user verifies the account update request$")
      public void verifyaccountupdaterequest() {
    	  account = new AccountsPage(driver);
    	  account.account_update_request();
    	  account.new_account_update_button();
      }
      
      
      @And("^the user add '(.*?)' in accountteam")
      public void adduseraccountteam(String profile) {
    	  account = new AccountsPage(driver);
    	  account.relatedtab();
    	  account.new_account_team();
    	  account.add_team("Account Manager");
    	  driver.findElement(By.xpath("//*[@title = 'Search People']")).sendKeys(profile);
    	  account.clicksavebutton();


      }
      @And("^the user remove me from team$")
      public void adduserremovemefromteam() {
    	  account = new AccountsPage(driver);
    	  account.showmore();
    	  account.remove_me_from_team();

      }
      
      
      @And("^the user verifies the A_R_Account_hierarchy values$")
      public void a_r_values() {
    	  account = new AccountsPage(driver);
    	  account.verify_legal_ar_values();
    	 
      }
      @Given("^the user click new contact$")
      public void clickcontact() {
    	  contact = new ContactsPage(driver);
    	  contact.newcontact();
    	  
      }
      
      @Given("^the user create a new contact$")
      public void createnewcontact() {
      	contact = new ContactsPage(driver);
      	contact.newcontactbutton("Iheart", "Radio", "srg1@gmail.com");
      	
      	
      }
      @Given("^the user edit the contact$")
      public void editcontact() {
    	  contact = new ContactsPage(driver);
    	  contact.editcontact();
    	  contact.newcontactbutton("Iheart", "Radio1", "srg11@gmail.com");
      }
      
      @Then("^I scroll to (top|end) of page$")
      public void scroll_page(String to) throws Exception
  	{
  		BasePage.scrollPage(to);
  	}
      
      @Then("^the user select temp advertiser$")
      public void clicktempadvertiser() {
    	  account = new AccountsPage(driver);
    	  account.newaccount();
    	  account.clicktemporaryadvertiser();
    	  
      }
      @And("^the user clicks the new opportunity button$")
      public void newopportunity() {
    	  account = new AccountsPage(driver);
    	  newopportunitypage = new New_Opportunity_Page(driver);  
    	  account.newopportunitybutton();
    	  
      }
      
      @And("^the user clicks the next button$")
      public void clicknext() {
    	  newopportunitypage = new New_Opportunity_Page(driver);  
     	 newopportunitypage.nextbutton();
      }
      
     @And("^the user select '(.*)' record type$")
     public void selectrecordtype(String recordtype) {
    	 newopportunitypage = new New_Opportunity_Page(driver);  
    	 newopportunitypage.selelctRecordType(recordtype);
    	 newopportunitypage.nextbutton();
     }
     
     @And("^the user create a new opportunity$")
     public void createopportunity() {
    	 newopportunityeditpage = new New_Opportunity_Edit_Page(driver);
    	 newopportunityeditpage.createopportunity(testData3.get("Opportunity_desc").toString());
    	 newopportunityeditpage.entersubindustry();
    	 newopportunityeditpage.enterstage(testData3.get("Stage").toString());
    	 newopportunityeditpage.enterdate(testData3.get("CloseDate").toString());
    	 
    	 
     }
//	    public static void elementvisible(By elementLocation) {
//
//	    	boolean searchIconPresence = driver.findElement(elementLocation).isDisplayed();
//          boolean searchIconEnabled = driver.findElement(elementLocation).isEnabled();
//          
//          if(searchIconPresence==true) {
//         	 System.out.println("Element is Displayed");
//          }
//          else {
//         	 System.out.println("Element is Not Displayed");
//          }
////              if (searchIconPresence==true && searchIconEnabled==true)
////              {
////                     // click on the search button
////                     WebElement searchIcon = driver.findElement(elementLocation);
////                     searchIcon.click();
////
////              }
	    
	    

//	

}


	 




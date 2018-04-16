package stepDefination;

import org.json.simple.JSONObject;

import Pages.AccountsPage;
import Pages.ContactsPage;
import Pages.LeadsPathPage;
import Pages.Leads_add_task_page;
import Pages.LoginPage;
import Pages.National_accounts_page;
import Pages.New_Opportunity_Edit_Page;
import Pages.New_Opportunity_Page;
import cucumber.api.java.en.And;
import utils.CommonUtils;

public class OpportunityStepDefination extends AbstractPageStepDefination{
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
	
	    CommonUtils utils = new CommonUtils();

	    JSONObject testData = utils.getDataFile("LeadPage.json");
	    JSONObject testData2 = utils.getDataFile("Setup_Page_Data.json");
	    JSONObject testData3 = utils.getDataFile("OpportunityPage.json");
	
   
    @And("^the user create a new opportunity$")
    public void createopportunity() {
   	 newopportunityeditpage = new New_Opportunity_Edit_Page(driver);
   	 newopportunityeditpage.createopportunity(testData3.get("Opportunity_desc").toString());
   	 newopportunityeditpage.entersubindustry();
   	 newopportunityeditpage.enterstage(testData3.get("Stage").toString());
   	 newopportunityeditpage.enterdate(testData3.get("CloseDate").toString());
   	  
    }
	
    
	

}

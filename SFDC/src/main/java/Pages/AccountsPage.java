package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;


import stepDefination.homestepDefination;

public class AccountsPage extends BasePage  {
	
	 //*********Constructor*********
   public AccountsPage(WebDriver driver) {
       super(driver);
     
   }
   
//   @FindBy(how=How.XPATH, using="//*[@title='Account Export']")
//   public static WebElement account_export;
//   
//   @FindBy(how=How.XPATH, using="//*[@class='slds-grid slds-grid--vertical-align-center slds-grid--align-center sldsButtonHeightFix']")
//   public static WebElement show_more;
////   
//   @FindBy(how=How.XPATH, using= "//a[@title='Accounts']")
//   public static WebElement aeaccountstab;
////   
   
   public static final String aeaccountstab = "//a[@title='Accounts']";
   
   public static final String newaccountbutton = "html/body/div[5]/div[1]/section/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/ul/li[1]/a";
   public static final String nextbutton = "//*[@class ='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton']";
   public static final String accountname = "pg:frm:txtAccountName";
   public static final String edit_button = "//*[@title='Edit']";
   
   //New account values
   public static final String agency_button = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/fieldset/div[2]/div[3]/label/div[1]/span";
   public static final String account_name = " //*[@class ='input uiInput uiInputText uiInput--default uiInput--input']";
   public static final String city = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[3]/div/div/div/div[1]/div/div/fieldset/div/div[4]/div[1]/div/input"; 
   public static final String zipcode = "//*[@class='postalCode compoundBLRadius compoundBRRadius input']";
   public static final String industry = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[6]/div[1]/div/div/div/div/div/div/div/a";
   public static final String industryname = "Education";
   public static final String subindustry = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[7]/div[1]/div/div/div/div/div[1]/div/div/a";
   public static final String subindustryname = "Edu/College/School";
   public static final String street = "//textarea[@class='street compoundBorderBottom textarea']";
   public static final String stateselect = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[3]/div/div/div/div[1]/div/div/fieldset/div/div[4]/div[2]/div/div/div[1]/div/div/a";
   public static final String statename = "Texas";
   public static final String save_button = "//*[@title='Save']";
   
   
//verify address   
   public static final String verify_address = "//*[starts-with(@href, '/apex/StrikeForce1__USAddressVerification?')]";
   public static final String accept_changes = "j_id0:j_id1:j_id28:j_id29:j_id31";
   public static final String show_more = "//*[@class='slds-grid slds-grid--vertical-align-center slds-grid--align-center sldsButtonHeightFix']";
   public static final String details_tab = "//*[@title='Details']";
   public static final String related_tab = "//*[@title='Related']";
   public static final String status = "//*[@aria-label='Status']";
   public static final String account_export = "//*[@title='Account Export']";
   public static final String remove_me_from_team = "//*[@title='Remove me from Team']";
   public static final String statusvalue ="Active";
   public static final String Account_update_request_value = "//span[@title='Account Update Requests']";
   public static final String new_account_update_button = "html/body/div[5]/div[1]/section/div[2]/div/div/div[3]/div/div/div[2]/div[1]/div/div/section/div[2]/div/div/div[12]/article/div[1]/div/div/ul/li/a/div";
   public static final String view_account_hierarchy = "//a[@title='View Account Hierarchy']";
   public static final String account_legal_hierarchy_value = "html/body/div[5]/div[1]/section/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/section[2]/div/div/div[3]/div/div[10]/h3/button";
   public static final String a_r_information = "//table[@class='detailList']";
   public static final String a_r_aging = "//table[@class='list slds-vf-data-table']";
   public static final String new_contact_button = "html/body/div[5]/div[1]/section/div[2]/div/div/div[3]/div/div/div[2]/div[1]/div/div/section/div[2]/div/div/div[7]/article/div[1]/div/div/ul/li/a";
   public static final String select_export_option = "//ul[@id='input-1-source-list']";
   public static final String click_right = "//button[@title='right']";
   public static final String submit_button = "//button[@class='slds-button slds-button--brand']";
   public static final String add_account_team = "//a[@title = 'Add Team Member']";
   public static final String user_value = "//*[@title = 'Search People']";
   public static final String team_role = "//*[@aria-label = 'Team Role']";
   public static final String team_role_value = "Account Manager";
   public static final String user_profile = "//*[@class= 'profileTrigger circular']";	  
   public static final String logout_profile = "//*[@class= 'profile-link-label logout uiOutputURL']";
   public static final String yes_remove_me = "/html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div/div/div[2]/section/article/header/div[2]/div/button[1]";
   public static final String temporary_advertiser_radio = "html/body/div[5]/div[2]/div[5]/div[2]/div/div[2]/div/div/div[1]/fieldset/div[2]/div[7]/label/div[1]/span";
   public static final String premiere_affiliate_radio_button = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/fieldset/div[2]/div[5]/label/div[1]/span";
   public static final String new_opportunity_button = "//a[@title = 'New Opportunity']";
   
		 
   

		   
		   public String arial(String identifier) {
   	String subindustry = "//*[@aria-label ='+identifier+']";
   	System.out.println(identifier);
   	return subindustry;
   	
   	
   }
   
   public void aeaccountstab (){
       click(By.xpath(aeaccountstab));
//	   aeaccountstab.click();
   }
   
   public void selectagency() {

	   selectradiobutton(By.xpath(agency_button));
   }
   
//   
   public void newaccount (){
       click(By.xpath(newaccountbutton));
   }
   
   public void nextbutton (){
       click(By.xpath(nextbutton));
   }

//   
//   public void editbutton() {
//	   click(By.xpath(edit_button));
//   }
//   
  public void acceptchange() throws InterruptedException {
	  clickframeelements(By.name(accept_changes));

  }
 
   public void  accountname() {
	   
	   String epoch = "TestAcc"+Long.toString(System.currentTimeMillis()/1000);
	   System.out.println(epoch);
	   writeText(By.xpath(account_name),epoch);
   }
   
public void  agencyname() {
	   
	   String epoch = "Agency"+Long.toString(System.currentTimeMillis()/1000);
	   System.out.println(epoch);
	   writeText(By.xpath(account_name),epoch);
   }
   
   
   public void selectindustrytype() {
	   click(By.xpath(industry));
   
   }
   public void selectindustryname() {
     click(By.linkText(industryname));
   }
   public void selectsubindustrytype() {
       click(By.xpath(subindustry));
       }
       
       public void selectsubindustry() {
       	click(By.linkText(subindustryname));
       }
       
       public void street(String streetname) {
       	writeText(By.xpath(street),streetname);
       }
       public void stateselect() {
       	click(By.xpath(stateselect));
       	click(By.linkText(statename));
       }
       
       public void city(String cityname) {
       	writeText(By.xpath(city),cityname);
       }
       
       public void zipcode(String zipcodenum) {
//    	   click(By.xpath(zipcode));
       	writeText(By.xpath(zipcode),zipcodenum);
       }
       
       public void clicksavebutton() {
       	click(By.xpath(save_button));
       }
       public void verifyaddress() {
          	click(By.xpath(verify_address));
          }
       public void acceptchanges() throws InterruptedException {
    	   clickframeelements(By.name(accept_changes));
          }
       
       public void showmore() {
         	click(By.xpath(show_more));
         }
       public void details_tab() {
        	click(By.xpath(details_tab));
        }
       public void account_export() {
       	click(By.xpath(account_export));
       }
       public void remove_me_from_team() {
          	click(By.xpath(remove_me_from_team));
          	click(By.xpath(yes_remove_me));
          }
         
      public void status() {
    	  click(By.xpath(status));
    	  click(By.linkText(statusvalue));  
      }
      
      public void account_update_request() {
    	  elementvisible(By.xpath(Account_update_request_value));
    	  
      }
      public void new_account_update_button(){
    	  click(By.xpath(new_account_update_button));
      }
      
//       public void status(String status1) {
//    	   selectdropdown(By.xpath(status),status1);
//       }
//       
      public void verify_legal_ar_values() {
    	  elementvisible(By.xpath(view_account_hierarchy));
    	  elementvisible(By.xpath(account_legal_hierarchy_value));
    	  elementvisible(By.xpath(a_r_information));
    	  elementvisible(By.xpath(a_r_aging));
      }
      
      public void new_account_team(){
      
    	  click(By.xpath(add_account_team));  
      }
      
      public void add_team(String value){
    	  
    	  click(By.xpath(team_role));
    	  writeText(By.xpath(team_role_value),value);
//    	  writeText(By.xpath(user_value),user);
    	  click(By.xpath(save_button));
  
      }
      
      public void logout() {
    	  click(By.xpath(user_profile));
    	  click(By.xpath(logout_profile));
      }
      
      public void selectexportvalue(String value) {
    	  click(By.xpath(select_export_option));
    	  click(By.xpath(click_right));
    	  click(By.xpath(submit_button));
    	  
//    	  selectoption(By.xpath(select_export_option),value);  
      }
      
      public void relatedtab() {
    	  click(By.xpath(related_tab));
      }
      
  public void newcontactbutton() {
	  click(By.xpath(new_contact_button));
  }
  
  public void clicktemporaryadvertiser() {
	  click(By.xpath(temporary_advertiser_radio));
	  
  }
  public void newopportunitybutton() {
//	  click(By.xpath(show_more));
	  click(By.xpath(new_opportunity_button));
  }
  
   public void navigatetoaccount() {
	   driver.navigate().to("https://ihm--lightngqa.lightning.force.com/one/one.app?source=aloha#/sObject/0011D000002xmgfQAA/view");
	   
   }
   
}


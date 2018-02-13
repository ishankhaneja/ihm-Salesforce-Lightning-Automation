package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LeadsPathPage extends BasePage{
	
//	 *********Constructor*********
    public LeadsPathPage(WebDriver driver) {
        super(driver);
      
    }
    
    
        public static final String usename_Id = "email";
        public static final String aeleadstab =   "//*[@title='Leads']";
        
        public static final String newleadsbutton = "//*[@id=\'brandBand_1\']/div/div/div[2]/div/div/div[1]/div[1]/div[2]/ul/li[1]";
        public static final String leadslastname = "//*[@class= 'compoundBLRadius compoundBRRadius form-element__row input']";
        public static final String leadscompany = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[3]/div[1]/div/div/div/input";
        public static final String street = "//textarea[@class='compoundTLRadius compoundTRRadius compoundBorderBottom textarea']";
        public static final String city = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div/div/div[1]/div/div/fieldset/div/div[3]/div[1]/div/input";
        public static final String zipcode = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div/div/div[1]/div/div/fieldset/div/div[4]/div[1]/div/input";
        public static final String stateselect = "//*[@class='compoundBorderBottom uiMenu']/div[1]/div[1]/div[1]/a";
        public static final String stateselect1 = "//*[@class='compoundBorderBottom uiMenu']";
        public static final String statename = "Texas"; 
        public static final String leadsource = "//*[@aria-label ='Lead Source']";
        
        public static final String leadsourcename = "Internet";
        public static final String leadsourcetype = "//*[@aria-label ='Lead Source Type']";
        public static final String leadsourcetypename = "Advertise with Us Form";
        public static final String industry = "//*[@aria-label ='Industry']";
        public static final String industryname = "Miscellaneous";
        public static final String subindustry = "//*[@aria-label ='Sub Industry']";
        public static final String subindustryname = "Promotion";
        public static final String save_button = "//*[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']";
        public static final String convert_button = "//*[@title='Convert']";
        public static final String convert_lead_button = "//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton runtime_sales_leadConvertModalFooter']";
        public static final String activity_tab = "//*[@data-tab-name= 'Standard.Tab.activity--gjf5hw115ts']";
        public static final String new_task_tab = "//*[@data-tab-name= 'NewTask']";
        public static final String subject = "";
        public static final String date = "//*[@class= 'inputDate input']";
        public static final String status ="//*[@aria-label= 'Status']";
        public static final String activity_type ="//*[@aria-label= 'Activity Type']";
        public static final String account_link = "/html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/a";
        public static final String lead_account = "html/body/div[5]/div[2]/div[5]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/a";
        
        
        
        public void aeleadstab (){
            click(By.xpath(aeleadstab));
        }
        
        
        public void newleadsbutton (){
            click(By.xpath(newleadsbutton));
        }
        public void lastname(String lastname) {
        	writeText(By.xpath(leadslastname),lastname);
        }
        public void company(String company) {
        	writeText(By.xpath(leadscompany),company);
        }
        
        public void street(String streetname) {
        	writeText(By.xpath(street),streetname);
        }
        
        public void city(String cityname) {
        	writeText(By.xpath(city),cityname);
        }
        
        public void zipcode(String zipcodenum) {
        	writeText(By.xpath(zipcode),zipcodenum);
        }
        
        public void stateselect() {
        	click(By.xpath(stateselect));
            
        }
        public void stateselect1() {
        	click(By.xpath(stateselect1));  
        }
        
        public void statename (){
            click(By.linkText(statename));
        }
        
        public void selectleadsource() {
        	click(By.xpath(leadsource));
        }
        
        public void leadsourcename1(){
            click(By.linkText(leadsourcename));
        }
        
        public void selectleadsourcetype() {
        	click(By.xpath(leadsourcetype));
        }
        
        public void leadsourcetype1(){
            click(By.linkText(leadsourcetypename));
        }
        
      
        public void selectindustrytype() {
        	click(By.xpath(industry));
        	click(By.linkText(industryname));
        }
        
        public void selectsubindustrytype() {
        click(By.xpath(subindustry));
        }
        
        public void selectsubindustry() {
        	click(By.linkText(subindustryname));
        }
        
        public void clicksavebutton() {
        	click(By.xpath(save_button));
        }
        
        @FindBy(xpath = "leadsource")
        public WebElement leadsourcevalue;
        
        //Convert leads
        public void convertbutton() {
        	elementvisible(By.xpath(convert_button));
        	click(By.xpath(convert_button));
        }
        
        public void convertleadbutton() {
        	click(By.xpath(convert_lead_button));
        	click(By.xpath(account_link));
        }
    
        public void leadaccount() {
        	click(By.xpath(lead_account));
        }
			
		}	
		
        
        
        
        
        
        
        
        
        
        


    
    





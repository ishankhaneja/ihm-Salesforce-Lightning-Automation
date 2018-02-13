package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class New_Opportunity_Edit_Page extends BasePage {

	public New_Opportunity_Edit_Page(WebDriver driver) {
		super(driver);
	
		// TODO Auto-generated constructor stub
	}

	public static final String account_name = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div/div[1]/div/input";
	public static final String opp_description = "html/body/div[5]/div[2]/div[4]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[4]/div[1]/div/div/div/input";
	public static final String stage = "html/body/div[5]/div[2]/div[4]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[5]/div[2]/div/div/div/div/div[1]/div/div/a";
	public static final String close_date = "html/body/div[5]/div[2]/div[4]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[7]/div[2]/div/div/div/div/input";
	public static final String sub_industry = "html/body/div[5]/div[2]/div[4]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[14]/div[1]/div/div/div/div/div[1]/div/div/a";
	public static final String subindustryname = "Edu/College/School";
	public static final String save_button = "//*[@title='Save']";
//  @FindBy(how=How.XPATH, using="html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div/div[1]/div/input")
//  public static WebElement account_name;
  
	
	public void createopportunity(String desc) {
		writeText(By.xpath(opp_description),desc);
		
		
	}
	
	public void enterstage(String stagevalue) {
//		selectdropdown(By.xpath(stage),stagevalue);	
		selectoption(By.xpath(stage),stagevalue);
		
	}
	
     public void entersubindustry() {
//    	 selectoption(By.xpath(sub_industry),sub);	
    	 click(By.xpath(sub_industry));
    	 click(By.linkText(subindustryname));
	}
	
	
	public void enterdate(String closedate) {
		writeText(By.xpath(close_date),closedate);
//		selectdropdown(By.xpath(sub_industry),sub);
		click(By.xpath(save_button));
	}
	
	
}

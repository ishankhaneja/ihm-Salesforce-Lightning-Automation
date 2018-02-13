package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class New_Opportunity_Page extends BasePage {
	public New_Opportunity_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}




	public  WebDriver driver;
	
	
	
	public static final String opportunity_tab = "//*[@title='Opportunities']";
	public static final String new_button = "//a[@title='New']";
	public static final String next_button = "//button[@class = 'slds-button slds-button--neutral slds-button slds-button--brand']";

	public static final String select_record_type = "//*[@class='select uiInput uiInputSelect uiInput--default uiInput--select']";
	public static final String select_national_record_type ="//*[@class='dynamic select uiInput uiInputSelect uiInput--default uiInput--select']";
	
	public void nextbutton() {
		click(By.xpath(next_button));	
	}
	
	public void selelctRecordType(String recordtype) {
		selectdropdown(By.xpath(select_national_record_type),recordtype);
	
		
	}

}

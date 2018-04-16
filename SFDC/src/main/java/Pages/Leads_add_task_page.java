package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leads_add_task_page extends BasePage {

	public Leads_add_task_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public static final String activity_tab = "//*[@title='Activity']";
	public static final String new_task_button = "//*[@title= 'New Task']";
	public static final String subject = "//*[@data-interactive-lib-uid='74']";
	public static final String date = "//*[@class= 'inputDate input']";
	public static final String status = "html/body/div[5]/div[1]/section/div[2]/div/div/div[3]/div/div/div[3]/div[2]/div[3]/div/section[2]/div/div/div[1]/section[2]/div/div[3]/div/div/div[2]/section/div/section/div/div/div/div/div/div[6]/div/div/div/div/div/div[1]/div/div/a";
	public static final String statusvalue1 = "Completed";
	
	public static final String activity_type = "html/body/div[5]/div[1]/section/div[2]/div/div/div[3]/div/div/div[3]/div[2]/div[3]/div/section[2]/div/div/div[1]/section[2]/div/div[3]/div/div/div[2]/section/div/section/div/div/div/div/div/div[7]/div/div/div/div/div/div[1]/div/div/a";
	public static final String priority = "html/body/div[5]/div[1]/section/div[2]/div/div/div[3]/div/div/div[3]/div[2]/div[3]/div/section[2]/div/div/div[1]/section[2]/div/div[3]/div/div/div[2]/section/div/section/div/div/div/div/div/div[8]/div/div/div/div/div/div[1]/div/div/a";
	public static final String save_button = "//*[@class= 'slds-button slds-button--brand cuf-publisherShareButton SMALL uiButton']";
	



 public void createnewtask(String subject1, String date1) {
	 click(By.xpath(activity_tab));
	 click(By.xpath(new_task_button));
	 writeText(By.xpath(subject),subject1);
	 writeText(By.xpath(date),date1);
	 
 }
 
 public void selectstatus(String statusvalue) {
	 selectdropdown(By.xpath(status),"statusvalue");
 }
 

 public void filltaskdetails(String statusvalue, String activityvalue,String proiorityvalue) {
	// click(By.xpath(status));
//	 click(By.xpath(statusvalue1));
	 selectelement(By.xpath(status),"statusvalue");
	 selectdropdown(By.xpath(activity_type),"activityvalue");
	 selectdropdown(By.xpath(priority),"proiorityvalue");
	 click(By.xpath(save_button));
	 
 }
 
 
 
}
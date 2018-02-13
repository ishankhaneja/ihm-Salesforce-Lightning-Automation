package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage {

	public ContactsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static final String new_contact_button = "html/body/div[5]/div[1]/section/div[2]/div/div/div[3]/div/div/div[2]/div[1]/div/div/section[2]/div[2]/div/div/div[7]/article/div[1]/div/div/ul/li/a";
	public static final String last_name = "//*[@class='compoundBLRadius compoundBRRadius form-element__row input']";
	public static final String title ="html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[3]/div[1]/div/div/div/input";
	public static final String email ="html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[6]/div[1]/div/div/div/input";
	public static final String save_button = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[3]/div/button[3]";
	public static final String contact_button = "html/body/div[5]/div[1]/section/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/section[2]/div[2]/div/div/div[7]/article/div[2]/div/div/div/div/ul/section/li/div[2]/h3/div/a";
	public static final String show_more = "//*[@title='Show 7 more actions']";
	public static final String edit_contact = "//a[@title='Edit']";
	
	
	
	

public void newcontact() {
	click(By.xpath(new_contact_button));
}

public void newcontactbutton(String lastnamevalue,String titlevalue, String emailvalue ) {
	  
	  writeText(By.xpath(last_name),lastnamevalue);
	  writeText(By.xpath(title),titlevalue);
	  writeText(By.xpath(email),emailvalue);
	  click(By.xpath(save_button));
}

public void editcontact() {
	click(By.xpath(contact_button));
	click(By.xpath(show_more));
	
	click(By.xpath(edit_contact));
	
	
}


}
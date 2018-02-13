package Pages;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class National_accounts_page extends BasePage  {

	public National_accounts_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


public static final String city = "//*[@class='city compoundBorderBottom compoundBorderRight input']"; 
public static final String zipcode = "//*[@class='postalCode compoundBLRadius compoundBRRadius input']";
public static final String industry = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[8]/div[1]/div/div/div/div/div[1]/div/div/a";
public static final String industryname = "Education";
public static final String subindustry = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[1]/div/div/div[9]/div[1]/div/div/div/div/div/div/div/a";
public static final String subindustryname = "Edu/College/School";
public static final String street = "//textarea[@class='street compoundBorderBottom textarea']";
public static final String stateselect = "html/body/div[5]/div[2]/div[3]/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div/div/div[1]/div/div/fieldset/div/div[4]/div[2]/div/div/div[1]/div/div/a";
public static final String statename = "Texas";   


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
    	writeText(By.xpath(zipcode),zipcodenum);
    }





}


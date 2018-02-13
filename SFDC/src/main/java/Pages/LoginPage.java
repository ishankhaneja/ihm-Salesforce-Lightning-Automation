package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

 
public class LoginPage extends BasePage{
 
   
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public static final String usernavbutton = "userNavLabel";
    public static final String menubutton = "Setup";
    public static final String setupsearch = "setupSearch";
    public static final String setupsearchbutton = "setupSearchButton";
    public static final String clicksearchxpath = "html/body/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/a";
    public static final String loginbutton = "login";
    
//    @FindBy(how=How.ID, using="userNavLabel")
//    public static WebElement usernavbutton;
//    
//    @FindBy(how=How.LINK_TEXT, using="Setup")
//    public static WebElement menubutton;
//    
//    @FindBy(how=How.ID, using="setupSearch")
//    public static WebElement setupsearch;
//    
//    @FindBy(how=How.ID, using="setupSearchButton")
//    public static WebElement setupsearchbutton;
//
//    @FindBy(how=How.XPATH, using="html/body/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/a")
//    public static WebElement clicksearchxpath;
//    
//    @FindBy(how=How.NAME, using="login")
//    public static WebElement loginbutton;
//    
    
    By firstNameTextBoxLocator = By.id("user_first_name");
    
    
   
 
    //*********Web Elements********
    
    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        driver.findElement(firstNameTextBoxLocator).sendKeys(firstName);
    }
 
    
    
    
    public void loginAsAdmin() {
    	click(By.id(usernavbutton));
    	click(By.linkText(menubutton));
    	
//        WebElement open = driver.findElement(By.id("userNavLabel"));
//        open.click();
//        WebElement setup = driver.findElement(By.linkText("Setup"));
//        setup.click();
//        return new LoginPage(driver);
        
    }
    public void loginsalesforce() {
    	
        WebElement setupSearchButton = driver.findElement(By.id("setupSearchButton"));
        setupSearchButton.click();

        WebElement clicksearchxpath = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/a"));
        clicksearchxpath.click();

        WebElement login = driver.findElement(By.name("login"));
        login.click();
     
        
      }
 

    
    
//    public void clickusernav (){
//        click(By.id(usernavbutton));
//    }
//    
//    public void clickmenu() {
//    	click(By.linkText(menubutton));
//    }
//    
//    public void setupSearch(String searchid) {
//    	writeText(By.id(setupsearch),searchid);
//    }
//    public void setupsearchButton (){
//        click(By.id(setupsearchbutton));
//    }
//    public void clicksearch (){
//        click(By.xpath(clicksearchxpath));
//    }
//    public void loginbutton (){
//        click(By.name(loginbutton));
//    }
// 
//    //*********Page Methods*********
//    
    
    
       
    }
 
 


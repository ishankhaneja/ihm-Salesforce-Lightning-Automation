package Pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {
	
	public static WebDriver driver;
	 public static boolean bResult;
	 
   public BasePage(WebDriver driver){
    BasePage.driver = driver;
    BasePage.bResult = true;
 }
   

   //Click Method
   public void click (By elementLocation) {
       driver.findElement(elementLocation).click();
       
       System.out.println("Element is present");
   }

   //Write Text
   public void writeText (By elementLocation, String text) {
   	driver.findElement(elementLocation).clear();
       driver.findElement(elementLocation).sendKeys(text);
       System.out.println("User able to enter value"+text);
   }

   //Read Text
   public String readText (By elementLocation) {
       return driver.findElement(elementLocation).getText();
   }
   
// 
   	
   	public void selectdropdown(By elementLocation, String text) 
   	{
   	
   		WebElement mySelectElement = driver.findElement(elementLocation);
   		mySelectElement.click();
   		Select dropdown= new Select(mySelectElement);
   		dropdown.selectByVisibleText(text);

   	}

   	public void selectoption(By elementLocation, String value) {
   		driver.findElement(elementLocation).click();
   		driver.findElement(elementLocation).sendKeys(value);	
   		
   	}
   	
   	public void selectelement(By elementLocation, String value) {
   		WebElement mySelectElement = driver.findElement(elementLocation);
   		Select selectInstance = new  Select(mySelectElement);
   		selectInstance.selectByVisibleText(value);
   
   	}
   	
 


	public void selectradiobutton(By elementLocation) {
   		driver.findElement(elementLocation).click();

   	}
   
   	public void clickframeelements(By elementLocation) throws InterruptedException {
   		List<WebElement> iframes = driver.findElements(By.xpath("//*[starts-with(@name, 'vfFrameId_')]"));

		System.out.println("Total Frames***********:" + iframes.size());

		// switch to every frame
		driver.switchTo().frame(0); 
		driver.findElement(elementLocation).click();
		Thread.sleep(3000);
   	}
   	
   //sleep for x seconds
   public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
   
   public static void elementvisible(By elementLocation) {

   	boolean searchIconPresence = driver.findElement(elementLocation).isDisplayed();
        boolean searchIconEnabled = driver.findElement(elementLocation).isEnabled();
        
        if(searchIconPresence==true) {
       	 System.out.println("Element is Displayed");
        }
        else {
       	 System.out.println("Element is Not Displayed");
        }
//            if (searchIconPresence==true && searchIconEnabled==true)
//            {
//                   // click on the search button
//                   WebElement searchIcon = driver.findElement(elementLocation);
//                   searchIcon.click();
//
//            }
   }
   
   public static void scrollPage(String to) throws Exception
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		if (to.equals("end"))
			executor.executeScript("window.scrollBy(0,450)", "");
		else if (to.equals("top"))
           executor.executeScript("window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);");
		else
			throw new Exception("Exception : Invalid Direction (only scroll \"top\" or \"end\")");
	}
   
   
   
   public static void retryingFindClick(String locator, RemoteWebDriver driver) {
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.findElementByXPath(locator).click();
				break;
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			attempts++;
		}
	}
	

}

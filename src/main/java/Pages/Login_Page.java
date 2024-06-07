package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
 
 // 1. Global declaration of WebDriver
	
	public WebDriver driver;
	
	
// 2. Create Constructor
	    
	     public Login_Page(WebDriver driver){
	    	 
	    	 
	    	 this.driver=driver;  // To Initialize the driver
	    	 
	          
	    	 
	    	 PageFactory.initElements(driver,this);  // To initialize the webElements
	    	  
	    	 
	     }
	

// 3. Locators using Page Factory
	     
	     
	     @FindBy(xpath="//input[@name='username']")
	     WebElement username;
	     
	     
	     @FindBy(xpath="//input[@name='password']")
	     WebElement password;
	     
	    
	     @FindBy(xpath="//button[@type='submit']")
	     WebElement loginbutton;
	     
	     
	     
	     
	     
// 4. Create Methods for Common Actions on WebElements	
	     
	    
	     public void Login(String userName, String Password) throws InterruptedException {
	    	 
	    	    Thread.sleep(2000);
	    	    username.sendKeys(userName);
	    	     
	    	    password.sendKeys(Password);
	    	 
	    	     
	    	    loginbutton.click();
	    	    
	    	    
	     }
	     
	     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

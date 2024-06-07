package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Page {

	
	public WebDriver driver;
	
	
	public Admin_Page(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	WebElement adminLink;
	
	
	@FindBy(xpath="(//button[@type='submit']/following::div/div/button)[1]")
	WebElement addButton;
	
	
	
	@FindBy(xpath="//label[text()='User Role']/ancestor::div[2]/div[2]/div/div")
	WebElement userRole;
	
	
	@FindBy(xpath="(//span[text()='Admin'])[2]")
	WebElement userRoleSelectAdmin;
	
	
    @FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement EmployeeName;
	
	
    @FindBy(xpath="//label[text()='Status']/following::div[4]")
    WebElement statusDropdown;
    
	@FindBy(xpath="//span[text()='Enabled']")
	WebElement statusSelect;
	
	
	@FindBy(xpath="(//label[text()='Username']/parent::div/following::div/input)[1]")
	WebElement Username;
	
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement Password;
	
	
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement ConfirmPassword;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SaveButton;
	
	
	
	
	public void clickAdmin() throws InterruptedException {
		Thread.sleep(5000);
		adminLink.click();
		
		
	}
	
	
	public void clickAdd() throws InterruptedException {
		
		Thread.sleep(4000);
		addButton.click();
		
		
	}
	
	
	public void enterUserDetails(String employeeName, String username, String password) throws InterruptedException {
		
		
		Thread.sleep(3000);
		userRole.click();
		
		userRoleSelectAdmin.click();
		
		EmployeeName.sendKeys(employeeName);
		
		statusDropdown.click();
		
		 statusSelect.click();
		 
		 Username.sendKeys(username);
		
		  
		 Password.sendKeys(password);
		 
		 
		 ConfirmPassword.sendKeys(password);
		 
		 
		 SaveButton.click();
		 
		 
		 
		 
		 
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

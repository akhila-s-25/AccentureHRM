package Test_cases;

import java.util.Properties;

import org.testng.annotations.Test;

import Pages.Admin_Page;

public class Admin_Test extends Base_Test {

	Admin_Page AdminPage;
	
	
	@Test
	public void enterValiduserdetails() throws InterruptedException {
		
		AdminPage= new Admin_Page(driver);
		
		Thread.sleep(2000);
		AdminPage.clickAdmin();
		
		AdminPage.clickAdd();
		
		AdminPage.enterUserDetails(prop.getProperty("EmployeeName"),prop.getProperty("EmployeeUsername"),prop.getProperty("EmployeePassword"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

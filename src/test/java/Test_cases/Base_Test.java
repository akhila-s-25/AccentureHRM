package Test_cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Pages.Login_Page;

public class Base_Test extends Base  {

  
	Login_Page LoginPage;

	
//	File file;
//	FileInputStream fis;
	Properties prop;
//	
	
	@BeforeTest
	public void setup() throws InterruptedException, IOException {
		
//		file=new File("Config/config.properties");
//		fis=new FileInputStream(file);
//		prop=new Properties();
//		prop.load(fis);
//		

		browserlaunch();
		
		driver.get(prop.getProperty("Url"));
		
		LoginPage=new Login_Page(driver);
		
		LoginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
		
		
			
	}
	
	
   @AfterTest
	public void teardown() throws InterruptedException {
		
		
	    Thread.sleep(2000);
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

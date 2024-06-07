package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;  

	File file;
	FileInputStream fis;
	Properties prop;
	
	
	 public void browserlaunch() throws IOException{
		 
		if(driver==null) { 
		 
			prop=new Properties();
		 try {
				
		  	file=new File("Config/config.properties");
			fis =new FileInputStream(file);
			prop.load(fis);
				
			
		    
		    String BrowserName=prop.getProperty("Browser");
		 
		   if(BrowserName.equalsIgnoreCase("Chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();}
		 
		 else if (BrowserName.equalsIgnoreCase("Firefox")) {
			 
			 	 driver =new FirefoxDriver(); }
		 
		 else if (BrowserName.equalsIgnoreCase("Edge")) {
			 
			 driver =new EdgeDriver();}
		
		   
		   driver.manage().window().maximize();
		   
		   
		 }catch(FileNotFoundException e) {
			
			
			e.printStackTrace();
		} 
		
	
		}	
		 
		 
	 }
}
		 
		 
	         	

//	public Properties initprop() throws IOException {
//		
//		
//		prop=new Properties();
//		
//		try {
//			
//		File	file=new File("config//config.properties");
//		FileInputStream	fis =new FileInputStream(file);
//		prop.load(fis);
//			
//		}catch(FileNotFoundException e) {
//			
//			
//			e.printStackTrace();
//		}
//		
//	
//		
		
	//	return prop;
		
		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	

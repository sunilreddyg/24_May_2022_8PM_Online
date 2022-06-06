package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		//Setting runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//Launching browser and store automation browser into webdriver interface
		WebDriver driver=new ChromeDriver();
		
		//Load webpage to automation browser window
		driver.get("https://facebook.com");
		
		
		/*
		 * WebDriver Interface:-->
		 * 
		 * 				WebDriver is a interface class it is designed to manipulate
		 * 				all browser instances supported by selenium..
		 * 
		 * 				Webdriver Interface support cross browser automaiton Which
		 * 				mean we can design script for one browser and can reuse
		 * 				same script to run at all browsers..
		 */
		
		
		/*
		 * Exceptions:-->
		 * 			
		 * 		IllegalStateException:-->
		 * 				When environment path not setup for chromedriver
		 * 								OR
		 * 				Path defined wrong
		 * 
		 * 		NoSessionCreated:-->
		 * 				When you browser version mismatch with browser driver version
		 * 				[when you get this message upgrade browser version]
		 * 
		 * 		INvalidArgument Exception:-->
		 * 				when site url is not defined with http://  or https:// protocals
		 * 
		 */
		
		
		
		

	}

}

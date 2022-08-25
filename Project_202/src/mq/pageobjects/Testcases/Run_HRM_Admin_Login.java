package pageobjects.Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.pages.HRM_Login;

public class Run_HRM_Admin_Login 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		HRM_Login login=PageFactory.initElements(driver, HRM_Login.class);
		
		/*
		 * login.Admin_userid.sendKeys("Admin");
		 * login.Admin_password.sendKeys("admin123"); 
		 * login.login_button.click();
		 */
	
		/*
		 * login.enterusername("admin"); 
		 * login.enterpassword("admin123");
		 * login.clickloginbutton();
		 */		
		
		login.adminlogin("admin", "admin123");

	}

}

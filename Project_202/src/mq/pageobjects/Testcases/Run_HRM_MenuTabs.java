package pageobjects.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.pages.HRM_Login;
import pageobjects.pages.HRM_MenuTabs;

public class Run_HRM_MenuTabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		HRM_Login login=PageFactory.initElements(driver, HRM_Login.class);
		login.adminlogin("Admin", "admin123");
		
		HRM_MenuTabs tabs=PageFactory.initElements(driver, HRM_MenuTabs.class);
		tabs.pIM.click();
		

	}

}

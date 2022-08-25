package pageobjects.Testcases;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.pages.AdminPage;
import pageobjects.pages.HRM_Login;
import pageobjects.pages.HRM_MenuTabs;
import pageobjects.pages.PIM_page;

public class Run_AdminPage
{
	
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		HRM_Login login=PageFactory.initElements(driver, HRM_Login.class);
		login.adminlogin("Admin", "admin123");
		
		HRM_MenuTabs tabs=PageFactory.initElements(driver, HRM_MenuTabs.class);
		tabs.admin.click();
		
		AdminPage admin=new AdminPage(driver);
		admin.Username.sendKeys("Sunil");
		
		Thread.sleep(4000);
		
		PIM_page pim=new PIM_page(driver);
		pim.employeename.sendKeys("Sunil");
		pim.veirfypageurl();
		
	}
	

}

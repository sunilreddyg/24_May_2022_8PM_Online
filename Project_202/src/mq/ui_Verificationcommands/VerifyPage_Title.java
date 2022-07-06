package ui_Verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPage_Title 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		String Exp_title="Facebook – log in or sign up";
		
		//Get Window title
		String PageTitle=driver.getTitle();
		System.out.println("Current WIndow title is --->"+PageTitle);
		
		//Writing Decision statemenet to accept on Expected title presented
		if (PageTitle.equals(Exp_title)) 
		{
			System.out.println("Expected page title displayed");
			WebElement Messenger=driver.findElement(By.linkText("Messenger"));
			Messenger.click();
			
			
		} 
		else 
		{
			System.out.println("Wrong Page title is displayed");
		}

	}

}

package ui_Verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_WaterMark_Label_Presented_At_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		//Verify email and password had watermark labels
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Email=driver.findElement(By.id("email"));
		WebElement Password=driver.findElement(By.id("pass"));
		
		
		
		if(Email.getAttribute("placeholder").equals("Email address or phone number"))
		{
			System.out.println("Testpass, Expected watermark label available for email");
		}
		else
		{
			System.out.println("Testfail, Expected watermark label not available for email");
		}
		
		
		
		if(Password.getAttribute("placeholder").equals("Password"))
		{
			System.out.println("Testpass, Expected watermark label available for password");
		}
		else
		{
			System.out.println("Testfail, Expected watermark label not available for password");
		}
		

	}

}

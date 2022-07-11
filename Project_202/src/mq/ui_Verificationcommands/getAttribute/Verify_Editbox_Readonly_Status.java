package ui_Verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Editbox_Readonly_Status {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement Email=driver.findElement(By.id("email"));
		String Value=Email.getAttribute("readonly");
		//Receive true when editbox is really available in readonly
		
		
		if(Value!="true")
		{
			System.out.println("It is in Editable mode");
		}
		else
		{
			System.out.println("It is in readonly mode");
		}
		
		
		

	}

}

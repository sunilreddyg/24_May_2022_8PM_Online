package ui_Verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Input_From_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
	
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("902020202");
		
		
		//Read back input from editbox..
		String value=Email.getAttribute("value");
		System.out.println(value);
		
		
		
		
		

	}

}

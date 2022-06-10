package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_LinkText {

	public static void main(String[] args) 
	{
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Identifying link with linkname property
		driver.findElement(By.linkText("Sign Up")).click();
				
		
		//Identifying link with linkname property
		driver.findElement(By.linkText("Log In")).click();
				
		//Identifying link with linkname property
		driver.findElement(By.linkText("Messenger")).click();
		
		//Link identifying with href property using xpath
		driver.findElement(By.xpath("//a[@href='/lite/'][contains(.,'Facebook Lite')]")).click();

	}

}

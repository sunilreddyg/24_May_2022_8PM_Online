package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicObject_IDentification {

	public static void main(String[] args) 
	{
		
		//set up browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();   //maximize browser
		
		
		//Identifying object and typing text into editboxes
		driver.findElement(By.id("email")).sendKeys("Darshit");
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		driver.findElement(By.name("login")).click();
		
		
	}

}

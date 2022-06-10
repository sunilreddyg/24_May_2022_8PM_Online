package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senkeys_Example {

	public static void main(String[] args)
	{
		
		//Set Up browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		//Clicking on signin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type email at entrybox and Pressing Enter Button using keyboard shortcut
		driver.findElement(By.name("loginfmt")).sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		//Type password at entrybox and press enter button using keybaord shortcut
		driver.findElement(By.name("passwd")).sendKeys("Hello@123"+Keys.ENTER);
		
		

	}

}

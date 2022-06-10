package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_With_Keyboard_Shortcuts 
{

	public static void main(String[] args) 
	{
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		//Characters sequence and keyboard shortcuts
		driver.findElement(By.name("firstname")).sendKeys("Rajesh"+Keys.TAB+"Kumar"+Keys.TAB+"RajeshKumar"+Keys.TAB+"Hello@123");
		
		//Dropdown option selection using keyboard shortcuts
		driver.findElement(By.id("day")).sendKeys("26");
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Dropdown option selection using characters sequeneces
		driver.findElement(By.id("year")).sendKeys("2017");
		
		
		//Selecting checkbox using keyboard shortcuts
		driver.findElement(By.xpath("//input[@value='2']")).sendKeys(Keys.SPACE);
		
		
		/*
		 * Note:--> To select dropdown option webdriver have separate selection commands
		 * 			Don't select dropdown option using sendkeys..
		 */

	}

}

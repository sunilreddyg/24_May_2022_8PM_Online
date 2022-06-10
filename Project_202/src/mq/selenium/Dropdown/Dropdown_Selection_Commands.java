package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Commands {

	public static void main(String[] args) 
	{
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		//Selecting dropdown option using visible Option Name
		WebElement Day=driver.findElement(By.id("day"));		
		new Select(Day).selectByVisibleText("18");
		
		
		//Selecting dropdown option using value property
		WebElement Month=driver.findElement(By.id("month"));
		new Select(Month).selectByValue("11");
		
		
		//Selecting dropdown option using index number
		WebElement Year=driver.findElement(By.id("year"));
		new Select(Year).selectByIndex(22);
		
		
		
		
		
		

	}

}

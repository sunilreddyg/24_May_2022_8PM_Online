package mq.selenium.ListboxItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_list_of_Items {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//First step to open list of items
		driver.findElement(By.linkText("Select Product Type")).click();
		Thread.sleep(3000);
		
		//Second step to select list of items
		driver.findElement(By.xpath("//li[@value='2'][contains(.,'Accounts')]")).click();
		

	}

}

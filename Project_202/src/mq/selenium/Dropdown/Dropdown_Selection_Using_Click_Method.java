package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection_Using_Click_Method {

	public static void main(String[] args) 
	{
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		driver.manage().window().maximize();
		
		
		//We can use click method to select dropdown by selecting xpath for Drodpown Option
		WebElement Beauty=driver.findElement(By.xpath("//option[@value='search-alias=beauty'][contains(.,'Beauty')]"));
		Beauty.click();
		
		
		
		
		
	}

}

package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Multiple_Dropdown_Options {

	public static void main(String[] args) throws Exception {
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement Select_Menu_Link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		Select_Menu_Link.click();
		Thread.sleep(3000);
		
		
		//Identifying dropdown
		WebElement Country=driver.findElement(By.id("exampleFormControlSelect2"));
		//Check dropdown multiple selection type
		boolean mstatus=new Select(Country).isMultiple();
		
		//Decison statement to accept on multiple selection dropdown
		if (mstatus) 
		{
			System.out.println("Dropdown is a multiple selection type");
			//Selecting multiple options
			new Select(Country).deselectAll();  //Deselect methods only works on multiple selection type dropdown
			new Select(Country).selectByIndex(1);
			new Select(Country).selectByIndex(3);
			
			Thread.sleep(4000);
			new Select(Country).deselectByIndex(1);
			
		} else 
		{
			System.out.println("Dropdown is a not multiple selection type");
		}
		
		
		
		
		
		

	}

}

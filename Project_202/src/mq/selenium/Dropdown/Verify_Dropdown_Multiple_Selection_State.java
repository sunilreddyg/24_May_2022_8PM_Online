package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_Selection_State {

	public static void main(String[] args) throws Exception 
	{
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement Select_Menu_Link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		Select_Menu_Link.click();
		Thread.sleep(3000);
		
		
		WebElement Month=driver.findElement(By.id("exampleFormControlSelect1"));
		boolean flag=new Select(Month).isMultiple();
		System.out.println("Dropdown multiple selection state is ---> "+flag);
		
		
		WebElement COuntry=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag1=new Select(COuntry).isMultiple();
		System.out.println("Dropdown multiple selection state is ---> "+flag1);


	}

}

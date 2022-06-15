package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Keyboard_Shortcut {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.com");
		driver.manage().window().maximize();
		
		
		WebElement From=driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		new Actions(driver)
		.click(From)
		.sendKeys(Keys.BACK_SPACE)
		.sendKeys("HYD").pause(2000)
		.sendKeys(Keys.ARROW_DOWN).pause(2000)
		.sendKeys(Keys.ENTER).perform();
		
		
		WebElement To=driver.findElement(By.xpath("//input[@id='fsc-destination-search']"));
		new Actions(driver).sendKeys(To, "Del")
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(2000)
		.sendKeys(Keys.ENTER).perform();
		
		
		
		

	}

}

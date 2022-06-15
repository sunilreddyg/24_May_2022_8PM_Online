package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_On_ELement {

	public static void main(String[] args) throws Exception
	{
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Performing mouse hover action at selected location
		WebElement Account=driver.findElement(By.xpath("//span[contains(.,'Account & Lists')]"));
		new Actions(driver).moveToElement(Account).perform();
		
		
		Thread.sleep(2000);  //static timegap to load suggestions
		
		//Identifying Sub Category menu and perform left click action at location
		WebElement WishList=driver.findElement(By.xpath("//span[contains(.,'Your Wish List')]"));
		new Actions(driver).click(WishList).perform();
	}

}

package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Until_Title_presented {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//wait until title presented at webpage
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println("Title is presented");
		
		
		WebElement Messenger=driver.findElement(By.linkText("Messenger"));
		Messenger.click();
		
		
		try {
			
			new WebDriverWait(driver, Duration.ofSeconds(40))
			.until(ExpectedConditions.titleIs("Messenger"));
			System.out.println("Messenget title is verified");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}

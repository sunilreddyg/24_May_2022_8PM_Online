package ui_Verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Verify_Pageurl {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Get Current window url..
		String Pageurl=driver.getCurrentUrl();
		
		//Condition to verify Page Security..
		if(Pageurl.contains("https://"))
		{
			System.out.println("Page is Secured");
		}
		else
		{
			System.out.println("Page is not Secured");
		}
		
		
		
		WebElement Messenger_link=driver.findElement(By.linkText("Messenger"));
		Messenger_link.click();
		
		
		//Condition to verify expected url presented at current browser window..
		if(driver.getCurrentUrl().contains("https://www.messenger.com/"))
		{
			System.out.println("Messenger page url is verified");
		}
		else
		{
			System.out.println("Messenger Page url is not verified");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}

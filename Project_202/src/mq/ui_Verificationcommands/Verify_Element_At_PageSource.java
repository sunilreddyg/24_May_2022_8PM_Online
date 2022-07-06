package ui_Verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Verify_Element_At_PageSource {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Get Entire page source
		String PageSource=driver.getPageSource();
		
		//Pagesource contains [OBjects,Title,Url,Headers ---etc]
		
		
		//COndition to verify required element presented at source
		if(PageSource.contains("email"))
		{
			driver.findElement(By.id("email")).sendKeys("Darshan");
		}
		else
		{
			System.out.println("Element Not presented at source");
		}

	}

}

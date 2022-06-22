package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView_Using_Javascript {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skyscanner.co.in/");
		
		
		//Identifying location using webdrier 
		WebElement Header=driver.findElement(By.xpath("//h2[contains(.,'Plan your perfect trip')]"));
		

		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Bring obeject to view point..
		js.executeScript("arguments[0].scrollIntoView(true)", Header);
		
		
		
		/*
		 * scrollIntoView(true)   --> Bring object to top of the interace
		 * scrollIntoView(false)  --> Bring object to bottom of the interface
		 */
		

	}

}

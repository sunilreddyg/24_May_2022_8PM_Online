package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Changes {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//Locating object using webdriver syntax
		WebElement email=driver.findElement(By.id("email"));
		
		
		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Hide object using javascript..
		js.executeScript("arguments[0].style.visibility='hidden'", email);
		Thread.sleep(4000);
		
		
		//Get Object to visible using javascript
		js.executeScript("arguments[0].style.visibility='visible'", email);
		Thread.sleep(4000);
		
		//Disable object using javascript
		js.executeScript("arguments[0].disabled='true'", email);
		Thread.sleep(4000);
		
		//Enable object using javascript
		js.executeScript("arguments[0].disabled='false'", email);

	}

}

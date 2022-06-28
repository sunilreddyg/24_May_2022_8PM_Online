package switchcommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_WebElement_Reference {

	public static void main(String[] args) throws Exception {
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		
		
		
		
		
		
		//Identifying object under frame..
		driver.findElement(By.id("email")).sendKeys("info.dsnr@gmail.com");
		driver.findElement(By.xpath("//input[@id='tripidSecond']")).sendKeys("1001212345");
		
		
		//Get Controls back to main page
		driver.switchTo().defaultContent();
		
		
		//Identifying object at homepage
		WebElement HomeLink=driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/']"));
		HomeLink.click();
				

	}

}

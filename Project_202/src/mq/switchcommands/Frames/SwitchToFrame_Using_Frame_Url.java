package switchcommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrame_Using_Frame_Url {

	public static void main(String[] args) throws Exception 
	{
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bus-tickets/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Help=driver.findElement(By.xpath("//a[@href='https://www.redbus.in/info/redcare']"));
	    Help.click();
	    Thread.sleep(5000);
	    
	    
	    //Navigate to frame using url
	    driver.navigate().to("https://www.redbus.in/login?offerType=Support&defaultSlide=home&isOnlyMobile=false");
	    
	    Thread.sleep(10000);
	    WebElement MobileField=driver.findElement(By.xpath("//div[@class='mobileInput clearfix']"));
	    new Actions(driver).sendKeys(MobileField,"903024885").perform();

	}

}

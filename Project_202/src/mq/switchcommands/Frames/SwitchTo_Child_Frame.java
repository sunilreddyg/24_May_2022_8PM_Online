package switchcommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Child_Frame {

	public static void main(String[] args) throws InterruptedException 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bus-tickets/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Help=driver.findElement(By.xpath("//a[@href='https://www.redbus.in/info/redcare']"));
	    Help.click();
	    Thread.sleep(5000);
	    
	    
	    
	    //Applying switch to frame using frame element refernce
	    WebElement ModalFrame=driver.findElement(By.xpath("//iframe[contains(@class,'modalIframe')]"));
	    driver.switchTo().frame(ModalFrame);
	    
	    
	    //Switch To Child Frame Under Parent
	    WebElement ChildFrame=driver.findElement(By.xpath("//iframe[contains(@title,'Sign in with Google Button')]"));
	    driver.switchTo().frame(ChildFrame);
	    
	    //Clicking link under child frame..
	    WebElement Google=driver.findElement(By.xpath("(//span[contains(.,'Sign in with Google')])[1]"));
	    Google.click();
	    Thread.sleep(3000);
	    
	    
	    //Get Controls back to parent frame
	    driver.switchTo().parentFrame();
	    
	    
	    //Get Controls Back to Mainpage
	    driver.switchTo().defaultContent();
	    
	   
	    //Identifying object under main page...
	    WebElement CloseButton=driver.findElement(By.xpath("//i[@class='icon-close']"));
	    CloseButton.click();
	}

}

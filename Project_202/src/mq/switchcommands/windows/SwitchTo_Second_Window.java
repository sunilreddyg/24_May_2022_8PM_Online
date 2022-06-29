package switchcommands.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Second_Window {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     		
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Get Mainwindow ID
	    String MainwindowID=driver.getWindowHandle();
	    
	    
	    //This link open in new TAB/WINDOW
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(5000);
	    
	    
	    //Get ALL window handles
	    Set<String> AllwindowIDs=driver.getWindowHandles();
	    
	    //Writing loop to iterate for number of windows
	    for (String EachWindowID : AllwindowIDs) 
	    {
			driver.switchTo().window(EachWindowID);
		}
	    
	    //Here is the assumption when loop is finished by default window controls
	    //should be available at second window..
	    
	    System.out.println("Current Focused window is --> "+driver.getTitle());
	    
	    
	    //Get Controls back to main page
	    driver.switchTo().window(MainwindowID);
	    
	    System.out.println("Main window title is ---> "+driver.getTitle());
	    
	    
	    

	}

}

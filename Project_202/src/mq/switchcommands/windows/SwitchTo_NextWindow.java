package switchcommands.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_NextWindow {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    
	    //This link open in new TAB/WINDOW
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(5000);
	    
	    System.out.println("Current window title is ---> "+driver.getTitle());
	    
	    
	    
	    //This line collect all dynamic window ids open through webdriver program
	    Set<String> AllwindowIDs=driver.getWindowHandles();
	    
	    //Convert all set<String> value into independent tokens
	    Iterator<String> itr=AllwindowIDs.iterator();
	    
	    //Iterator class all to read iterator value using Next keyword
	    String WINDOW1=itr.next();
	    String WINDOW2=itr.next();
	    
	    
	    driver.switchTo().window(WINDOW2);
	    System.out.println("Meta window title is -->"+driver.getTitle());
	    
	    
	    
	    //Switch control back to main window
	    driver.switchTo().window(WINDOW1);
	    System.out.println("Main WIndow title is ---> "+driver.getTitle());
	    
	    
	    
	    
	}

}

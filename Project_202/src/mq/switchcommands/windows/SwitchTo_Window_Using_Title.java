package switchcommands.windows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Title {

	public static void main(String[] args) throws Exception {
		
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
	    Thread.sleep(3000);
	    
	    
	    
	    //This link open in new TAB/WINDOW
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(3000);
	    
	    
	    //Get All window ID's
	    Set<String> AllwindowIDs=driver.getWindowHandles();
	    
	    //Foreach loop to reach all window id's
	    for (String Eachwindow : AllwindowIDs) 
	    {
			//Switching to each window and capturing all window titles
	    	String WIndowTitle=driver.switchTo().window(Eachwindow).getTitle();
	    	
	    	//Condition Statei verify Window title
	    	if(WIndowTitle.contains("Meta"))
	    	{
	    		break;   //Stop iteration when condition is true
	    	}
	    	
		}
	    
	    
	    //When the loop is finished by default controls will be available required window
	    System.out.println("Current Focused title is---> "+driver.getTitle());
	    
	    

	}

}

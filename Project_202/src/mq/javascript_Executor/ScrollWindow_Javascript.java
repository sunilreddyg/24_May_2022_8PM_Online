package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindow_Javascript 
{
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		

		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Scroll Vertically
		js.executeScript("window.scrollTo(100,800)");
		
		//Scroll Horizontally
		js.executeScript("window.scrollTo(800,100)");
		
		
		
	}

}

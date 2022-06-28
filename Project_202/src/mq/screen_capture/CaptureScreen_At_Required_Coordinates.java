package screen_capture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_At_Required_Coordinates {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Bring selected location to view port
		WebElement Footer=driver.findElement(By.linkText("Sign Up"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", Footer);
		Thread.sleep(4000);
		
		
		//Capturing screen and converting screen into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		//Dump file into local folders
		FileHandler.copy(src, new File("screens\\Screen3.png"));     //PNG[Portable network graphic] --> Image extension
				
		
		

	}

}

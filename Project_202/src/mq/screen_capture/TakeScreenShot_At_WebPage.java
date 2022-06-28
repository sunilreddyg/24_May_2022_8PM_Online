package screen_capture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot_At_WebPage 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Capturing screen and converting screen into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Create a folder
		FileHandler.createDir(new File("screens"));
		
		//Dump file into local folders
		FileHandler.copy(src, new File("screens\\Screen1.png"));     //PNG[Portable network graphic] --> Image extension
		
		
		
		/*
		 * Note:--> When alert presented at webpage we can't take screenshot,
		 * 			To handle this situvation we can user robot interface class to capture
		 * 			screen shot..
		 * 			
		 */

	}

}

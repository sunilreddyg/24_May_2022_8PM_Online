package screen_capture;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_TimeStamp {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Get Current Sytem Time and Date
		Date date=new Date();
		System.out.println(date.toString());
		
		//Creating simple format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		
		//Convert system date into simple date format
		String time=sdf.format(date);
		
		System.out.println(time);
		
	
		
		//Capturing screen and converting screen into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Dump file into local folders
		FileHandler.copy(src, new File("screens\\fbpage"+time+".png"));     //PNG[Portable network graphic] --> Image extension

		
		
		/*
		 * Time stamp regular expressions
		 * 
		 * 	YYYY ---   2022
		 *  MMM  ---   JAN - DEC
		 *  MM   ---   01 - 12
		 *  dd   ---   01 - 31
		 *  hh   ---   00 - 24
		 *  mm   ---   00 - 60
		 *  ss   ---   01 - 60
		 *  EEE  ---   SUN - SAT
		 */
		
		

	}

}

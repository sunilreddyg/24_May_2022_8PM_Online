package screen_capture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_Screen_At_Location {

	public static void main(String[] args) throws IOException {
		
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		
		WebElement Login_Form=driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		
		//Capture screen using location and converting into file format
		File src=Login_Form.getScreenshotAs(OutputType.FILE);
		//Dump file into local system
		FileHandler.copy(src, new File("screens\\Screen2.png"));

	}

}

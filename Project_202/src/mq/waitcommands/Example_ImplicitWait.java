package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ImplicitWait 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Setting implicitwait to wait until object load at DOM [DocumentObjectModel]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		//Pageload timeout[it manage time until all objects loaded to webpage]
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		
		
		/*
		 * Note:-->
		 * 			=> Implicit wait we define only once at browser launch time
		 * 			=> Where we get nosuchElement exception implicit wait timeout
		 * 					enable timegap
		 */
		
		
		long starttime=System.currentTimeMillis();
		
		try {
			
			driver.findElement(By.id("email")).sendKeys("Darshan");
			System.out.println("Object presented at source");
			System.out.println(System.currentTimeMillis()-starttime);
			
		} catch (Exception e) {
			System.out.println("Object Not Found at webpage");
			System.out.println(System.currentTimeMillis()-starttime);
		}
		
		
		
		try {
			
			driver.findElement(By.id("pass1234")).sendKeys("Darshan");
			System.out.println("Object presented at source");
			System.out.println(System.currentTimeMillis()-starttime);
			
		} catch (Exception e) {
			System.out.println("Object Not Found at webpage");
			System.out.println(System.currentTimeMillis()-starttime);
		}
		
	
		

	}

}

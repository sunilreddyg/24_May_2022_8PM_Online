package ui_Verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		
		
		//Get Window title
		String PageTitle=driver.getTitle();
		System.out.println("Current WIndow title is --->"+PageTitle);
		
		
		//Get WIndow URl
		String Pageurl=driver.getCurrentUrl();
		System.out.println("Current window url is ---> "+Pageurl);
		
		
		//Get Window ID
		String WindowID=driver.getWindowHandle();
		System.out.println("Dynamic ID --> "+WindowID);
		
		
		//Get Current Page Source
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		

	}

}

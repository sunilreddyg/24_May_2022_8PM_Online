package ui_Verificationcommands.GetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetObject_Height_And_Width {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		
		//Get object Height and Width
		WebElement SignInButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		int Obj_height=SignInButton.getSize().getHeight();
		int Obj_width=SignInButton.getSize().getWidth();
		
		
		System.out.println("Object Height is ---> "+Obj_height);
		System.out.println("Object Width is ---> "+Obj_width);
		
		
		
		//Check object is visible at webpage
		if(Obj_height > 0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is not visible at webpage");
		
		

	}

}

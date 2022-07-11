package ui_Verificationcommands.GetMethods;

import java.awt.Dimension;
import java.awt.Toolkit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_OBject_Coordinates {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();

		//Using Robot Class Get System DImension
		Dimension Obj_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		
		int Screen_Width=Obj_Dimension.width;
		int Screen_Hight=Obj_Dimension.height;
		
		
		
		//Get object x and y coorindation at webpage
		WebElement SignInButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		int Objx=SignInButton.getLocation().getX();
		int Objy=SignInButton.getLocation().getY();
		
		System.out.println("Object Presented at x coordinates are --> "+Objx);
		System.out.println("Object Presented at y coordinates are --> "+Objy);
		
		
		//Decision to verify object presented at left side of the page
		if(Objx > Screen_Width/2)
			System.out.println("Object presented at Right side of the page");
		else
			System.out.println("Object presented at left side of the page");
		
		
		//Decision to verify object presented at Top of the webpage
		if(Objy < Screen_Hight/2)
			System.out.println("Object Presented at Top side of the page");
		else
			System.out.println("Object presented at bottom of the page");

		
		//Checking object visible status using x and y coordinates
		//Selenium only read coordinates for visible objects
		//Selenium return o coorindate incase object is hidden
		if(Objx > 0)
			System.out.println("OBject is visible at webpage");
		else
			System.out.println("Object is hidden at webpage");
		
	}

}

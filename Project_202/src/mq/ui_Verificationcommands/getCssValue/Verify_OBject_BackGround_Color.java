package ui_Verificationcommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Verify_OBject_BackGround_Color 
{

	public static void main(String[] args) 
	{
		
		//This Feature is available only in selenium 4
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		
		String Exp_Hex_Color="#1877f2";
		
		
		WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
		//Selenium Read color or background color in RGBA format [RED,Green,Blue,Alpha]
		String BG_Color=LoginButton.getCssValue("background-color");
		System.out.println(BG_Color);
		
		
		//Converting RBGA color code into HEX format..
		Color OBJ_Color=Color.fromString(BG_Color);
		System.out.println(OBJ_Color.asHex());
		
		
		if(Exp_Hex_Color.equals(OBJ_Color.asHex()))
		{
			System.out.println("Expected background color displayed for Login button");
		}
		else
		{
			System.out.println("BackGround color is mismatched for login button..");
		}
		
		
		
		/*
		 * https://www.selenium.dev/documentation/webdriver/additional_features/colors/
		 */
		

	}

}

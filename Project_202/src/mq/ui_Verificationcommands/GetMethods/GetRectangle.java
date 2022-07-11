package ui_Verificationcommands.GetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();

		//Rectangle method can retrieve all Height,Width,X and y coordinates..
		WebElement SignInButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		System.out.println(SignInButton.getRect().getHeight());
		System.out.println(SignInButton.getRect().getWidth());
		System.out.println(SignInButton.getRect().getX());
		System.out.println(SignInButton.getRect().getY());
		
	}

}

package ui_Verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyText_Visible_At_Webpage {

	public static void main(String[] args) throws Exception {
		
		

		/*
		 * Scenario:  Verify Email validation using Invalid email
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When user enter invalid email
		 * 		And click next button
		 * 		Then verify Error message displayed "That Microsoft account doesn't exist. Enter a different account or get a new one."
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		WebElement Email=driver.findElement(By.name("loginfmt"));
		Email.sendKeys("sunlireddy@gmail.com");
		
	
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		//Next_btn.click();
		Thread.sleep(3000);
		
		
		//IDentify WebPage
		WebElement Page=driver.findElement(By.tagName("body"));
		//Get All Visible text presented at webpage
		String PageVisibleText=Page.getText();
		System.out.println(PageVisibleText);
		
		
		String Exp_text="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		
		//Decision to verify expected text presented at Webpage
		if(PageVisibleText.contains(Exp_text))
		{
			System.out.println("Expected Text visible at webpage");
		}
		else
		{
			System.out.println("Expected Text not visible at webpage");
		}
		
		
		

	}

}

package ui_Verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Testcase {

	public static void main(String[] args) throws Exception {
	
		/*
		 * Given site url is http://makemytrip.com
		 * When select roundtrip radio button
		 * Then Verify roundtrip is selected
		 * And verify Double seats option is disabled..
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Roundtrip.click();
		
		
		//Read runtime class property..
		String RuntimeClass1=Roundtrip.getAttribute("class");
		if(RuntimeClass1.contains("selected"))
		{
			System.out.println("Roundtrip is Selected");
			
			//Identifying double seat fare object
			WebElement DoubleFare=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[5]"));
			//Read double fare class attriabute
			String RuntimeClass2=DoubleFare.getAttribute("class");
			
			//Condition to verify object is disabled..
			if(RuntimeClass2.contains("isItemDisabled"))
			{
				System.out.println("Testpass, As expected object is disabled");
			}
			else
			{
				System.out.println("Testfail, Expected object is enabled");
			}
		}
		else
		{
			System.out.println("Rondtrip is not selected");
		}
		
		
	}

}

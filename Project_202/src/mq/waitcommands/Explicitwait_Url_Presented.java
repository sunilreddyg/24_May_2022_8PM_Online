package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Url_Presented {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		
		
		//Enable explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		
		//Manage time to wait until expected url presented at browser window
		boolean flag=wait.until(ExpectedConditions.urlToBe("https://phptravels.com/"));
		System.out.println("Url presented status is --> "+flag);
		System.out.println("Expected url is presented");
		
		
		WebElement Demo_link=driver.findElement(By.xpath("(//a[contains(.,'Demo')])[1]"));
		Demo_link.click();
		
		
		
		//Manage time to wait until partial url presented at browser window
		boolean flag1=wait.until(ExpectedConditions.urlContains("demo"));
		System.out.println("Url presented for demo page is --> "+flag1);
		System.out.println("Partial url is presented");

	}

}

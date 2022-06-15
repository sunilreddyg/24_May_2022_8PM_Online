package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickon_Element {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement ButtonMenu=driver.findElement(By.xpath("//button[contains(.,'Buttons')]"));
		ButtonMenu.click();
		Thread.sleep(2000);
		
		//Performing double click action on location
		WebElement Element=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		new Actions(driver).doubleClick(Element).perform();
		
		
		
		
		
	}

}

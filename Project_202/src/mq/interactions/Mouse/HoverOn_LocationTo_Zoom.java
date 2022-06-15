package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOn_LocationTo_Zoom {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/other/User-Interaction-With-Key-Sequence-jQuery-keySequence.html");
		driver.manage().window().maximize();
		
		
		WebElement Element=driver.findElement(By.xpath("//a[contains(@class,'vlightbox2')]"));
		new Actions(driver).moveToElement(Element).pause(2000).click().perform();
	}

}

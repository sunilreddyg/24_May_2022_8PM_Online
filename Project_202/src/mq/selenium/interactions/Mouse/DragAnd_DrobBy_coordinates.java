package interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnd_DrobBy_coordinates {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/borrow/popular-loans/home-loan?Promocode=website:homepagecalculators");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		
		
		WebElement Scroller1=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[1]"));
		new Actions(driver).dragAndDropBy(Scroller1, 100, 0).perform();

		
		WebElement Scroller2=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[2]"));
		new Actions(driver).dragAndDropBy(Scroller2, -100, 0).perform();

	}

}

package interactions.Keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_ShortCuts {

	public static void main(String[] args) throws Exception {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");    
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/keyboard-shortcut-handling/");
	driver.manage().window().maximize();
	
	//Press Alt+F1 key
	new Actions(driver).keyDown(Keys.ALT).sendKeys(Keys.F1).perform();
	
	Thread.sleep(3000);
	
	
	//Press escape key using keybaord shortcut
	new Actions(driver).sendKeys(Keys.ESCAPE).perform();
	
	
	}

}

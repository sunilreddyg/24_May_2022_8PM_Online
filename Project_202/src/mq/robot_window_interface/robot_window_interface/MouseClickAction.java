package robot_window_interface;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseClickAction {

	public static void main(String[] args) throws Exception 
	{
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		robot.mouseMove(306, 166);
		
		
		//Press and release left click at location
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		//Move to location
		robot.mouseMove(631, 611);
		
		//Press and release left click at location
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
			
		//Scroll Window down
		robot.mouseWheel(200);


	}

}

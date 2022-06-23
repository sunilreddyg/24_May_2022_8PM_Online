package robot_window_interface;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot_UsingRobot_Class {

	public static void main(String[] args) throws Exception {
		
		
		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		
		//Create object of robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		
		//Capture image in rectange shape
		BufferedImage image=robot.createScreenCapture(new Rectangle(1920, 1080));
		//Dump image into local files
		ImageIO.write(image, "PNG", new File("C:\\Users\\SUNIL\\Downloads\\irctcHome.png"));
		
		

	}

}

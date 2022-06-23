package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploading_File {

	public static void main(String[] args) throws Exception 
	{

		//Setup browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();

		
		
		
		WebElement Menu_Uploading=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		Menu_Uploading.click();
		Thread.sleep(5000);
		
		
		WebElement ChooseFile=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(ChooseFile).perform();
		Thread.sleep(3000);
		
		
		String path="C:\\Users\\SUNIL\\Downloads\\Agile_Document.docx";
		
		
		//String selection
		StringSelection spath=new StringSelection(path);
		//Get access of system clipbaord
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set Content to clipboard
		clipboard.setContents(spath, spath);
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Press Control+V keyboard shoruct using robot class
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

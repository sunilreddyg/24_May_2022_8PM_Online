package switchcommands.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_NewWindow {

	public static void main(String[] args) {
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     		
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Creating new window and load a page to new window
	    WebDriver Metapage=driver.switchTo().newWindow(WindowType.WINDOW);
	    Metapage.get("https://about.facebook.com/");
	    System.out.println(Metapage.getTitle());
	    
	    
	    //Create New tab at current window and Loading New page in it
	    WebDriver blogpage=driver.switchTo().newWindow(WindowType.TAB);
	    blogpage.get("https://about.instagram.com/en_US/blog");
	    System.out.println(blogpage.getCurrentUrl());
	    
	    
	}

}

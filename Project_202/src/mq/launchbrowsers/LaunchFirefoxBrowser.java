package launchbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download geckodriver.exe file
		 * 
		 * => https://www.selenium.dev/downloads/
		 * => Scroll down until find browsers
		 * => Click on + button to see list of browsers
		 * => Under Firefox click on documentation link
		 * => Find firefox browser version available in your computer
		 * => Under supported platforms find a suitable driver for firefox browser version
		 * => Click on geckodriver releases under supported versions
		 * => It land on geckodriver releases page
		 * => Under asserts download w.r.t Operating system and hotspot size 
		 * => After download save file into backup drive
		 * => unzip file to any folder, After unzip you can find one application
		 * 				geckodriver.exe
		 * => Create environment variable before launch firefox browser
		 * 
		 */
		
		
		//setting environment variable for gekcodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\geckodriver.exe");
		
		//Launching firefox browser and storing into reference class
		FirefoxDriver firefox=new FirefoxDriver();
		
		//load webpage to automation browser window
		firefox.get("http://gmail.com");
		
		

	}

}

package launchbrowsers;


import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser 
{

	public static void main(String[] args) 
	{
		/*
		 * Download Chromedriver.exe file
		 * 
		 * => https://www.selenium.dev/downloads/
		 * => Scroll down until find browsers
		 * => Click on + button to see list of browsers
		 * => Under Chrome click on documentation link
		 * => Find Chrome browser version available in your computer
		 * => Then click on latest stable release w.r.t chrome browser
		 * 			Chrome browser version ==? 102
		 * 			Latest stable release: ChromeDriver 102.0.5005.61
		 * => After click link it will land on chromedriver index page
		 * => Download zip format file w.r.t operating system 
		 * => After download save file into backup drive
		 * => unzip file to any folder, After unzip you can find one application
		 * 				chromedriver.exe
		 * => Create environment variable before launch chrome browser
		 * 
		 */
		
		
		//Setting Runtime environment variable for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//Launching chrome browser and storing into reference class
		ChromeDriver chrome=new ChromeDriver();
		
		//load webpage to automation browser window
		chrome.get("http://facebook.com");
		
		//Print title of the browser
		System.out.println(chrome.getTitle());
		
		//Close browser
		chrome.close();
		
		
	
	

	}

}
	
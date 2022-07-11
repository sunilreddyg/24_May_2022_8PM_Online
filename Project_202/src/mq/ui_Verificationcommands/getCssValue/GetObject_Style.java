package ui_Verificationcommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetObject_Style {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
		
		
		//Get OBject background color
		String BG_COlor=LoginButton.getCssValue("background-color");
		System.out.println("Object Background color is ---> "+BG_COlor);
		
		//Get Object COlor
		String OBJ_Color=LoginButton.getCssValue("color");
		System.out.println("Object COlor Displayed --> "+OBJ_Color);
		
		//Get OBject display status
		String Status=LoginButton.getCssValue("display");
		if(!Status.equals("none"))
		{
			System.out.println("Object is display");
		}
		
		
		//Get Object font size
		String font_size=LoginButton.getCssValue("font-size");
		System.out.println("Object font size displayed is ---> "+font_size);
		
		
		//Get Text alignment
		String Text_Align=LoginButton.getCssValue("text-align");
		System.out.println("alignment of text is ---> "+Text_Align);
		

	}

}

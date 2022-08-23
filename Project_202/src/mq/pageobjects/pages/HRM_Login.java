package pageobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRM_Login 
{
	
	@FindBy(name = "username") public WebElement Admin_userid;
	@FindBy(xpath = "//input[@name='password']") public WebElement Admin_password;
	@FindBy(xpath = "//button[contains(.,'Login')]") public WebElement login_button;
	@FindBy(xpath = "//p[contains(.,'Forgot your password?')]") public WebElement Forgot_password_link;
	
	
	public void enterusername(String uid) 
	{
		Admin_userid.sendKeys(uid);
	}
	
	public void enterpassword(String pwd) 
	{
		Admin_password.sendKeys(pwd);
	}
	
	public void clickloginbutton()
	{
		login_button.click();
	}
	
	
	public void adminlogin(String uid,String pwd) 
	{
		enterusername(uid);
		enterpassword(pwd);
		clickloginbutton();
	}
	
}

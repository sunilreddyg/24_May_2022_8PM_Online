package pageobjects.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AdminPage
{
	
	public AdminPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement  Username;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	public WebElement  UserRole;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement  EmployeeName;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	public WebElement  Status;
	
	@FindBy(xpath = "//button[contains(.,'Reset')]")
	public WebElement  reset;
	
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement  search;
	
	@FindBy(xpath = "//button[contains(.,'Add')]")
	public WebElement  add;



}
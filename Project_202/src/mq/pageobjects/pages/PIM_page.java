package pageobjects.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PIM_page
{
	WebDriver driver;
	public PIM_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}



	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	public WebElement  employeename;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement  employeeid;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	public WebElement  employeestatus;
	
	
	//Group of obejcts
	@FindBy(tagName="a") public List<WebElement> page_links;



	public void veirfypageurl()
	{
		System.out.println(driver.getCurrentUrl());
	}

}
package com.extent.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.extent.base.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(xpath="//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")
	WebElement logo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	public boolean logodisplay()
	{
		return logo.isDisplayed();
	}
	public String verifytitle()
	{
		return driver.getTitle();
	}

}

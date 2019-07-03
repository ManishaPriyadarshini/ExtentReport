package com.extent.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.extent.base.BaseTest;
import com.extent.page.LoginPage;


//login test
public class LoginTest extends BaseTest{
	
	LoginPage loginPage;
	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage=new LoginPage();
		
		
	}
	@Test(priority=1)
	public void logotest()
	{
		boolean value = loginPage.logodisplay();
		Assert.assertEquals(value, false);
	}
	
	@Test(priority=2)
	public void titleTest()
	{
		String title = loginPage.verifytitle();
		Assert.assertEquals("Facebook – log in or sign up", title);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}

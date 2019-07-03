package com.extent.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.extent.base.BaseTest;
import com.extent.page.HomePage;
import com.extent.page.LoginPage;

public class HomePageTest extends BaseTest{
	
	HomePage homePage;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		homePage=new HomePage();
		
		
	}
	
	
	@Test(priority=1)
	public void titleTest()
	{
		String hometitle = homePage.HomePagetitledisplay();
		Assert.assertEquals("Facebook", hometitle);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}



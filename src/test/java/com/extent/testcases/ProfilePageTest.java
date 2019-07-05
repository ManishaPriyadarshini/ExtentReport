package com.extent.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.extent.base.BaseTest;
import com.extent.page.HomePage;
import com.extent.page.ProfilePage;



public class ProfilePageTest extends BaseTest {
	
	ProfilePage profilepage;
	public ProfilePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		profilepage=new ProfilePage();
	}

	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void profiletitle()
	{
		String profile = profilepage.profiletitle();
		Assert.assertEquals("Manisha", profile);
	}
}

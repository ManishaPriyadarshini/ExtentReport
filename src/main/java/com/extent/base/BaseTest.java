package com.extent.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.extent.util.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test ;
	
	
	public BaseTest(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\ConfigFiles\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");	
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
			
		}
	}
}

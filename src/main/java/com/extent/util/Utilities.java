package com.extent.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.extent.base.BaseTest;

public class Utilities extends BaseTest{
	
	public static String screenshotpath;
	public static String screenshotname;
	
	public static void captureScreenshot(String methodName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		screenshotname = methodName;
		screenshotpath=System.getProperty("user.dir")+"\\target\\reports\\"+ screenshotname+".jpg";
		File dest = new File(screenshotpath);
		FileUtils.copyFile(src,dest);
		
		//return screenshotpath;
		
	}
	
	

}

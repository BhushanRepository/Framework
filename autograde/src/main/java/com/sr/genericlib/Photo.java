package com.sr.genericlib;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * 
 * @author BHUSHAN
 *
 */
public class Photo implements AutoConstant{
	/**
	 * Take the photo of failed test cases
	 * @param driver
	 * @param name
	 * @throws IOException
	 */
       public void getphoto(WebDriver driver, String name) throws IOException
       {
    	   Date d=new Date(0);
    	   String date = d.toString().replaceAll(":","_");
    	   
    	   TakesScreenshot ts=(TakesScreenshot) driver;
    	   File src = ts.getScreenshotAs(OutputType.FILE);
    	   File dest=new File(photopath+date+name+".png");
    	   FileUtils.copyFile(src, dest);
       }
}

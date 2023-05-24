package com.fb_Project_Library_file;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{

	public WebDriver driver;
	public void InitializedBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	}
	
	
}


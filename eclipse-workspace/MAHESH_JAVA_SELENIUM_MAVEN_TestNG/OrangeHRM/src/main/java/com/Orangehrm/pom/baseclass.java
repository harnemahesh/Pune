package com.Orangehrm.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass 
{
	public WebDriver driver;
	
	public void InitializedBrowser()
	{
	WebDriverManager.chromedriver().setup();
	
	 driver=new ChromeDriver();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.manage().window().maximize();
	 
	 
	}
	
}

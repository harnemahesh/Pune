package com.Orangehrmlibraryfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 
{
	@FindBy(xpath="//input[@name='username']") private WebElement userName;
	@FindBy(xpath="//input[@name='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")  private WebElement LoginBTn;
	
	public pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUser(String user)
	{
		userName.sendKeys(user);
	}
	public void Enterpassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void clickloginbtn()
	{
		LoginBTn.click();
	}
	}

package com.Orangehrmlibraryfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 
{

	@FindBy(xpath="//p[text()='Paul Collings']")private WebElement verifyName;
	
	public pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String VerifyUserName()
	{
		String actual=verifyName.getText();
		return actual;
	}
}

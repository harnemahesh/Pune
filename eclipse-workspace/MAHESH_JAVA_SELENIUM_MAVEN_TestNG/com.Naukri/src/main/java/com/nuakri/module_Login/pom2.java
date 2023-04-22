package com.nuakri.module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 
{
@FindBy(xpath="//div[text()='Mahesh Harne']") private WebElement VerifyName;
@FindBy(xpath="//div[@class='nI-gNb-drawer__icon']") private WebElement Menu;
@FindBy(xpath="//a[@title='Logout']") private WebElement ClickLogout;

public pom2 (WebDriver driver)
{
	
PageFactory.initElements(driver, this);
}
public String VerifyName()
{
	 String Actual=VerifyName.getText();
	 return Actual;
	
}
public void Menu()
{
	Menu.click();
}
public void ClickLogout()
{
	ClickLogout.click();
}

}

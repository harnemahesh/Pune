package com.nuakri.module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 
{
  @FindBy(xpath="//a[@id='login_Layer']") private WebElement Loginbtn;
  @FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")	private WebElement Username;
  @FindBy(xpath="//input[@placeholder='Enter your password']") private WebElement Password;
  @FindBy(xpath="//button[text()='Login']") private WebElement Login;

 public pom1(WebDriver driver)
  {
	PageFactory.initElements(driver, this);  
  }
  public void ClickLoginbtn ()
  {
	  Loginbtn.click();
  }
  public void EnterUsername(String User)
  {
	  Username.sendKeys(User);  
  }
  public void EnterPassword(String pass)
  {
	  Password.sendKeys(pass);
  }
  public void ClickLogin()
  {
	  Login.click();
  }

	}


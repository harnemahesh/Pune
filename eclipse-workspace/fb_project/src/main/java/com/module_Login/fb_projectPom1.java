package com.module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class fb_projectPom1 
{   @FindBy(xpath="//a[text()='Create new account']") private WebElement CreateNewAcount;

	@FindBy(name="firstname")private WebElement firstName;
	@FindBy(name="lastname")private WebElement LastName;
	@FindBy(name="reg_email__")private WebElement mobileNumber;
	@FindBy(id="password_step_input")private WebElement password;
	@FindBy(name="birthday_day")private WebElement Days;
	@FindBy(name="birthday_month")private WebElement Months;
	@FindBy(name="birthday_year")private WebElement Years;
	@FindBy(xpath="//input[@value='2']")private WebElement gender;
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")private WebElement singup;

	@FindBy(xpath="//span[text()='We need more information']") private WebElement errormsg;
	
	public fb_projectPom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateNewAccount()
	{
		CreateNewAcount.click();	
	}
	public void EnterFirstname(String name)
	{
		firstName.sendKeys(name);
	}
	public void EnterLastName(String Last)
	{
		LastName.sendKeys(Last);
	}
	public void EnterMobile(String number)
	{
		mobileNumber.sendKeys(number);
	}
	public void EnterPassword(String psw)
	{
		password.sendKeys(psw);
	}
	public void Selectday()
	{
		Select se=new Select(Days);
			se.selectByIndex(1);
	}
	public void SelectMonths()
	{
		Select se=new Select(Months);
		 se.selectByIndex(1);
	}
	public void selectYears()
	{  Select se=new Select(Years);
		      se.selectByVisibleText("2000");
	}
	public void ClickGender()
	{
		gender.click();
	}
	public void ClickSignup()
	{
		singup.click();
	}
  public String getActualresult()
  {
	 String  Actual=errormsg.getText();
	 return Actual;
  }
}

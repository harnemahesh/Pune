package com.fb_project_TestClass;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb_Project_Library_file.BaseClass;
import com.module_Login.fb_projectPom1;

public class fb_project_TestClass extends BaseClass
{
	fb_projectPom1 p1;
	@BeforeClass
	public void OpenBrowser()
	{
		InitializedBrowser();
		p1=new fb_projectPom1(driver);
	}
	@BeforeMethod
	public void Login() throws InterruptedException
	{  
		p1.clickCreateNewAccount();
		Thread.sleep(2000);
		p1.EnterFirstname("rahul");
		Thread.sleep(2000);
		p1.EnterLastName("sharma");
		Thread.sleep(2000);
		p1.EnterMobile("919922345682");
		Thread.sleep(2000);
		p1.EnterPassword("rahul@1234");
		
		Thread.sleep(2000);
		p1.Selectday();
		
		Thread.sleep(2000);
		p1.SelectMonths();
		Thread.sleep(2000);
		p1.selectYears();
		Thread.sleep(2000);
		
		p1.ClickGender();
		Thread.sleep(2000);
		p1.ClickSignup();
		Thread.sleep(2000);
	}
	@Test
	public void TC01()
	{  
		String Actualtext=p1.getActualresult();
		String expected="We need more information";
		Assert.assertEquals(Actualtext,expected);
	}
	@AfterMethod
	public void LogOut()
	{
		
	}
	@AfterClass
	public void ClosedBrowser()
	{
		driver.close();
	}
}

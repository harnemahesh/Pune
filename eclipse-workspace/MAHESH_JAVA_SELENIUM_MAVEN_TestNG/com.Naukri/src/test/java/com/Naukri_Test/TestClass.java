package com.Naukri_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nuakri.module_Login.pom1;
import com.nuakri.module_Login.pom2;

import Library_file.BaseClass;
import Library_file.UtilityClass;
import junit.framework.Assert;


public class TestClass extends BaseClass
{
	pom1 p1;
	pom2 p2;
	@BeforeClass
	public void OpenBrowser()
	{
		InitializedBrowser();
		p1=new pom1(driver);
		p2=new pom2(driver);
	}
	@BeforeMethod
	public void Login() throws EncryptedDocumentException, IOException
	{
		p1.ClickLoginbtn();
		p1.EnterUsername(UtilityClass.GetExel(0, 0));
		p1.EnterPassword(UtilityClass.GetExel(0, 1));
		p1.ClickLogin();
	}
	@Test
	public void TC1()
	{
		String ActualResult=p2.VerifyName();
		String ExpectedResult="Mahesh Harne";
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	
	@AfterMethod
	public void Logout()
	{
		p2.Menu();
		p2.ClickLogout();
		
	}
	@AfterClass
	public void ClosedBrowser()
	{
		driver.close();
		
	}
	
}

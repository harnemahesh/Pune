package com.Orangehrm.moduletest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Orangehrm.pom.baseclass;
import com.Orangehrm.pom.utilityclass;
import com.Orangehrmlibraryfile.pom1;
import com.Orangehrmlibraryfile.pom2;

public class testclass extends baseclass
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
	public void Login() throws IOException
	{
		p1.EnterUser(utilityclass.Credential("UN"));
		p1.Enterpassword(utilityclass.Credential("PSW"));
		p1.clickloginbtn();
		
	}
		@Test
	public void VerifyLogin()
	{
		
	}
	
	@AfterMethod
	public void Logout() {
		
	}
	
	@AfterClass
	public void ClosedBrowser()
	{
		
	}
	
}

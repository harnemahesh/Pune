package Module_Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_File.Base_Class;
import Library_File.Utility_Class;
import Module_Login.Amazon1;
import junit.framework.Assert;

public class Test_Class extends Base_Class
{
	Amazon1 A1;
	@BeforeClass
	public void OpenBrowser()
	{
		InitialisedBrowser();
		A1=new Amazon1(driver);
	}
	@BeforeMethod
	public void Login() throws IOException
	{
		A1.AcountClick(driver);
		A1.ClickSignUpBTN();
		A1.CreateAccount();
		A1.UserName(Utility_Class.Credential("YN"));
		A1.Email(Utility_Class.Credential("Email"));
		A1.Password(Utility_Class.Credential("PSW"));
		A1.RePassword(Utility_Class.Credential("RPSW"));
		A1.ContinuedBtn();
	}
	@Test
	public void  TC1()
	{
		String ActualResult=A1.VerifyMassage();
		String ExpectedResult="Email address already in use";
		
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	@AfterMethod
	public void Logout()
	{
		
	}
	@AfterClass
	public void ClosedBrowser()
	{
		
	}
	
}

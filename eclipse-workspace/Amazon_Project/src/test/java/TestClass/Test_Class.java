package TestClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amazon_project.Amazon_ProjectModule_Login.POM1;
import Library_file.Base_Class;
import Library_file.Utilty_Class;
import junit.framework.Assert;

public class Test_Class extends Base_Class
{
   public	POM1 P1;
@BeforeClass
public void OpenBrowser()
{
	InitializedBrowser();
    P1=new POM1(driver);
}
@BeforeMethod
public void Login() throws IOException
{
	P1.move_to_accountlink(driver);
	P1.clickOnsingin();
	P1.EnterUserName(Utilty_Class.getCredential("UN"));
	P1.ClickContinuedbtn();
	P1.EnterPassword(Utilty_Class.getCredential("PSW"));
	P1.Clicksingin();
	
}
@Test
public void TC1()
{
	 String actualresult=P1.showErrormsg();
	 String Expected="There was a problem";
	 Assert.assertEquals(actualresult, Expected);
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

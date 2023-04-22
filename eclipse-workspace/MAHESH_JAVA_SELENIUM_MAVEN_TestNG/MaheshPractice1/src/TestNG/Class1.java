package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1
{

	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}

	@Test
	public void TC2()
	{  //Assert.fail();
		Reporter.log("Running TC2",true);
	}

	@Test
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	
	
	
}

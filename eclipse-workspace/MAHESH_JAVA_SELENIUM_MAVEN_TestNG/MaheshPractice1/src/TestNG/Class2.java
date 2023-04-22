package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 
{

	@Test
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}

	@Test
	public void TC5()
	{ // Assert.fail();
		Reporter.log("Running TC5",true);
	}
	
}

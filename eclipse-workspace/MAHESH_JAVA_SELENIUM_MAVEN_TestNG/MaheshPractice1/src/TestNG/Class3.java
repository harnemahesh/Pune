package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Class3 
{
   @Parameters("BrowserName")
  
   @Test
   public void TC1(String BrowserName)
   {
	   WebDriver driver=null;
	   
	   if(BrowserName.equals("Chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan\\eclipse-workspace\\MAHESH_JAVA_SELENIUM_MAVEN_TestNG\\Maven\\Browser\\chromedriver.exe");
		   
		   driver=new ChromeDriver();
	   }
	   else if(BrowserName.equals("Edgedriver"))
	   {
		   System.setProperty("webdriver.edge.driver","H:\\EDGE EXE FILE\\edgedriver_win64\\msedgedriver.exe");
		   
		   driver=new EdgeDriver();
	   }
       driver.get("https://www.facebook.com");
      
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   }
	
	
	
}

package Library_file;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	
public void InitializedBrowser()
{
   WebDriverManager.chromedriver().setup();
   ChromeOptions options=new ChromeOptions();
   options.addArguments("--remote-allow-origins=*");
    driver=new ChromeDriver(options);
   
   driver.get("https://www.naukri.com");
   
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   
   driver.manage().window().maximize();
   
}
}

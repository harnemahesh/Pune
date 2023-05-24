package Library_file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class 
{
   public WebDriver driver;
	public void InitializedBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_5l00737rji_e&adgrpid=1328211703591630&hvadid=83013495293827&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154905&hvtargid=kwd-83014163472827:loc-90&hydadcr=5621_2377279");
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
		
	}
}

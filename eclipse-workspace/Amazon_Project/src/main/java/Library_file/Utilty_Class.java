package Library_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Utilty_Class 
{ 
	@Test
  public static String getCredential(String Keys) throws IOException
  {
	FileInputStream file=new FileInputStream("C:\\Users\\Roshan\\eclipse-workspace\\Amazon_Project\\mahi.properties");
	  Properties pro=new Properties();
	             pro.load(file);
	           String  Value1=pro.getProperty(Keys);
	           
	           return Value1;
	             
  }             
}

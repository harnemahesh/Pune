package Library_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Utility_Class 
{

	@Test
	public static String Credential(String Key) throws IOException
	{
		FileInputStream   file=new FileInputStream("C:\\Users\\Roshan\\eclipse-workspace\\Amazoen\\Amazone.proprties");
		                  Properties pro=new Properties();
		                  
		                             pro.load(file);
		                             
		                           String  Value1=pro.getProperty(Key);
		                              
		                           return Value1;
		                             
	}
	
}

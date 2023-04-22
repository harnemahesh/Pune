package com.Orangehrm.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class utilityclass 
{

	@Test
	public static String Credential(String key) throws IOException  
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Roshan\\eclipse-workspace\\MAHESH_JAVA_SELENIUM_MAVEN_TestNG\\OrangeHRM\\orangehrm.properties");
		
		Properties pro=new Properties();
		
		           pro.load(file);
		          String Values1=pro.getProperty(key);
		          
		          return Values1;
		           
	}
	
	
	
	
}

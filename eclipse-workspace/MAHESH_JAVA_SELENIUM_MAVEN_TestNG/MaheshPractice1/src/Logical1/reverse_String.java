package Logical1;

import java.util.Scanner;

public class reverse_String 
{

	public static void main(String[] args) 
	{
	
		     Scanner  sc=new Scanner(System.in);
		
		         String org=sc.next();
		         
		         String sr="";
		         
		         for(int i=org.length()-1;    i>=0;  i--)
		         {
		        	 sr=sr+org.charAt(i);
		        	 
		         }
		         System.out.println(sr);
		
	}
	
	
	
}

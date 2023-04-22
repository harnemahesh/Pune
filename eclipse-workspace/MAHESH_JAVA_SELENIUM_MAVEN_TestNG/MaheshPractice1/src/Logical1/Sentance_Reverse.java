package Logical1;

public class Sentance_Reverse 
{

	public static void main(String[] args) 
	{
	
		String org="I am mahesh";  
		
	        String T1=TC1(org);
			System.out.println(T1);
	}
	
	public static String TC1(String Username)
	{
	   String[] S1=Username.split(" ");
	    String Rev="";
	    
	    for(int i=S1.length-1;   i>=0;  i--)
	    {
	    	Rev=Rev+S1[i]+" ";
	    	
	    }
	        return Rev;
	
	        
	}
	
	
}

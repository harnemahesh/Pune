package Logical_Programed;

public class Reverse_String
{

	
	public static void main(String[] args) {
		
		String a="Mahesh";
		
		String Rev="";
		
		for(int i=a.length()-1; i>=0;  i--)
		{
			Rev=Rev+a.charAt(i);
		}
		System.out.println(Rev);
	}
}

package String;

public class testo1 
{

	public static void main(String[]args)
	{
		String str1="Dhiraj";
		String rev="";
		
		for(int i=str1.length()-1; i>=0;  i--)
		{
			rev=rev+str1.charAt(i);
		}
	    System.out.println(rev);
	}
	
	
	
	
	
}

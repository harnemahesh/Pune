package Logical1;

public class White_Space 
{

	public static void main(String[] args)
	{
	
		String a="ab b bc b  d";
		
		int Count=0;
		
		for(int i=0;  i<=a.length()-1;  i++)
		{
			char c=a.charAt(i);
			
			if(c==' ')
			{
				 Count++;
			}
		}
		System.out.println(Count);
		
	}
	
	
	
}

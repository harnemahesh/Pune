package String;

public class String_Functions 
{

	public static void main(String[] args)
	{
	
		String str="Uttareshwar";
		String str2="Mahesh";
		String str3=new String("Uttareshwar");
		String str4=new String("Mahesh");
		String str5=null;
		
		
		System.out.println(str==str3);
		System.out.println(str2.equals(str4));
		
		
		
		try
		{
			System.out.println(str5.isEmpty());
			System.out.println(str5.isBlank());
		}
		catch(Exception exe)
		{     
			
		}
		
		
	}
}

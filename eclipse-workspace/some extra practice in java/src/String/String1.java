package String;

public class String1 
{
public static void main(String[] args) 
{

	String str= "Mahesh";
	
	 String sum="";
	 
	 for(int i=str.length()-1;  i>=0;   i--)
	 {
		 sum=sum+str.charAt(i);
	 }
	System.out.println(sum);
	
}
	
	
	
}

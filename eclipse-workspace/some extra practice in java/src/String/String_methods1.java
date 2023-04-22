package String;

public class String_methods1 
{

	public static void main(String[] args) 
	{
	
		String s1="Velocity";
		String s2="";
		String s3= "ABCD";
		String s4="VELOCITY";
		String s5="city";
		String s6="abcabab";
		String s7="clasess";
		String s8="Manual classes";
		
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.contains(s5));
		System.out.println(s1.charAt(4));
		System.out.println(s1.startsWith("Ve"));
		System.out.println(s1.endsWith("ty"));
		System.out.println(s1.indexOf("c"));
		System.out.println(s6.lastIndexOf("a"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(4,7));
		System.out.println(s1.concat(s7));
		System.out.println(s8.replace("Manual", "Automation"));
		
		
	}
	
	
	
	
	
	
}

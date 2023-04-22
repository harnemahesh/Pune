package String;

public class String_Method_Apply
{

	public static void main(String[]args)
	{
		//with using new keyword
		String S1=new String("Ganesh");
		String S2=new String("Gaurav");
		String S3=new String("Ganesh");
		
		//without using new keyword
		String  S4="Ganesh";
		String  S5="Ganesh";
		String  S6="ganesh";
		String  S7="Harne";
		String  S8="Gaurav Harne";
		
		
		System.out.println(S1.isEmpty());
		System.out.println(S1.length());
		System.out.println(S1.charAt(3));
		System.out.println(S1.indexOf('s'));
		System.out.println(S1.startsWith("G"));
		System.out.println(S1.endsWith("h"));
		
		System.out.println(S1.equals(S3));
		System.out.println(S1.equals(S4));
		
		System.out.println(S1==S3);
		System.out.println(S4==S5);
		
		System.out.println(S4.equalsIgnoreCase(S6));
		
		System.out.println(S2.toUpperCase());
		System.out.println(S2.toLowerCase());
		
		System.out.println(S3.contains(S5));
		System.out.println(S3.contains("nesh"));
		
		System.out.println(S1.substring(1,3));
		System.out.println(S6.substring(2,4));
		
		System.out.println(S2.concat(" "+S7));
		System.out.println(S8.replace("Gaurav","Mahesh"));
		System.out.println(S8);
	}
	
}

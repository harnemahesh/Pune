package Logical_Programed;

public class l1 
{

	public static void main(String[] args) {
		
		
	String org="MHHHAESH";
	
	String ch="MHHH"; 
	
	String result=removeCharacters(org,ch);
	
		 System.out.println(result);
	}

	public static String removeCharacters(String org, String ch) {
		
		String result=org.replace("MHHH", "");
		
		
		return result;
	}
	
	
}

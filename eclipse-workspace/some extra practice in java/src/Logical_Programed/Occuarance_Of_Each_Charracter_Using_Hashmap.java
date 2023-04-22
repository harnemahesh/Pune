package Logical_Programed;

import java.util.HashMap;
import java.util.Set;

public class Occuarance_Of_Each_Charracter_Using_Hashmap 
{

	   public static void main(String[]args)
	   {
		String org="abcbcabd";
		
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0; i<=org.length()-1; i++)
		{
			char charvalue=org.charAt(i);
			
			if(mp.containsKey(charvalue))
			{
				mp.put(charvalue,mp.get(charvalue)+1);
				
			}
			else
			{
				mp.put(charvalue,1);
			}
		}
		Set<Character> keys=mp.keySet();
		
		for(Character K: keys)
		{
			System.out.println(K+":"+mp.get(K));
		}
	}
	
	
	
	
}

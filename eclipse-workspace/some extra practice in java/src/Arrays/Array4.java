package Arrays;

import java.util.Arrays;

public class Array4 
{

	public static void main(String[] args) 
	{
	
		String sr[]=new String[4];
		
		sr[0]="Mahesh";
		sr[1]="Uttareshwar";
		sr[2]="ganesh";
	    sr[3]="roshani";
		
		Arrays.sort(sr);
		
		for(int a=0;  a<=sr.length-1; a++)
		{
			//System.out.println(sr[a]);
		
			
			   String org=sr[a];
			   
			   String rev="";
				
				for(int i=org.length()-1;   i>=0;    i--)
				{
					rev= rev+org.charAt(i);
				}
				System.out.println(rev);
			
		}
	}
	
	
	
	
	
}

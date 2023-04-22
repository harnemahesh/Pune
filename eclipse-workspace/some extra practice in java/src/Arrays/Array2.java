package Arrays;

import java.util.Arrays;

public class Array2 
{

	
	public static void main(String[] args) 
	{
	
	   int ar[]= {10,20,30,40};
	   int sum=0;
	   
	   Arrays.sort(ar);
	   
	   for(int i=0;  i<=ar.length-1;  i++)
	   {
		   
		  sum=sum+ar[i];
		  
		  
	   }
		//System.out.println(sum);
		
	}
}

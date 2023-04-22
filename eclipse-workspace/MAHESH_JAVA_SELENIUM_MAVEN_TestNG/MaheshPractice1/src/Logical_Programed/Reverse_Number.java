package Logical_Programed;

public class Reverse_Number 
{
   public static void main(String[] args) 
   {
	
	   int a=12345;
	   
	   int Rev=0;
	   
	   for(int i=a;  i>0;  i=i/10)
	   {
		   int rem=i%10;
		   Rev=Rev*10+rem;
		   
	   }
	   System.out.println(Rev);
	   
	   
}
	
	
	
}

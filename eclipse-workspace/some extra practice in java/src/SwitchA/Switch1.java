package SwitchA;

import java.util.Scanner;

public class Switch1 
{
public static void main(String[] args) 
{
  
	int A=10;
	
	int B=5;
	
	int res=0;
	
	Scanner Sc=new Scanner(System.in);

	int key=Sc.nextInt();
	
	
	switch(key)
	{
	case 1: 
	 res=A+B;
	 
	 System.out.println(res); break;
	
	case 2:
		
		res=A*B;
		
		System.out.println(res); break;
		
	case 3:
		
		res=A/B;
		System.out.println(res); break;
	   
	}
	
	
	
	
}
	
	
}

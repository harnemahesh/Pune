package Logical1;

import java.util.Arrays;

public class Array 
{
public static void main(String[] args) 
{
	
	String sr[]={"Mahesh","Ganesh","Suresh"};
	
	String sr1[]= {"Mahesh","Ganesh","Suresh"};
	
	String sr2[]= {"Mahesh","Ganraj","Ashish"};
	
	int it1[]= {120,130,140};
	int it[]= {120,130,140};
	int it2[]= {120,140,150};
	
	System.out.println(Arrays.equals(sr, sr1));
	System.out.println(Arrays.equals(sr1, sr2));
	System.out.println(Arrays.equals(sr, sr2));
	System.out.println("===========================diff===============================");
	System.out.println(Arrays.equals(it1, it));
	System.out.println(Arrays.equals(it, it2));
	System.out.println(Arrays.equals(it1, it2));
	
	
	
	
}	
}

package Logical_Programed;

public class Reverse_Sentence1 
{
public static void main(String[] args) {
	
	String a= "my name is mahesh";
	
	String Text[]=a.split(" ");
	
	for(int i=0; i<=Text.length-1; i++)
	{
		String S1=Text[i];
		String OutPut=S1.substring(0,1).toUpperCase()+S1.substring(1);
		
		System.out.println(OutPut+" ");
		
	}
}
}

package variable1;

public class demo1
{
      int a=10;
      static int b=20;
      
	public static void main(String[] args) 
	{
		demo1 D2=new demo1();
		  D2.m2();
	   m3();
	
	}
	public void m2()
	{
		System.out.println(a);	
		System.out.println(b);
	}
	public static void m3()
	{
		demo1 D4=new demo1();
		  System.out.println(D4.a);
		  System.out.println(b);
	}
}

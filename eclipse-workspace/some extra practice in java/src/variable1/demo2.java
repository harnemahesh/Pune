package variable1;

public class demo2 {

	int a=11;
	static int b=12;
	
	public void m1()
  {   
		
		int a=13;
		
		System.out.println(a);
	    System.out.println(this.a);
       
	    System.out.println();
  }
	
	public static void m2(int c,int d)
	{   
		 int sum=c+d;
		 System.out.println(sum);
		int a=101;
		System.out.println(a);
		
		demo2 D4=new demo2();
		System.out.println(D4.a);
		
	}
	
	public static void main(String[] args) 
	{
	   demo2 D1=new demo2();
	   
	    D1.m1();
		
	    m2(30,20);
	
	}
	
}

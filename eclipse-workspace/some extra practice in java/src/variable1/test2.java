package variable1;

public class test2 extends test3
{
    int a=10;
	int b=30;
	public  void m1() 
	{
		int b=30;
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	
	public static void main(String[] args) 
	{
		 test2 Tr=new test2();
		       Tr.m1();
	}
}

package Interface;

public class Sample1 implements interface1
{

	public void m1()
	{
		System.out.println("Method m1 is completed");
	}
	public void m2()
	{
		System.out.println("Method m2 is completed in an implemented class");
	}
	public static void main(String[] args) 
	{
		Sample1 S1=new Sample1();
		     S1.m1();
		     S1.m2();
	}
	
}

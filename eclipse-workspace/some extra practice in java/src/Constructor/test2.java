package Constructor;

public class test2 extends Test1
{

	 static int a=40;
	
	public static void m3()
	{
		System.out.println(a);
	}
 
public static void main(String[] args) 
{
    test2 T2=new test2();
          T2.m3();
	Test1.m1();
}

}
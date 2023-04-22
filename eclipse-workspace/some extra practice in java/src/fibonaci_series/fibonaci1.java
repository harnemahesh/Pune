package fibonaci_series;

public class fibonaci1 
{
	//fobonaci series 0 1 1 2 3 5 8 13 21...
public static void main(String[]args)
{
	int a=0; int b=1;
	int c;
	for(int i=1; i<=10; i++)
	{
		c=a+b;
		System.out.println(a+" "+b);
		a=b;
		b=c;
		
	}
}
	
}

package Arrays;

public class MultiDimensional 
{

	public static void main(String[] args) 
	{
	
		int  ar[][]=new int[3][2];
		
		ar[0][0]=20;
		ar[0][1]=30;
		ar[1][0]=25;
		ar[1][1]=35;
		ar[2][0]=40;
		ar[2][1]=45;
		
		for(int i=0;  i<=2; i++)
		{
			for(int a=0;  a<=1;  a++)
			{
				System.out.println(ar[i][a]);
			}
		}
		
		
	}
	
	
}

package Star;

public class S2 
{

	
	public static void main(String[] args) 
	{
	
		
        int star=1;
		
		for(int i=1; i<=3; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
				
				if(i>1)
				{
					System.out.print(" ");
					for(int b=1; b<=star; b++)
					{
						
						System.out.print("*");
					}		
				}
				
				if(i>2)
				{
					System.out.print(" ");
					for(int b=1; b<=star; b++)
					{
						
						System.out.print("*");
					}
				
				}		
				star++;
			 System.out.println();
		
		
		
		
	}
	
	}
}

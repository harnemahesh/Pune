package Star;

public class S1 
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
			star++;
			
			if(i>1)
			{
				System.out.print(" ");
				for(int b=2; b<=star; b++)
				{
					
					System.out.print("*");
				}
			}	
		 System.out.println();
	
}}}

package Star;

public class S3 
{

	//**
	//****
	//******
	//********
	//**********
	//********
	//******
	//****
	//**
	
	public static void main(String[] args) 
	{
	
		int star=2;
		for(int i=1; i<=9; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5)
			{
				star=star+2;
			}
			else
			{
				star=star-2;
				
			}
		}
		
	}
}

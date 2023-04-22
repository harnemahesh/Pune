package Star;

public class s4 
{

	//     ****
	//    *****
	//   ******
	//  *******
	// ********
	//*********
	
	public static void main(String[] args)
	{
	  int star=4;
	  int space=5;
	  
	  for(int i=1; i<=6; i++)
	  {
		  for(int j=1; j<=space; j++)
		  {
			  System.out.print(" ");
		  }
		  for(int a=1; a<=star;  a++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		  space--;
		  star++;
		  
	  }
		
	}
}

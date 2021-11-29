
public class MultipleTryCatch
{

	public static void main(String[] args) 
	
	{
		try
		{
			int n1 = 10;
			int n2 =0;
			
			System.out.println(n1/n2);
			
			int k[] = new int[5];
			
			for( int i =0;i<=5;i++)
			{
				k[i]=i;
			}
		}
		
		
		catch(ArithmeticException |ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e);
		}

	}

}

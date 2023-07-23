package control_Statement;

public class example4_nested_if 
{
	public static void main(String[] args)
	{
		int PEM=300;
		int MEM=900;
		if(PEM>=300)
		{
			System.out.println("eligible for mains exam");
			if(MEM>=900)
			{
				System.out.println("eligible for interview");
			}
			else
			{
				System.out.println("rejected for interview");
			}
		}
		else
		{
			System.out.println("rejected for mains exam");
		}
		
		
	}
	
	

}

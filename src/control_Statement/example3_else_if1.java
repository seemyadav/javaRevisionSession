package control_Statement;

public class example3_else_if1 
{
	public static void main(String[] args) 
	{
		int marks=26;
		if(marks>=66)
		{
			System.out.println("distinction");
		}
		else if(marks>=60 & marks<=65)
		{
			System.out.println("1st class");
		}
		else if(marks>=50 & marks<=59)
		{
			System.out.println("2nd class");
		}
		else if(marks>=35 & marks<=49)
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}

		
	}

}

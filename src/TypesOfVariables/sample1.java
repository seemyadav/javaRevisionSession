package TypesOfVariables;

public class sample1
{
	int c =30;
	public void m1()
	{
		int a= 10;
		System.out.println(a);
		System.out.println(c);
	
	}
	public void m2()
	{
		int b=20;
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		sample1 s1 = new sample1();
		s1.m1();
		s1.m2(); 
		
		
	}
  

}

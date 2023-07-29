package Constructor;

public class sample1
{
	//default constructor
	public void m1()
	{
		System.out.println("running method m1");
	}
	public void m2()
	{
		System.out.println("running method m2 from same class ");
	}
	
	public static void main(String[] args)
	{
		//default constructor call from same class
		sample1 s1 = new sample1();
		s1.m1();
		s1.m2();
		
		sample2 s2 = new sample2();
		s2.m3();
		
	}

}

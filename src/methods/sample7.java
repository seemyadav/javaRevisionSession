package methods;

public class sample7 
{
	public static void main(String[] args)
	{
		//1:static regular method call from same class
		m1();
		//2.static method call from different class
		sample8.m2();
		//3.non- static regular method call from same class
		sample7 s7 = new sample7();
		s7.m3();
		//4:non-static regular method call from diff class
		sample8 s8 = new sample8();
		s8.m4();
		
	}
	public static void m1()
	{
		System.out.println("running static regular method m1 call from same class");
	}
	public void m3()
	{
		System.out.println("running non static regular method call from same class");
	}

}

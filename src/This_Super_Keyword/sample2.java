package This_Super_Keyword;

public class sample2 extends sample1
{
	//int a=10  global variable from super class
	int a=20;   //global variable from same class
	
	public void m1()
	{
		int a=30;
		System.out.println(a);     //print local variable
		System.out.println(this.a);//print global variable from same class
		System.out.println(super.a);//print global variable from super class
	}
	public static void main(String[] args)
	{
		sample2 s2 = new sample2();
		s2.m1();
				
		
	}

}

package methods;

public class sample1
{
	//1.static regular method call from same class
	//main method
	public static void main(String[] args) //pre-defined method
	{
		System.out.println("hi");
		System.out.println("good morning/afternoon/evening/night");
		m1();           //methodname();
		m2();
		m3();
	}
	
	//regular method(static regular method)
	public static void m1()              //user defined method
	{
		System.out.println("running static regular method m1");
	}
	
	public static void m2()              //user defined method
	{
		System.out.println("running static regular method m2");
	}
	public static void m3()              //user defined method
	{
		System.out.println("running static regular method m3");
	}

}

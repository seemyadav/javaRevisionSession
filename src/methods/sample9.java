package methods;

public class sample9
{
	public static void main(String[] args)
	{
		add(20,30);
		add(10,20);
		
		System.out.println("------------");
		sample9 s9 =new sample9();
		s9.mul(30, 40);
		
		System.out.println("___________");
		sample10.convertNameToUpperCase("seema");
		
		System.out.println("-----------");
		sample10.studentInfo("seema", 101, 66.5f, 'A');
		
	}
	//method with 2 integer parameter
	public static void add(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	
	//method with 2 int parameter
	public void mul(int num1,int num2)
	{
		System.out.println(num1*num2);
	}
//	//without parameter
//	public static void add()
//	{
//		int num1 = 20;
//		int num2 = 30;
//		System.out.println(num1+num2);
//	}

}

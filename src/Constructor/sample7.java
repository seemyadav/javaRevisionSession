package Constructor;

public class sample7 
{
	 //we can create different constructor in one class
	int num1;
	int num2;
	String name;
	//string parameter constructor
	sample7(String s1)
	{
		name=s1;
	}
	
     public sample7() {
		// TODO Auto-generated constructor stub
	}

	// int,int parameter constructor
	public void sub()
	{
		System.out.println(num2-num1);
	}
	
	public static void main(String[] args)
	{
		sample7 s7 = new sample7();
		s7.sub();
		
	}

}

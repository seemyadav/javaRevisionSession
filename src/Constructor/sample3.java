package Constructor;

public class sample3
{
	//user defined constructor--->provided by user   without parameter/zero parameter
	//use1:to initialize global variable
	//use2:copy all the members of class into object
	int num1;
	int num2;
	
	sample3()
	{
		num1=20;
		num2=30;
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mult()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
		sample3 s3 = new sample3(); //user defined constructor call from same class
		s3.add();
		s3.mult();
		
		sample4 s4 = new sample4();//user defined constructor call from different class
		s4.sub();
				
		
		
	}
			
	

}

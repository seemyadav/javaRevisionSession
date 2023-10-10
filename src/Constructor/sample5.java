package Constructor;

public class sample5
{
	
		//user defined constructor--->provided by user   constructor with parameter
		//use1:to initialize global variable
		//use2:copy all the members of class into object
		int num1;
		int num2;
		
		sample5(int a, int b)
		{
			num1=a; //global variable=local variable
			num2=b;
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
			sample5 s5 = new sample5(10,20); //user defined constructor call from same class
			s5.add();
			s5.mult();
			
			System.out.println("-----");
			sample5 s6 = new sample5(30,40);
			s6.add();
			s6.mult();
			
			System.out.println("-----");
			sample6 s7= new sample6(30,60);
			s7.sub();
			
			sample6 s8 = new sample6(40,80);
			s8.sub();
			
		}
				
		

	}




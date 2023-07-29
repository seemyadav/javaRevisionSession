package TypesOfVariables;

public class sample4
{
	//non static global variable
	int x=90;
	public static void main(String[] args)
	{
		//non static global variable call from same class
		sample4 s4 = new sample4(); //create object of same class
		System.out.println(s4.x);    //variable call
		
		//non static global variable call from diff class
		sample5 s5 = new sample5();
		System.out.println(s5.y);
		
		
				
		
	}

}

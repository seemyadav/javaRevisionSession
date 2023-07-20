package methods;

public class sample5
{
	//non static regular method call from different class
	public static void main(String[] args)
	{
		sample6 s6 = new sample6();    //create object of different class
		s6.m6();                       //method call-->diffObjectname.methodname
		s6.m7();
		s6.m8();	
	}

}

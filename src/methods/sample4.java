package methods;

public class sample4 
{
	public static void main(String[] args)
	{
		//classname objectname = new classname(); 1:create object of same class
		sample4 s4 = new sample4();
		//objectname.methodname                   2:method call
		s4.m4();
		s4.m5();
		s4.m6();
		//sample4=classname-->datatype or objecttype
		//s4= object name -->to identify object
		//new=keyword--> use to create blank or empty object
		//sample4=classname-->constructor call-->copy all member of class into object
		
	}
	public void m4()
	{
		System.out.println("running non-static regular method m4 call from same class");
	}
	public void m5()
	{
		System.out.println("running non-static regular method m5 call from same class");
	}
	public void m6()
	{
		System.out.println("running non-static regular method m6 call from same class");
	}

}

package variables;

public class sample1
{
	public static void main(String[] args) 
	{
		//step1-variable decleration
		String sname;        //datatype variable name
		int srollNo;
		float sper;
		char sgrade;
		//step2-variable initialization
		sname="seema";        //assigning/inserting value
		srollNo=50;
		sper=65.5f;
		sgrade='A';
		
		//step3-variable reuse
		System.out.println(sname);
		System.out.println(srollNo);
		System.out.println(sper);
		System.out.println(sgrade);
		System.out.println(sname);
		System.out.println(sname);
		
	}

}

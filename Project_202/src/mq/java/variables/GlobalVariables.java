package mq.java.variables;


public class GlobalVariables 
{
	//Instant variable
	int a=100;
	String name="Iphone";
	boolean flag=true;
	
	//Static variables are Class variable
	static int b=200;
	static String spec="126GB";
	

	public static void main(String[] args) 
	{
		System.out.println(GlobalVariables.b);
		System.out.println(GlobalVariables.spec);
		

		GlobalVariables obj=new GlobalVariables();
		System.out.println(obj.a);
		System.out.println(obj.name);
		System.out.println(obj.flag);
		

	}

}

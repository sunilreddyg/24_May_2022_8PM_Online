package mq.java.variables;

public class Variable_initiation 
{

	public static void main(String[] args)
	{
		
		//One variable is initiated don't intiate again
		int a=100;
		a=200;   //Overriding value
		System.out.println(a);
		
		
		
		//Global initiation
		int b;       //Initiating variable
		b=100;       //Assigning value to varaible
		b=200;       //Overriding value
		System.out.println(b);
		
		
		//Global initiation
		int x,y,z;
		x=100; y=200; z=300;
		System.out.println(x+y+z);
		
		
		
		//Global initiation using condition
		String name;   
		if(true)
		{
			name="WebDriver";
		}
		System.out.println(name);
		
		
		
		
		//Global initiation with try catch blog
		boolean flag;
		try {
			flag=true;
		} catch (Exception e) {
			flag=false;
		}
		
		System.out.println(flag);
		

	}

}

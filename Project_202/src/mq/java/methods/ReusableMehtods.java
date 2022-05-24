package mq.java.methods;

public class ReusableMehtods 
{
	//Reusable methods
	void methodA()
	{
		System.out.println("Method A program is running");
	}
	
	//Reusable methods
	void methodB()
	{
		System.out.println("Method B program is running");
	}
	
	//Runnable method
	public static void main(String args[])
	{
		new ReusableMehtods().methodA();
		new ReusableMehtods().methodB();
	}

}

package mq.java.methods.parameters;


public class Calculator2 
{
	
	int a;
	int b;

	public Calculator2(int var1, int var2) 
	{
		a=var1;
		b=var2;
	}
	
	void add()
	{
		System.out.println(a+b);
	}
	
	void mul()
	{
		System.out.println(a*b);  
	}
	
	public static void main(String args[])
	{
		new Calculator2(10, 30).mul();
		new Calculator2(13, 13).add();

	}

}

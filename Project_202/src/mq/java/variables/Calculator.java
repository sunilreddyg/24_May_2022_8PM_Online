package mq.java.variables;

public class Calculator 
{
	
	int a;
	int b;
	
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}
	
	void add()
	{
		System.out.println(a+b);
	}
	
	void mul()
	{
		System.out.println(a*b);
	}
	
	void sub()
	{
		System.out.println(a-b);
	}
	


	public static void main(String[] args) 
	{
		new Calculator(100, 200).add();
		new Calculator(10,20).mul();
		new Calculator(20,10).sub();
		
	}

}

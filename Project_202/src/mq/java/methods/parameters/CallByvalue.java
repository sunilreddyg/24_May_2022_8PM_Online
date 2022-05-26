package mq.java.methods.parameters;


public class CallByvalue 
{
	
	
	void mehtod1(int a)
	{
		System.out.println(a);
		
	}
	
	void method2(String name)
	{
		System.out.println(name);
	}
	
	void method3(double price)
	{
		System.out.println(price);
	}
	
	void method4(boolean flag)
	{
		System.out.println(flag);
	}
	

	public static void main(String[] args) 
	{
		CallByvalue obj=new CallByvalue();
		obj.mehtod1(100);
		obj.method2("Mindq");
		obj.method3(123.99);
		obj.method4(true);

	}

}

package mq.java.methods.parameters.CallByReference;

public class GetInfo 
{
	
	void method1(ProductInfo info)
	{
		System.out.println(info.name);
		System.out.println(info.price);
	}
	
	

	public static void main(String[] args) 
	{
		 GetInfo obj=new GetInfo();
		 obj.method1(null);

	}

}

package mq.java.methods.staticmethods;

public class Static_Permissions 
{
	
	public void method1()
	{
		//Any static method to call inside instant method no need of object creation
		method2();
	}
	
	
	public static void method2()
	{
		//Under static method any non static method to call we should call through object
		new Static_Permissions().method1();
	}
	


}

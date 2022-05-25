package mq.java.methods.staticmethods;

public class NativeInputs 
{
	//Reusable method with static specifier
	static void keyboard()
	{
		System.out.println("Keybord method Called");
	}
	
	//Reusable method with static specifier
	static void mouse()
	{
		System.out.println("mouse method called");
	}
	
	

	public static void main(String[] args) 
	{
		keyboard();
		mouse();

	}

}

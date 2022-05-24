package mq.java.methods.instantmethods;

public class RobotA 
{
	
	
	void on()
	{
		System.out.println("Power is ON");
	}
	
	void walk()
	{
		System.out.println("Robot started walking");
	}
	
	void testwalk()
	{
		on();
		walk();
	}


	public static void main(String[] args) 
	{
		//Static method doesn't allow non static method to call directly
		RobotA ref=new RobotA();
		ref.testwalk();

	}

}

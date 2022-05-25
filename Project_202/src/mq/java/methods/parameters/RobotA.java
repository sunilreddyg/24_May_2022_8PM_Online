package mq.java.methods.parameters;

public class RobotA 
{

	void walk()
	{
		System.out.println("5 KM speed");
	}
	
	void customwalk(int speed)
	{
		System.out.println(speed);
	}
	
	void walkAtarea(String areaname)
	{
		System.out.println(areaname);
	}
	
	
	public static void main(String[] args) 
	{
		RobotA obj=new RobotA();
		
		//Calling method without parameter
		obj.walk();
		
		//Calling method with runtime parameter 
		obj.customwalk(8);
		obj.customwalk(10);
		
		obj.walkAtarea("sand");
		obj.walkAtarea("Road");

	}

}

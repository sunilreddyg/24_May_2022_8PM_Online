package mq.java.constructors;

public class ChangeGear 
{
	//Constructor of the class
	public ChangeGear() 
	{
		System.out.println("Hold Clutch");
	}
	
	//instant method 
	public void Gear1()
	{
		System.out.println("Gear1 Changed");
	}
	
	//instant method 
	public void Gear2()
	{
		System.out.println("Gear2 Changed");
	}

	//instant method 
	public void Gear3()
	{
		System.out.println("Gear3 Changed");
	}
	
	//main method
	public static void main(String[] args) 
	{
		
		
		//Calling methods without variable reference
		new ChangeGear().Gear1();
		new ChangeGear().Gear2();
		new ChangeGear().Gear3();
		
		
		
		
		
		//Syntax:-->    ClassName obj=new ClassName();
		ChangeGear obj=new ChangeGear();
		obj.Gear1();
		obj.Gear2();
		obj.Gear3();
		
		
		
		
		
		
		
	}

}

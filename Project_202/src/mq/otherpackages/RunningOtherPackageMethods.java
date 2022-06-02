package otherpackages;

import mq.java.methods.instantmethods.RobotA;

public class RunningOtherPackageMethods 
{

	public static void main(String[] args) 
	{
	
		
		/*
		 * Rule1:--> Only public modifier methods we can access outside package
		 * RUle2:--> We should import package to current constructed class
		 */
		
		RobotA obj=new RobotA();
		obj.testwalk();
	

	}

}

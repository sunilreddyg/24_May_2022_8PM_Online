package mq.java.methods.parameters;

public class Multiple_Parameters 
{
	
	
	//Method without parameter
	//Here UID and PWD are fixed for single user
	public void login()
	{
		String UID="Admin";
		String PWD="Admin@123";
		System.out.println(UID);
		System.out.println(PWD);
	}
	
	
	//Method with parameter
	//Method allow different users to login
	public void userlogin(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	//Method allow different type of functional parameters 
	public void productinfo(String name,double price,boolean status)
	{
		System.out.println(name+"\t"+price+"\t"+status);
	}
	
	

	public static void main(String[] args) {
		
		Multiple_Parameters obj=new Multiple_Parameters();
		obj.login();
		
		obj.userlogin("Arun", "Ar@123");
		obj.userlogin("Sam","Sam@123");
		
		obj.productinfo("iphone", 45000.00, true);

	}

}

package mq.java.variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * String:--> 
		 * 			=> String store set of characters
		 * 			=> String is not only datatype and also called as class
		 * 			=> String class contains set of events to validate stored
		 * 				characters..
		 */
		
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two string and return
		 * 	 	bollean value true/false.
		 * 		Note:->Comparision is casesensitive..
		 */
		String Act_res="Account Transfered";
		String Exp_res="Account transfered";
		
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal comparision is true -->"+flag);
		
		
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify equal comparision between two string by
		 * 		ignoring case sensitive..
		 */
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("Equal Ignorecase comparision is --> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify any parital sequence characters avaialble
		 * 		in whole string..
		 */
		String Status="Ammount 10,000 transfered";
		boolean flag2=Status.contains("transfered");
		System.out.println("partial Text available status is "+flag2);
		

	}

}

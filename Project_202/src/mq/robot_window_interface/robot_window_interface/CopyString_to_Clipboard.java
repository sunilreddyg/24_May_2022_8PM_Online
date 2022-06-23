package robot_window_interface;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class CopyString_to_Clipboard {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Open Notepad File at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
	
		
		//Create object fo robot class
		Robot robot=new Robot();
		robot.setAutoDelay(200);   //It create intervel between each command
		
		
		String text="Welcome to selenium automation demo";
		
		
		//Select String
		StringSelection stext=new StringSelection(text);
		//Get access of system clipbord
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set content to clipbaord
		clipboard.setContents(stext, stext);
		
		
		
		//Press Control+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}

}

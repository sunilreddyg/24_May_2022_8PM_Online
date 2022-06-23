package robot_window_interface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Typing_text_At_Notepad_file 
{
 static void main(String[] args) throws IOException, AWTException, InterruptedException 
	{
		
		//Open Notepad File at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
	
		
		//Create object fo robot class
		Robot robot=new Robot();
		robot.setAutoDelay(200);   //It create intervel between each command
		
		//Type welcome to selenium demo
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_E);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_M);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_O);

	}

}

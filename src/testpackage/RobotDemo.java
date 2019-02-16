package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotDemo extends BaseClass1{

	public static void main(String[] args) throws AWTException {
		
		driver.get("http://localhost:90/login.do");
		Robot r = new Robot();
		//Press control key
		r.keyPress(KeyEvent.VK_CONTROL);
		//Press P key
		r.keyPress(KeyEvent.VK_P);
		//Release P
		r.keyRelease(KeyEvent.VK_P);
		//Release control
		r.keyRelease(KeyEvent.VK_CONTROL);
		
	

	}

}

package testpackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class WindowPopup_UsingAutoIT extends BaseClass {
	public static void main(String[] args) throws Exception {
		driver.get("http://localhost:90/login.do");
		//Press CONTROL key from your keyboard
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		//Press P key 
		r.keyPress(KeyEvent.VK_P);
		//Release P 
		r.keyRelease(KeyEvent.VK_P);
		//Release CONTROL from keyboard
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Runtime.getRuntime().exec("./autoit/printpopup.exe");
	}
}

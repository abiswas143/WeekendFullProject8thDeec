package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameDemo extends BaseClass1 {
	public static void main(String[] args) {
		driver.get("file:///C:/Users/Ajith/Music/sample%20webpages/Frame_Page2.html");
		//Using index of a frame
		//driver.switchTo().frame(2);//NoSuchFrameException

		//Using id or name attribute of a frame
		//driver.switchTo().frame("f1");
		//driver.switchTo().frame("n1");
		//Using frame address
		WebElement frameObj = driver.findElement(By.xpath("//iframe[@value='v1']"));
		driver.switchTo().frame(frameObj);
		
		driver.findElement(By.id("t1")).sendKeys("T1111111111");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("T222222222222");

	}

}

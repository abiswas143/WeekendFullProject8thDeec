package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo_moveToElement_ActionsClass extends BaseClass1 {

	
	public static void main(String[] args) {
		
		driver.get("http://istqb.in/");
		
		WebElement foundationObj = driver.findElement(By.xpath("(//a[text()='FOUNDATION'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(foundationObj).perform();
	
		
	}
}

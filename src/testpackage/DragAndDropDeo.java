package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropDeo extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Actions action = new Actions(driver);
		WebElement srcBlock1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement destBlock3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Thread.sleep(3000);
		action.dragAndDrop(srcBlock1, destBlock3).perform();
	}
}

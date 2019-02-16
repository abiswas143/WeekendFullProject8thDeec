package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUplodDemo extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		
		//use sendkeys to upload the file
WebElement uploadBtnObj = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
uploadBtnObj.sendKeys("C:\\Users\\Ajith\\Desktop\\Java access modifiers.txt");
	

	}

}

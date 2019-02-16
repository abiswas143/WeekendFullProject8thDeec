package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathAxesDemo extends BaseClass1{

	public static void main(String[] args) {
	
		//enter the url - https://www.seleniumhq.org/download/
		driver.get("https://www.seleniumhq.org/download/");
		//get the address of download link against java
		String xp = "//td[text()='Java']/following-sibling::td//a[text()='Download']";
		WebElement javaDownloadObj = driver.findElement(By.xpath(xp));//CTRL + 1 + ENTER
		//click on download link of Java
		javaDownloadObj.click();
	}

}

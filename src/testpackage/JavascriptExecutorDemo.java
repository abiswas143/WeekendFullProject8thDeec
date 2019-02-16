package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorDemo extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("http://localhost:90/login.do");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//enter admin in UN textbox- using javascriptexecutor
		jse.executeScript("document.getElementById('username').value='admin'");
		//enter manager in pwd textbox uisng javascriptexecutor
		//jse.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		WebElement pwdObj = driver.findElement(By.name("pwd"));
		jse.executeScript("arguments[0].value='manager'", pwdObj);
		//click on Login buton using jsava
		WebElement loginBtnObj = driver.findElement(By.xpath("//div[text()='Login ']"));
		System.out.println(loginBtnObj instanceof WebElement);//True
		jse.executeScript("arguments[0].click()", loginBtnObj);
		
		
	}

}

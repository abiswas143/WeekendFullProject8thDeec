package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {

	//set the path of geckodriver.exe
	static{
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
	}
	//Launch the browser
	public static WebDriver driver = new FirefoxDriver();
}

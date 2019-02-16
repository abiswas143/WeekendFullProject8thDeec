package testpackage;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotDemo extends BaseClass{
	public static void main(String[] args) {
		try {
			driver.get("http://localhost:90/login.do");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./screenshots/actitime.png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			
		}
	}
}

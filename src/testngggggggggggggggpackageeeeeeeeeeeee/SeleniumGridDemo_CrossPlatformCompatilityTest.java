package testngggggggggggggggpackageeeeeeeeeeeee;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SeleniumGridDemo_CrossPlatformCompatilityTest {
	@Parameters({"node","browser"})
	@Test
	public void runInMultipleOS(String node, String browser) throws Exception{
		System.out.println(node + " : "+browser);
		URL whichSystem = new URL(node);
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(whichSystem, whichBrowser);
		driver.get("http://localhost:90/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		for (int i = 1; i <= 1; i++) {
			unTB.sendKeys("admin--> " + i);
			Thread.sleep(2000);
			unTB.clear();
		}
		driver.close();
	}
}

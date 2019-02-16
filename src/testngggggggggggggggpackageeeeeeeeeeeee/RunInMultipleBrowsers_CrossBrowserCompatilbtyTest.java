package testngggggggggggggggpackageeeeeeeeeeeee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testpackage.BaseClass;

public class RunInMultipleBrowsers_CrossBrowserCompatilbtyTest{
	WebDriver driver ;
	
	static{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
	}
	@Parameters("browser")
	@Test
	public void testLogin(String browser) throws InterruptedException{
		System.out.println(browser);//firfox, chrome
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		} else if(browser.equals("chrome")){
			 driver = new ChromeDriver();
		} else{
			driver = new InternetExplorerDriver();
		}
		driver.get("http://localhost:90/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		for (int i = 1; i <= 10; i++) {
			unTB.sendKeys("admin--> " + i);
			Thread.sleep(2000);
			unTB.clear();
		}
		driver.close();
	}
}

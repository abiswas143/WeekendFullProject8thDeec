package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class FileDownloadDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//Using FirefoxProfile class - we can do profile related settting
		FirefoxProfile profile = new FirefoxProfile();
		//Website for KEY information - 
		//http://kb.mozillazine.org/About:config_entries#Browser
		String key = "browser.helperApps.neverAsk.saveToDisk";
		//URL for value
		//https://www.freeformatter.com/mime-types-list.html
		String value = "application/zip";
		profile.setPreference(key, value);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.seleniumhq.org/download/");
		//click on Download link against JAVA
		String xp = "//td[text()='Java']/following-sibling::td/a[text()='Download']";
		driver.findElement(By.xpath(xp)).click();
	}
}

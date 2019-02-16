package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class FileDownloadPopup_FirefoxProfileClass{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		//URL - http://kb.mozillazine.org/About:config_entries#Browser
		String key = "browser.helperApps.neverAsk.saveToDisk";
		//URL - https://www.freeformatter.com/mime-types-list.html
		String value = "application/zip";
		profile.setPreference(key, value);
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://www.seleniumhq.org/download/");
		//click on download link for java
		String xpath = "//td[text()='Java']/following-sibling::td/a[text()='Download']";
		driver.findElement(By.xpath(xpath)).click();
	}
}

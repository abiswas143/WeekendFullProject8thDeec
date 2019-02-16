package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		//Launch the firefox browser
		WebDriver driver = new InternetExplorerDriver();
		//Enter the url
		driver.get("http://www.google.com");
		//Print the title of the page
		String title = driver.getTitle(); // CTRL + 1 + ENTER
		System.out.println(" Title is :--> "+title);
		//Print the url of the curent page
		System.out.println(" URL is :--> "+driver.getCurrentUrl());
		driver.close();
	}
}

package testpackage;
import java.util.Set;
public class ChildBroserPopupDemo extends BaseClass1{
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		//print the window handle id of the parent browser window.
		String parentWH = driver.getWindowHandle();
		System.out.println(parentWH);
		//Print the window handle id of all the browser windows along with its title
		Set<String> allWHs = driver.getWindowHandles();
		System.out.println("Total # of windows opened are" + allWHs.size());
		for (String wh : allWHs) {
			driver.switchTo().window(wh);
			String actualTitle = driver.getTitle();
			System.out.println(wh  + " : " +actualTitle);
			/*//close only the Parent window
			if (wh.equals(parentWH)) {
				driver.close();
			}*/
			/*//close all the child browser windows
			if (!wh.equals(parentWH)) {
				driver.close();
			}*/
			//CLose a specific browser window
			if (actualTitle.equals("Toyo Engineering")) {
				driver.close();
				break;
			}
		}
		//driver.quit();
	}
}

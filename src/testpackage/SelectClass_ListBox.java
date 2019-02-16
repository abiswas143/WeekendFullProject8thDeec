package testpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class SelectClass_ListBox extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/Ajith/Music/sample%20webpages/ListBox.html");
		WebElement listBoxObj = driver.findElement(By.id("mtr"));
		Select s = new Select(listBoxObj);
		boolean status = s.isMultiple();
		if (status) {
			System.out.println("Multi select list box");
		} else {
			System.out.println("Single select list box");
		}
		//Print the total number of optins present in the list box.
		List<WebElement> allOptions = s.getOptions();
		System.out.println("Total options are :" + allOptions.size());
		//Print the text of all those options as well.
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
		}
		//Select IDLY 
		s.selectByIndex(0);
		//Select  DOSA
		s.selectByValue("d");
		//select Poori
		s.selectByVisibleText("Poori");
		System.out.println("*****Print the number of selected options********");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("Total selected options are :" + allSelectedOptions.size());
		System.out.println("*****Selected options are below \n********");
		for (WebElement selectedOption : allSelectedOptions) {
			System.out.println(selectedOption.getText());
		}
		System.out.println("*****Print the first selected option in the list box********");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("initial -->"+firstSelectedOption.getText());//IDLY
		s.deselectByIndex(0);
		System.out.println("final -->"+firstSelectedOption.getText());//IDLY
		System.out.println("Latest "+s.getFirstSelectedOption().getText());//DOSA
		s.deselectAll();
		Thread.sleep(4000);
		driver.close();
	}
}

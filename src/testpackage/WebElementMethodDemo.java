package testpackage;
import java.awt.Checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
public class WebElementMethodDemo extends BaseClass1{
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost:90/login.do");
		/*//Verify username and password textboxes are ALIGNED or not ?
		WebElement unTB = driver.findElement(By.id("username"));//CTRL + 1 + ENTER
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		int unxcor = unTB.getLocation().getX();
		int pwdxcor = pwdTB.getLocation().getX();
		int unycor = unTB.getLocation().getY();
		int pwdycor = pwdTB.getLocation().getY();
		//get the height and width of BOTh UN and PWD textbox
		int unHeight = unTB.getSize().getHeight();
		int pwdheight = pwdTB.getRect().getDimension().getHeight();
		int unWidth = unTB.getSize().getWidth();
		int pwdWidth = pwdTB.getRect().getDimension().getWidth();
		//System.out.println( unxcor +" : "+ pwdxcor + " : "+unycor + " : "+ pwdycor);
if (unxcor == pwdxcor && unycor != pwdycor && unHeight == pwdheight && 
unWidth == pwdWidth) {
			System.out.println("Both Username and password are ALIGNED");
		} else {
			System.out.println("NOT  ALIGNED");
		}
		//Verify Username textbox is displayed or not ?
		System.out.println(unTB.isDisplayed() + " --> UN textbox is displayed..");
		//Verify Username textbox is ENABLED or not ?
		System.out.println(unTB.isEnabled()+ " --> UN textbox is Enabled..");
		//Enter admin in to UN textbox
		unTB.sendKeys("admin");
		Thread.sleep(2000);
		//clear the username
		unTB.clear();
		//Verify the checkbox is selected or not ?
		WebElement chkBoxObj = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(chkBoxObj.isSelected() + " --> Checkbox is Not selected");
		chkBoxObj.click();
		System.out.println(chkBoxObj.isSelected() + " --> Checkbox is now selected");
		//Validate the tool tip message is correct
		String actTooltipMsg = chkBoxObj.getAttribute("title");
		System.out.println("actual Tooltip Msg is --> " + actTooltipMsg);
		if (actTooltipMsg.equals("Do not select if this computer is shared")) {
			System.out.println("Valid tool tip message");
		} else {
			System.out.println("Invalid tool tip message");
		}
		//Verify the actitime prodcut version is correct
		String xp = "//nobr[contains(text(),'actiTIME')]";
		WebElement prodVerObj = driver.findElement(By.xpath(xp));
		if (prodVerObj.getText().equals("actiTIME 2017.4")) {
			System.out.println("Valid product version..");
		} else {
			System.out.println("Invalid product version..");
		}
		//Verify ViewLIcence is a link, and if it is alink, click on the link
		WebElement viewLicLinkObj = driver.findElement(By.id("licenseLink"));
		String actTagName = viewLicLinkObj.getTagName();
		if (actTagName.equalsIgnoreCase("a")) {
			System.out.println("Yes, it is a link..");
			viewLicLinkObj.click();
		} else {

		}*/
		
		//Click on Login button without entering username and password
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Check for the availablility of error message
		String errorMsgXpath = "//span[contains(text(),'Username or Password is invalid')]";
		WebElement errMsgObj = driver.findElement(By.xpath(errorMsgXpath));
		boolean displayed = errMsgObj.isDisplayed();
		if (displayed) {
			System.out.println("Error msg is displayed");
			//verify the text of the error message is correct or not?
			if (errMsgObj.getText().contains("Username or Password is invalid")) {
				System.out.println("Valid error message");
				//Also validate the color of the error message is red 
				String errMsgColorCode = errMsgObj.getCssValue("color");
				System.out.println("String format Color code is :" + errMsgColorCode);//#ce0100
				String colorAsHex = Color.fromString(errMsgColorCode).asHex();
				System.out.println("Hexa format Color code is :" + colorAsHex);
				if (colorAsHex.equals("#ce0100")) {
					System.out.println("Valid color : RED");//RED
				} else {
					System.out.println("Invalid color");
				}
			} else {
				System.out.println("INvalid error message");
			}
		} else {
			System.out.println("Error msg NOT displayed");
		}
	//	driver.close();
	}
}

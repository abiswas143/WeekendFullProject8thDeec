package testngggggggggggggggpackageeeeeeeeeeeee;

import org.testng.Reporter;
import org.testng.annotations.Test;
//Test class OR Testng class
public class PrintA extends BaseTestng{
	@Test (invocationCount=2)//Test Method
	public void printA(){
		System.out.println("AAAA.....");
	}
}

package testngONemorepack;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PriorityDemo {
	@Test(priority=1)
	public void createUser(){
		System.out.println("createuser....");
		//how to fail a test method forcibly or explicitly
		Assert.fail();
	}
	/*@Test(priority=2, invocationCount=2, enabled=false)
	public void editUser(){
		System.out.println("editUser....");
	}*/
	@Test(priority=3,invocationCount = 2, dependsOnMethods={"createUser"})
	public void deleteUser(){
		System.out.println("deleteUser....");
	}
}

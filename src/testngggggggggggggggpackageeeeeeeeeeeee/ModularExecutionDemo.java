package testngggggggggggggggpackageeeeeeeeeeeee;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ModularExecutionDemo {
	//CONTR + SHIFT + / --> comment
	//CONTR + SHIFT + \ --> uncomment
	@Test(groups={"user", "smoke"})
	public void createUser(){
		System.out.println("createuser....");
	}
	@Test(groups={"user", "regression"})
	public void editUser(){
		System.out.println("editUser....");
	}
	@Test(groups={"user", "regression"})
	public void deleteUser(){
		System.out.println("deleteUser....");
	}
	@Test(groups={"product", "smoke"})
	public void createProduct(){
		System.out.println("createProduct....");
	}
	@Test(groups={"product", "regression"})
	public void editProduct(){
		System.out.println("editProduct....");
	}
	@Test(groups={"product", "regression"})
	public void deleteProduct(){
		System.out.println("deleteProduct....");
	}
	
	
	
	
	
	
	
	
	
	
	
}

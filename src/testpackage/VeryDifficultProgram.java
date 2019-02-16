package testpackage;
public class VeryDifficultProgram extends BaseClass{
	public static void main(String[] args) throws Exception {
		driver.get("http://localhost:90/login.do");
		LoginPage lp = new LoginPage(driver);
		//enter username  -- admin
		lp.setUsername("admin123");//1001
		//enter password - manager
		lp.setPassword("manager123");//1002
		//click On login button
		lp.clickLogin();
		Thread.sleep(5000);
		//here the login page is automatically getting refreshed
		//enter username  -- admin
		lp.setUsername("admin");//2001
		//enter password - manager
		lp.setPassword("manager");//2002
		//click On login button
		lp.clickLogin();
	}
}

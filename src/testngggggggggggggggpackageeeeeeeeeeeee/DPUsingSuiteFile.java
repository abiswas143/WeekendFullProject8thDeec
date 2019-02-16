package testngggggggggggggggpackageeeeeeeeeeeee;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class DPUsingSuiteFile {
	@Parameters({"city","area"})
	@Test
	public void testParameters(String city, String area){
		System.out.println(city + " , "+ area);
	}
}

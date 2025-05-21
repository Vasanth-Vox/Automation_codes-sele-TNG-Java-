package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_TestNG_05 {
	
	@Test
	@Parameters ("sender")
	public void paraclass(String connect) {
		
		System.out.println("This code is parameter printer from " + connect);
		
		
	}
	
	@Test
	@Parameters ("putting")
	public void paraclass2(String connect2) {
		String a = "vasanth";
		String b = connect2;
		String c= a + b;
		System.out.println("This code is parameter printer from " + c);
		
		
	}

}

package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_TestNG_06 {
	
	
	@Test
	public void Assertion() {
		
		String name = "Vasanth";
		
		//Assert.assertEquals(name,"vasanth");
		Assert.assertNotEquals(name,"vasanth");
		
		
		
	}

		@Test
		public void AssertionBoolean() {
		boolean value = false;
		//boolean value = True;
		
		//Assert.assertTrue(value, "THis is");
		Assert.assertFalse(value, "THis is");
	}

}

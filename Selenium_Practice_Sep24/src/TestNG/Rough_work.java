package TestNG;

import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Rough_work {
	long start;
	long End;
	long Totaltime;
	@BeforeSuite
	public void timeC() {
		System.out.println("Before method started");
	 start = System.currentTimeMillis();
	}

	@Parameters ("Season")
	@Test(priority = -2) //priority
	public void Apple  (String going) {
		System.out.println("Test Apple "+ going);
		String AT = "Vasanth";
		Assert.assertNotEquals(AT, "vasanth");
	}
	@Parameters ("Season1")
	@Test(priority = -1)
	public void Ball  (String going1) {
		System.out.println("Test Ball" + going1);
	}
	@Parameters ("Season2")
	@Test(priority = -3)
	public void Cat  (String going2) {
		System.out.println("Test Cat"+ going2);
	}
	
	
	@Test (priority = 1 , dependsOnMethods = "Cat1") //depends on method
	public void Apple1  () {
		System.out.println("Test Apple1");
		
	}
	@Test (priority = 2 , dependsOnMethods = "Apple1")
	public void Ball1  () {
		System.out.println("Test Ball2");
	}
	@Test (enabled = false,alwaysRun = true) // false has more power
	public void Ball_dummy  () {
		System.out.println("Test Ball2");
		
	}
	@Test (priority = 3)
	public void Cat1  () {
		System.out.println("Test Cat3");
	}
	
	@Test(priority = -2 , groups = {"G1"}) //Groupings
	public void AppleG  () {
		System.out.println("Test Apple - second run");
		String AT = "Vasanth";
		Assert.assertNotEquals(AT, "vasanth");
		
	}
	@Test(priority = -1, groups = {"G2"})
	public void BallG  () {
		System.out.println("Test Ball");
	}
	
	@Test(priority = -1 ,  groups = {"G2"})
	public void BallG2  () {
		System.out.println("Test Ball");
	}
	
	@Test(priority = -3 , groups = {"G1"})
	public void CatG () {
		System.out.println("Test Cat - First run ");
	}
	
	
	@AfterSuite
	public void timeEnd() {
		
	 End = System.currentTimeMillis();

	 Totaltime = End-start;
	 System.out.println("After method ended" + Totaltime);
	}
}

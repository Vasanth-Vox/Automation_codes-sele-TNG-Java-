package TestNG;

import org.testng.annotations.Test;

public class Despendson_TestNG_02 {
	
		//(threadPoolSize = 3,invocationCount = 5, alwaysRun = true timeout = 10000)
	    //if i use skip for parent, child will be dropped.
	    @Test (threadPoolSize = 3) 
	    public void calc() {
	    	//int[] val = {12,23,24,56};
	    	//val[2] = 50;
	    	//System.out.println("value is " + val[2]);
			System.out.println("print this calc ");
	    }
	    
	    @Test (dependsOnMethods = "calc", alwaysRun = true)
		public void firstcase() {
			System.out.println("print this First TestNG");
		}
	    
	    @Test (dependsOnMethods = "firstcase")
		public void secondcase() {
			System.out.println("print this second TestNG");
		}
	    
	    @Test (dependsOnMethods = "secondcase")
		public void thirdcase() {
			System.out.println("print this Third TestNG");
		}
	    
	    @Test(dependsOnMethods = "thirdcase")
		public void fourthcase() {
			System.out.println("print this Fourth TestNG");
		}
	    

}




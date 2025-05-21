
package TestNG;

import org.testng.annotations.Test;

public class Sample_TestNG_01 {
	
	//This code helps to know @Test , priority & Skip using enabled=false.
	//@Test - is an annotations 
	//Prioroty - is a key word
	    @Test (priority = -2)
		public void firstcase() {
			System.out.println("print this First TestNG");
		}
	    
	    @Test (priority = 2,enabled = false) 
	    public void calc() {
	    	int[] val = {12,23,24,56};
	    	val[2] = 50;
	    	System.out.println("value is " + val[2]);
			System.out.println("print this calc ");
	    }
	    
	    @Test (priority = -1)
		public void secondcase() {
			System.out.println("print this second TestNG");
		}
	    
	    @Test (priority = 0)
		public void thirdcase() {
			System.out.println("print this Third TestNG");
		}
	    
	    @Test (priority = 1)
		public void fourthcase() {
			System.out.println("print this Fourth TestNG");
		}
	    

}

package TestNG;

import org.testng.annotations.Test;

public class Grouping_TestNG_04 {
	
  
    @Test (groups = {"Apple"})
	public void firstcase() {
		System.out.println("Group Apple 1");
	}
    
    @Test (groups = {"Apple"})
	public void secondcase() {
		System.out.println("Group RedMI 1");
	}
    
    @Test (groups = {"Redmi"})  
	public void thirdcase() {
    	System.out.println("Group Apple 2");
	}
    
    @Test (groups = {"Redmi"}) 
	public void fourthcase() {
    	System.out.println("Group RedMI 2");
    }
    
    @Test (groups = {"Sam"}) 
  	public void fiveththcase() {
    	System.out.println("Group Samsung");
      }
    
    @Test
  	public void sixthcase() {
    	System.out.println("Group Samsung printed ");
      }

}

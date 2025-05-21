package TestNG;

import org.testng.annotations.DataProvider;

public class Inegration_2_DP {
	
	@DataProvider(parallel = true)
	public String[][] getdata(){
	String[][] excelvalue = Integration_1_xl.Excelmainlogin();
		
		
		
		return excelvalue;
	}
}


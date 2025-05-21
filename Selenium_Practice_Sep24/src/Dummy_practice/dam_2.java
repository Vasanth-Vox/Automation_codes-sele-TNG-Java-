package Dummy_practice;

public class dam_2 {
// Test for commit
	public static void main(String[] args) {
		int[] num = {4,2,7,8,5};
		  int add = 0;
		  int even = 0;
		  for (int ilesa : num) {
		  
		  if (ilesa %2==0) {
			  add += ilesa;
			System.out.println(ilesa + "eved");
		  } else {
			  even += ilesa;
			  System.out.println(ilesa + "odd");
	 
	  }
		  
	  }
		  System.out.println(add + " is sum of odd");
		  System.out.println(even + "is sum of even");
	 
}}

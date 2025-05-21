package Testing_Map;

import org.testng.annotations.Test;

public class Upper_Lower_Count {

	//@Test
	public void count() {
		// to find a count of upper lower
		String value = "VASanth kUMar loVES GOz";
		int upper = 0;
		int lower =0;
		for(int i=0;i<value.length();i++) {
			char cr = value.charAt(i);
			if(cr>= 'A' && cr<= 'Z') {
			upper++;
			}
			else if (cr>='a' && cr<='z') {
				lower++;
			}
		}
		System.out.println("value of upper " + upper);
		System.out.println("value of Lower " + lower);
	}
	
	//@Test
	public void SplitUpper_lower() {
		// to find a count of upper lower
		String value = "VASanth kUMar loVES GOz";
		String upper = "";
		String lower ="";
		for(int i=0;i<value.length();i++) {
			char cr = value.charAt(i);
			if(cr>= 'A' && cr<= 'Z') {
				upper = upper+cr;
			}
			else if (cr>='a' && cr<='z') {
				lower=lower+cr;
			}
		}
		System.out.println("Split value of upper " + upper);
		System.out.println("Split value of Lower " + lower);
	}
	
	//To find large num without using if
	//@Test
	public void max_min() {
		 
		int a = 10;
		int b = 12;
		int large = a>b ?a:b;
		System.out.println("find large " + large);
		
		
	}
	
	@Test
	public void reverse() {
		String name = "VasanthK chenai atti";
		
		 String[] words = name.split(" ");
	        
	        // Reverse the order of words
	        StringBuilder buf = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            buf.append(words[i]).append(" ");
	        }
		System.out.println("reversed text is " + buf);
		
	}
	
	//@Test
	public void spliting() {
		String name = "vasa, kusa, kasa, masa";
		String[] fnls = name.split(",");
		for (String string : fnls) {
			System.out.println(string); 
			
		}}
		
	
//@Test	
public void reversingh() {
	String dum = "vasanth";
		StringBuffer names = new StringBuffer();
		names.append(dum);
		names.reverse();
		System.out.println(names);
		
	}
@Test
public void duplicate() {
	int[] dup = {1,2,3,4,6,7,2,4};
	for(int i=0;i<dup.length-1;i++) {
		for(int j=i+1;j<dup.length;j++) {
			if (dup[i] == dup[j]) {
				System.out.println("duplicate us " + dup[i]);
			}
		}
	}

}

	
}



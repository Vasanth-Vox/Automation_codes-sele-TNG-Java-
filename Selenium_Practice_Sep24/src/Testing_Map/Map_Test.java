package Testing_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashMap<String, Integer> collect = new HashMap<>(); 
		collect.put("Mango",9);
		collect.put("Orange",17); 
		collect.put("Apple",1); 
		collect.put("Grape",3);
		//System.out.println(collect.keySet());
		String largestKey = ""; 
		int largestValue = Integer.MIN_VALUE;
		System.out.println("min is " + largestValue);
		

		// Iterate through the map to find the largest value and its key for
		
		for (Entry<String, Integer> string : collect.entrySet()){
			
			if (string.getValue()>largestValue) {
			 largestValue = string.getValue();
			 largestKey = string.getKey();
			}
		}
System.out.println(largestValue + "  "+ largestKey);
	}

	}


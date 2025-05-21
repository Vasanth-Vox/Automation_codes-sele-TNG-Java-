package Java;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap_02 {

	public static void main(String[] args) {
		// This code explains Hashset and feature. the only difference 
		//between Hashmap and LinkedHashMap is Insertion will be followed in LinkedHashMap.
		
		LinkedHashMap<Integer,String> details1 = new LinkedHashMap<Integer,String>();
		details1.put(91,"Tamil");
		details1.put(76, "english");
		details1.put(98, "Social");
		details1.put(95,"science");
		details1.put(89, "maths");
		System.out.println("print key values" + details1);
		
		LinkedHashMap<Integer,String> details12 = new LinkedHashMap<Integer,String>();
		details12.putAll(details1);
		System.out.println("print second map" + details12);
		details12.clear();
		System.out.println("cleared 2nd map" + details12);
		System.out.println("status of 2nd map" + details12.isEmpty());
		System.out.println("cloinig of 2nd map" + details1.clone());
		System.out.println("key contains" + details1.containsKey(89));
		System.out.println("value contains" + details1.containsValue("maths"));
		System.out.println("printing all keys" + details1.keySet());
		System.out.println("printing any one values" + details1.get(89));
		//System.out.println("printing any one values" + details1.get("Tamil")); works when both are string
		System.out.println("printing all values" + details1.values());
		System.out.println("remove values" + details1.remove(95));
		System.out.println("after remove values" + details1);
		System.out.println("printing all keys, values" + details1.entrySet());
		System.out.println("printing all keys, values SIZES" + details1.size());
		
		
		for (Integer onlykeys : details1.keySet()) {
			System.out.println("loops" + onlykeys);
			
		}

		for (String values : details1.values()) {
			System.out.println("loops" + values);
			
		}
		
		for (Integer onlykeys : details1.keySet()) {
			System.out.println("both" + onlykeys + "val" + details1.get(onlykeys));
			
		}
		
		
		


	}

}

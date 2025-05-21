package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSet_01 {

	public static void main(String[] args) {

		// This code explains Hashset and feature. the only difference 
		//between Hashset and Linked hashset is Insertion will be followed in linked hashset.
		HashSet<String> elements = new HashSet<String>();
		elements.add("Ajith");
		elements.add("Vijay");
		elements.add(null);
		elements.add("STR");
		elements.add("SK");
		System.out.println("all options are " + elements);
		int size = elements.size();
		System.out.println("size" + size);
		elements.remove(null);
		System.out.println("remove" + elements);
		boolean contains= elements.contains("SK");
		System.out.println(contains);
		boolean empty = elements.isEmpty();
		System.out.println(empty);
		//elements.containsAll(elements)
		HashSet<String> hashset = new HashSet<String>();
		hashset.addAll(elements);
		System.out.println("updated" + hashset);
		boolean allc = elements.containsAll(hashset);
		System.out.println("contains all " + allc);
		
			
		for (String string : elements) {
			boolean here = string.contains("Ajith");
			System.out.println("her con" + here);
			System.out.println("for each" + string);
		}
		
			

}}

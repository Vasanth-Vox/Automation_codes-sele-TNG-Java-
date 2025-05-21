package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> elements = new ArrayList<String>();
		elements.add("Ajith");
		elements.add("Vijay");
		elements.add(null);
		elements.add("STR");
		elements.add("SK");
		System.out.println("all options are " + elements);
		elements.add(0,"SK");
		System.out.println("update" + elements);
		elements.remove(3);
		System.out.println("remove" + elements);
		
		System.out.println("getting/printintg" + elements.get(1));
		elements.set(2, "Thalapathy  Vijay");
		System.out.println("replacing" + elements);
		System.out.println("Str is in index of " + elements.indexOf("STR"));
		System.out.println("last is in index of " + elements.lastIndexOf("Ajith"));
		
		//copyng full AL to new AL
		ArrayList<String> newlistArray = new ArrayList<String>();
		newlistArray.addAll(elements);
		System.out.println("Sytem copyed to new list" + newlistArray);
		elements.clear();
		System.out.println("size is " + newlistArray.size());
		Collections.sort(newlistArray);
		System.out.println("sortng done here" + newlistArray);
		
		
		for (int i = 0; i<newlistArray.size(); i++) {
			System.out.println("print "+  newlistArray.get(i));
		}
		for (String i : newlistArray) {
			System.out.println("Print all" + i);
			
		}
		System.out.println("---------------------------------------------");
		//listIterator interface - next & previous
		ListIterator<String> lister = newlistArray.listIterator();
		while (lister.hasNext()) {
			System.out.println(" next List works here" + lister.next());
		}
		while (lister.hasPrevious()) {
			System.out.println("previous works here" + lister.previous());
		}
			
		//Iterator is java based - only next
		
		Iterator<String> Item = newlistArray.iterator();
		while (Item.hasNext()) {
			System.out.println("single iterat works here" + Item.next());
		}

	}

}

package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedArrayList_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> elements = new LinkedList<String>();
		elements.add("Ajith");
		elements.add("Vijay");
		elements.add(null);
		elements.add("STR");
		elements.add("SK");
		
		elements.getFirst();
		System.out.println("get first is " + elements);
		
		elements.addFirst("Firstone");
		System.out.println("first is " + elements);
		elements.addLast("lastone");
		System.out.println("Last is " + elements);
		
		elements.getLast();
		System.out.println("get last is " + elements);
		elements.removeFirst();
		System.out.println("removed first is " + elements);
		elements.removeLast();
		System.out.println("removed last is " + elements);
		
		
		
		
		// all Arraylist functions are apply to linked list except abve 4
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
		LinkedList<String> newlistArray = new LinkedList<String>();
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
		System.out.println("---------------------------------------------");
		
		//using int
		LinkedList<Integer> elements2 = new LinkedList<Integer>();
		/*elements2.add("Ajith");
		elements2.add("Vijay");
		System.out.println("now first value is " +elements2.getFirst() );*/
		
		Collections.addAll(elements2, 9,6,7,8,4,3);
		Collections.sort(elements2);
		System.out.println(elements2);
		Collections.sort(elements2, Collections.reverseOrder());
		System.out.println(elements2);
		int min = Collections.min(elements2);
		System.out.println(min);
		int max = Collections.max(elements2);
		System.out.println(max);
		
		System.out.println("pollmfirst" + elements2.pollFirst());
		System.out.println("polllast" + elements2.pollLast());


	}

}

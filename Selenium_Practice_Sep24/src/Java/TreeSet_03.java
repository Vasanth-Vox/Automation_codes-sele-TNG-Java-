package Java;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner SC = new Scanner(System.in);
		//int num = SC.nextInt();
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(0);
		treeset.add(4);
		treeset.add(7);
		treeset.add(9);
		treeset.add(12);
		treeset.add(15);
		System.out.println("all options are" + treeset);
		System.out.println("first options are " + treeset.first());
		System.out.println("Last options are " + treeset.last());
		System.out.println("Headset options are " + treeset.headSet(7));
		System.out.println("tailset options are " + treeset.tailSet(9));
		System.out.println("Subset options are " + treeset.subSet(4,12));
		System.out.println("comparator options are " + treeset.comparator());
		System.out.println("Higher options are " + treeset.higher(12));
		System.out.println("Lower options are " + treeset.lower(7));
		System.out.println("poll first options are " + treeset.pollFirst());
		System.out.println("poll last options are " + treeset.pollLast());
		System.out.println("After pol options are " + treeset);
		
		Iterator<Integer> its = treeset.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		Iterator<Integer> descits = treeset.descendingIterator();
		while(descits.hasNext()) {
			System.out.println(descits.next());
		}
		
		


	}

}

package Day_10_commandline_argument;

import java.util.*;

public class LInkedList {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		//initial list of linked list
		
		l.add("waman");
		l.add("kalpesh");
		l.add("keshav");
		l.add("waman");	//accepting duplicate 
		System.out.println(l);
		
		//adding an element to specific position
		
		l.add(1,"prathmesh");
		System.out.println();
		System.out.println(l);
		System.out.println();
		
		LinkedList ll=new LinkedList();
		ll.addAll(l);
		System.out.println(ll);
		
		LinkedList lll=new LinkedList();
		lll.add("pankaj");
		lll.add("madhur");
		System.out.println();
		
		System.out.println(lll);
		
		ll.addAll(1,lll);
		
		System.out.println(ll);
		
		//adding element to first position
		ll.addFirst("john");
		
		System.out.println(ll);
		
		//adding element at last position
		ll.addLast("ganesh");
		System.out.println(ll);
	}

}

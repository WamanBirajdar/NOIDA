//example of linked list

package Day_10_commandline_argument;

import java.util.*;

public class LInkedList {

	public static void main(String[] args) {
		
		LinkedList <Integer> l=new LinkedList();
		
		l.add(12);
		l.add(22);
		l.add(344);
		l.add(34);
		l.add(0,100);
		l.add(0,200);
		l.addFirst(300);
		l.removeLast();
		
		System.out.println(l);
		
		Iterator i=l.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}

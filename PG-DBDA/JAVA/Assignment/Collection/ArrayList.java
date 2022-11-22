/*
Collection in java How to use iterator in collection
*/

package Operator;

import java.util.*;

public class InstanceofOperator {

	public static void main(String[] args) {
		
		//collection
		ArrayList mylist=new ArrayList();
		
		mylist.add("waman");
		mylist.add("birajdar");
		mylist.add("welcome");
		
		Iterator t=mylist.iterator();
		
		
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
		

	}

}

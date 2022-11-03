//  wap to print sum all even  and odd numbers  in  given array

package Day_3;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elements;
		int i,even=0,odd=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many elements you want to insert in array");
		elements=s.nextInt();
		
		// array declare
		int a[]=new int[elements];
		
		//insert number into array
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter elements");
			a[i]=s.nextInt();
		}
		
		//
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even=even+a[i];
			}
			else
			{
				odd=odd+a[i];
			}
		}
		System.out.println("Sumation of all even numbers is "+even);
		System.out.println("Sumation of all odd number is "+odd);
		
		
		
	}

}

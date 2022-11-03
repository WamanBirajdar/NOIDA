//wap to define an array of integer of size 6 .Take input from user and display it in reverse order
package Day_3;

import java.util.*;

public class ArrayReverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n[]=new int[6];
		int i,num;
		
		
		//taking number from user to insert into array
		for(i=0;i<n.length;i++)
		{
			System.out.println("Enter the number to insert into array");
			n[i]=s.nextInt();		
		}
		
		//display arry in reverse order
		for(i=n.length-1;i>=0;i--)
		{
			System.out.println(n[i]);
		}
		
		
	}

}



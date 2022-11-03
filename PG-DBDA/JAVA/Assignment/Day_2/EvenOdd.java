// wap program to find even odd numbers from user defined array
package Day_3;

import java.util.*;

public class EvennumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int elements,i;
		
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY ELEMENTS");
		elements=s.nextInt();
		
		int array[]=new int[elements];
		
		//insert elements in array		
		for(i=0;i<array.length;i++)
		{
			System.out.println("Enter number");
			array[i]=s.nextInt();
		}
		
		for(i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.println("From array "+array[i]+" is Even number");
			}
			else
			{
				System.out.println("From array "+array[i]+" is Odd number");
			}
		}
		
	}

}

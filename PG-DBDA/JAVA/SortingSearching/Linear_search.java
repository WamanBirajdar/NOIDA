/*
llinear search in array 
*/
package Day_1;

import java.util.*;

public class Linear_Example {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array elemts");
		int n=s.nextInt();
		int i;
		//initialization of array 
		int a[]=new int[n];
		
		
		//inserting elements in array
		for(i=0;i<a.length;i++)
		{
			System.out.println("Insert element in array");
			a[i]=s.nextInt();
		}
		
		//Display the array elements 
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//enter the number to be search in array
		System.out.println("Enter the number to be search");
		int n1=s.nextInt();
		
		//searching number in array using linear search
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n1)
			{
				System.out.println("Key found" );
				break;
			}
						
		}
		if(i==n)
		{
			System.out.println("Key not found");
		}
		
		


	}

}

/*
Enter the array elemts
5
Insert element in array
10
Insert element in array
13
Insert element in array
2
Insert element in array
33
Insert element in array
45
10
13
2
33
45
Enter the number to be search
33
Key found

 */



/*
BEST CASE COMLIXITY:
WORST CASE COMLIXITY:
AVG CASE COMLIXITY:
 */

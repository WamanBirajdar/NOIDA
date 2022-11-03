//wap to search a particular number in given array and print its position

package Day_2;


import java.util.*;

public class ArrayPosition {

	public static void main(String[] args) {
		
		int elements;
		int i,num;
		
		Scanner s=new Scanner(System.in);
		
		//number of elements to be insert into array
		System.out.println("Enter the elements insert into array");
		elements=s.nextInt();
		
		//array declare 
		int a[]=new int[elements];
		
		//inserting elements into array using for loop
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter number");
			a[i]=s.nextInt();
			
		}
		
		System.out.println("Enter a number which you want to search");
		num=s.nextInt();
		
		//search particular number in array and its position
		for(i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("Index of given number "+i);
				
			}
		}
		

	}

}

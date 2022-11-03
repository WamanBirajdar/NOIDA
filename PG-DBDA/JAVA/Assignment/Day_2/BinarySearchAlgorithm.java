package Day_3;

import java.util.Arrays;
import java.util.Scanner;

//wap to search element in an array using binary search 
// dividing sorted array and then we will search data in it 
public class BinarySearchAlgorithm{

	public static void main(String[] args) {
		
		int a[]=new int[5];
		int i;
		
		int first=0;
		int last=a.length-1;
		int mid=(first+last)/2;
		int key;
		
		Scanner s=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter the number");
			a[i]=s.nextInt();
		}
		
		
		System.out.println("Enter the key to which you want to search");
		key=s.nextInt();
		
		
		while(first<=last)
		{
			
			
			if(a[mid]<key)
			{
				first=first+1;
			}
			else if(a[mid]==key)
			{
				System.out.println("Key found");
				break;
				
			}
			else
			{
				last=last-1;
			}
		
		}
		if(first>last)
		{
			System.out.println("record not found");
		}


	}

}

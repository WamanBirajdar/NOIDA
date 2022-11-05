//wap sort array using bubble sort

package SortingSearching;


import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a elements");
		int elements=s.nextInt();
		int i,j,temp;
		int a[]=new int[elements];
		
		//inserting elements in array
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter number");
			a[i]=s.nextInt();
		}
		
		
		//loop for bubble sort
		for(j=0;j<a.length-1;j++)
		{
			for(i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		
		

	}

}

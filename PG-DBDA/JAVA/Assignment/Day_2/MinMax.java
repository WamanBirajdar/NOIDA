package Day_3;

import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elements,i;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements");
		elements=s.nextInt();

		//array initialization
		int a[]=new int[elements];
		
		// inserting elements in array
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter number to array");
			a[i]=s.nextInt();
		}
		
		int min=a[0];
		int max=a[0];
		//
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximum number is "+min);
		System.out.println("Minimum number is "+max);
	}

}

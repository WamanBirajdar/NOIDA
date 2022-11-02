package Day_3;

import java.util.*;

// wap ask user to insert element in array and print sumation of all elements
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s=new Scanner(System.in);
		int k[]= new int[5];
		
		
		/// taking numbers from user
		for(i=0;i<5;i++)
		{
			System.out.println("Enter number");
			k[i]=s.nextInt();
		}
		
		//display number on console
		for(i=0;i<5;i++)
		{
			System.out.println(k[i]);
		}
		
		// sumation of all numbers in array
		int sum=0;
		for(i=0;i<5;i++)
		{
			sum=sum+k[i];
		}
		System.out.println(sum+" Sumation of all array elemts");
	
		
		
	}

}

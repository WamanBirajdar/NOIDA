//checks whether the reverse of a number is equal to its original or not.

package CodeCrackers;

import java.util.*;

public class PrimeNumber {
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=s.nextInt();
		int rem,rev=0;
		int org=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
		}
		if(org==rev)
		{
			System.out.println("Yes!, Given number "+org+" is palidrome");
		}
		else
		{
			System.out.println("Yes!, Given number "+org+" is not palidrome");
		}
			
		
	}

}

/*
Q 3 wap to check any number is spy number or not 
example 
1124 is spy  i.e 1+1+2+4  =8 
                     and 1*1*2*4=8 
  */

package Additional_practice;

import java.util.*;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num,product=1,rem,sum=0;
		char ch;
		
		System.out.println("Enter the number");
		num=s.nextInt();
		
		while(num>0)
		{
				rem=num%10;
				sum=sum+rem;
				product=product*rem;
				num=num/10;
			
		}
		System.out.println("Enter usumation of digits: "+sum);
		System.out.println("product of digits: "+product);
		
		if(sum==product)
		{
			System.out.println("given number is spy number: "+num);
		}
		else
		{
			System.out.println("given number is not spy number "+num);
		}

	}

}

package Day_2;

import java.util.*;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,originalnum,remainder;
		int result=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		num=s.nextInt();
		
		originalnum=num;
		
		while(originalnum!=0)
		{
			remainder=originalnum%10;
			result+=remainder*remainder*remainder;
			originalnum/=10;
			
		}
		if(result == num)
		{
			System.out.println(num+" is an armstrong number");
		}
		else
		{
			System.out.println(num+" is not an armstrong number");
		}
		
		

	}

}

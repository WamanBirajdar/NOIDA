package Day_2;

import java.util.*;

public class EvenOdd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number");
		num=s.nextInt();
		
			if(num%2==0)
			{
				System.out.println("Given "+num+" is even number ");
			}
			else
			{
				System.out.println("Given "+num+" is odd number ");
			}
			

		
	}

}

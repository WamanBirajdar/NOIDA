// swapping numbers without using third variable
package Day_2;

import java.util.*;

public class SwapNumbers_without {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter first number");
		n1=s.nextInt();
		
		System.out.println("Enter second number");
		n2=s.nextInt();
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("First number after swapping "+n1);
		System.out.println("Second number after swapping "+n2);

	}

}

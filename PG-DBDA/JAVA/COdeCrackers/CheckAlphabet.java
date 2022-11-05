//The question is, write a Java program to check whether a character is an alphabet or not using if-else. The program given below is its answer:

package CodeCrackers;

import java.util.*;

public class PrimeNumber {
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter alphabet");
		char ch =s.next().charAt(0);
	
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println("Given character is "+ch+" Alphabet");
		}
		else if(ch>='0' && ch<=9)
		{
			System.out.println("Given character is "+ch+" Number");
		}
		else
		{
			System.
			out.println("Given character is "+ch+" Symbol");
	
		}
			
		
			
		
	}

}

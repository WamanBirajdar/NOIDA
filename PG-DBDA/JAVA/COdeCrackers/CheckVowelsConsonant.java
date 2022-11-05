//The question is, write a Java program to check whether an input character (alphabet) is a vowel or consonant. The program given below is its answer:
package CodeCrackers;

import java.util.*;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int count=0;
		int vowels[]= {'a','e','i','o','u'};
		
		System.out.println("ENTER A CHARACTER");
		char ch=s.next().charAt(0);
		
		for(int i=0;i<vowels.length;i++)
		{
			if(vowels[i]==ch)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Given character is "+ch+" Consonant");
		}
		else
		{
			System.out.println("Given character is "+ch+" Vowel");
		}
	
		
		
			
		
	}

}

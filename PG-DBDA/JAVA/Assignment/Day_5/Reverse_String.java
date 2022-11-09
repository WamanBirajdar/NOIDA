package Additional_practice;

import java.util.*;


public class ReverseString {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	     String str, strReverse="";
	      int len, i;
	      char ch;
	      
	      System.out.print("Enter the String: ");
	      str = s.nextLine();
	      
	      len = str.length();
	      for(i=(len-1); i>=0; i--)
	      {
	         ch = str.charAt(i);
	         strReverse = strReverse + ch;
	      }
	      
	      System.out.println("\nReverse = " +strReverse);
	}

}


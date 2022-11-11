/*
Q4 wap to ask string from user and convert each letter to upper case
 */

package Additional_practice;

import java.util.*;

public class CharUpperCase {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter an Alphabet: ");
	      char ch = scan.next().charAt(0);
	      
	      int ascii = ch;
	      if(ascii>=97 && ascii<=122)
	      {
	         ascii = ascii - 32;
	         ch = (char)ascii;
	         System.out.println("\nEquivalent Character in Uppercase = " +ch);
	      }
	      else if(ascii>=65 && ascii<=90)
	         System.out.println("\nThe alphabet is already in Uppercase");
	      else
	         System.out.println("\nIt is not an alphabet");
	      
	   }
		

	

}

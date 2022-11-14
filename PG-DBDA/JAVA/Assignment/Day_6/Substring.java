/*Q7 wap to check if given string starts with "java"  return true otherwise return false.

hint f = str.substring(0,4)
Code*/
package Additional_practice;

import java.util.*;

public class SubstringCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str,f,substring;
		
		System.out.println("Enter string");
		str=s.nextLine();
		
		f=str.substring(0, 4);
		substring=f;
		if("java".equals(f))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}

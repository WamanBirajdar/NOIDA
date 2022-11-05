//using constructor even odd check number
package CodeCrackers;

import java.util.*;

public class JavaExamples {
	//even or odd using constructor
	
	JavaExamples(int x)
	{
		if(x%2==0)
		{
			System.out.println("Given number "+x+" is even number");
		}
		else
		{
			System.out.println("Given number "+x+" is odd number");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		//asking user to enter nubmer
		System.out.println("Enter number");
		int num1=s.nextInt();
		
		//calling constructor
		
		JavaExamples j=new JavaExamples(num1);
		
		
		
	}

}




//using ternary operator cjeck given number is even or odd
package CodeCrackers;

import java.util.*;

public class JavaExamples {
	//even or odd using constructor
	
	JavaExamples(int x)
	{
		int even=(x%2==0)?0:1;
		if(even==0)			System.out.println("Given number is even number");
		else				System.out.println("Given number is odd");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		//asking user to enter nubmer
		System.out.println("Enter number");
		int num1=s.nextInt();
		
		//calling constructor
		
		JavaExamples j=new JavaExamples(num1);
		
		
		
	}

}

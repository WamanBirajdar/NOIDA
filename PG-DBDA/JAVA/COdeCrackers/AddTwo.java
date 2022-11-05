// addition of two number using function

package CodeCrackers;

import java.util.*;

public class JavaExamples {

	public static void main(String[] args) {
	
		int num1,num2,result;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=s.nextInt();
		
		System.out.println("Enter second number");
		num2=s.nextInt();
		
		result=add(num1,num2);
		System.out.println("addition of two number "+result);
		
	}
	public static int add(int num1,int num2)
	{
	
		return (num1+num2);
	}

}




//addition of two numbers using constructor

package CodeCrackers;

import java.util.*;

public class JavaExamples {
//calculator using constructor
	int add;
	JavaExamples(int x,int y)
	{
		add=x+y;
		System.out.println("Addition of two number "+add);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1=s.nextInt();
		
		System.out.println("Enter second number");
		int num2=s.nextInt();
		
		JavaExamples j=new JavaExamples(num1,num2);
		
	}

}


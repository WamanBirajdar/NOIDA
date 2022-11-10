/*
Q 1 Take two integers and as input, you have to compute x/y . If x and
y are not integers or if is zero , exception will occur and you have to
report it. Read sample Input/Output to know what to report in case of
exceptions.
  */

package Day8_inner_classes_exceptionhandling;

import java.util.InputMismatchException;

public class Q1_lab {

	int a;
	int b;
	void compute(int a,int b)
	{
		try {
		  this.a=a;
		  this.b=b;
		 
		int z= a/b;
		}
		catch(ArithmeticException r)    {	System.out.println("number cannot be zero");		}
		catch(InputMismatchException g) {		System.out.println(" wrong type of input ");}
	}
	//case 2 : this method throws UncheckedException
		void compute2(int a,int b)throws ArithmeticException
		{
			this.a=a;
			this.b=b;
			int z= a/b;
		}
			 
	   //case 3 this method throws checked exception 
		//so whosever will call this method must make try catch or write throws
		void compute3(int a,int b)throws Exception
		{
			this.a=a;
			this.b=b;
			int z= a/b;
		}
			
	 
	
	public static void main(String[] args) {
		Q1_lab l= new Q1_lab ();
		l.compute(10, 0);
		//line 48 method throws Exception 
		//but that is unchecked so it is not mandatory to create try catch
		l.compute2(11,22);
		try {
		   l.compute3(11,2);
		}catch(Exception r) {}

	}

}

package Exam;
import java.util.*;

interface Arithmetic{
	int division(int n);
}

class Calculator implements Arithmetic{
	
	public  int division(int n)
	{
		int i,count=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+i;
			}
		}
		return count ;
	}
	
}
public class InterfaceCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Calculator c=new Calculator();
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println(c.division(n));
		
		

	}

}

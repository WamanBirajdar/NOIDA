//conversion f-->c and c--> f

package CodeCrackers;

import java.util.*;

public class PrimeNumber {
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		double f,c;
		System.out.println("Enter your choice 1 ) Fahrenheit to celsius 2) celsisus to Fahrenheit");
		int ch=s.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter Tempreture int Fahrenheit");
			f=s.nextFloat();
			
			c=(f-32)/1.8;
			System.out.println("Tempreture in Celsius "+(float)c);
			break;
		case 2:		
			System.out.println("Enter Tempreture int Celsisus");
			c=s.nextFloat();
			
			f=(c*1.8)+32;
			System.out.println("Tempreture in Fahrenheit "+(float)f);
			break;
		default:
			System.out.println("Invalid choice!");
				
		}
		
	}

}

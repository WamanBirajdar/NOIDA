/*
Q 1   Write a multi- threaded program that prints even and odd number one after another .
create two separate classes to print even and odd number and call there objects in main
*/

package threading;

class Evennumber extends Thread
{
	@Override
	public void run()
	{
		try 
		{
		for(int i=1;i<10;i++)
		{
		if(i%2==0)
		{
			 System.out.println("Even number is: "+i);
			 Thread.sleep(2000);
		}
		 
		}}catch(InterruptedException e) {}
	}
}

class Oddnumber extends Thread
{
	@Override
	public void run()
	{
		try 
		{
		for(int i=1;i<10;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd number is: "+i);
				 Thread.sleep(2000);
			}
		 
		}}catch(InterruptedException e) {}
	}
}

public class EvenOdd_Example {

	public static void main(String[] args) {
	
		Oddnumber o=new Oddnumber();
		o.start();
		Evennumber e=new Evennumber();
		e.start();
		
	

	}

}

/*
output
Odd number is: 1
Even number is: 2
Odd number is: 3
Even number is: 4
Odd number is: 5
Even number is: 6
Odd number is: 7
Even number is: 8
Odd number is: 9
*/

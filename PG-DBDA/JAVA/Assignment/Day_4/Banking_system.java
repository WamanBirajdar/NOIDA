/*Q create package bankingsystem
Q create class bank having fileds like customer name,accountno,amount
Q in above program create few methods given below
 
void input ()
void deposit(int m)
void withdraw(int u)
void display()


In deposit check if amount deposited is more than 50000 print  ask pan card details and print amount + deposited amount

Q in withdraw check amount- withdraw amount> min balance then print balance amount
else display withdraw not allowed

Q create another class BankRecord having main method and call all above methods
*/

package Banking_system;
import java.util.*;
class Bank{
	
	String customer_name;
	int amount,account_no;
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a customer name");
		customer_name=s.nextLine();
		
		System.out.println("Enter amount");
		amount=s.nextInt();
		
		System.out.println("Enter Account no");
		account_no=s.nextInt();
		
	}
	void withdraw(int u)
	{
		int min=1000;
		if(amount-u >= min)
		{
			System.out.println("Transaction in processing");
			System.out.println(amount-u);
		}
		else
		{
			System.out.println("Withdraw is not allowed");
		}
		
	}
	void deposit(int a)
	{
		if(a>50000)
		{
			System.out.println("Enter pan card details");
			amount=a+amount;
		}
		else
		{
			amount=a+amount;
			System.out.println("Final maount is "+amount);
		}
	}
	
	void display()
	{
		System.out.println("Customer name is "+customer_name);
		System.out.println("Your account no is "+account_no);
		System.out.println("Your amount is "+amount);
		System.out.println("Visit again!!");
		
	}
}

public class BankRecord {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.input();
		b.withdraw(2000);
		b.deposit(45000);
		b.display();
		

	}

}

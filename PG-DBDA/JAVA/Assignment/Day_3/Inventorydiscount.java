/*Q create a class Inventory having fields like productname, price and qty ,discount
Q 2 create method like getInventory and displayInventory
Q 3 create another method discount that calculate discount 
if product price <1000 10% 
if product price between 1000 and  3000 then 20% 
else 40%

4 ) create another class Record having main method call above class method */


package Day_5_Array_inheritance;

import java.util.*;

public class Inventory {
	
	String pname;
	double price,discount;
	int qty;
	
	
	void getInventory()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter product name");
		pname=s.next();
		
		System.out.println("Enter price");
		price=s.nextDouble();
		
		System.out.println("Enter qty");
		qty=s.nextInt();
	}
	
	void displayInventory()
	{
		System.out.println("Product name "+ pname +" product qty"+ qty + "price of product "+ price);
		System.out.println("");
		if(price<1000)
		{
			discount=0.10*price;
			price=price - discount;
			System.out.println("After discount price of product is "+price);
		}
		else if(price >= 1000 && price <= 3000)
		{
			discount=0.20*price;
			price=price-discount;
			System.out.println("After discount price of product is "+price);
		}
		else
		{
			discount=0.40*price;
			price=price-discount;
			System.out.println("After discount price of product is "+price);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inventory in[]= new Inventory[2];
		
		for( int i=0;i<2;i++)
		{
			in[i]= new Inventory();// creating object 
			in[i].getInventory();
		}
		for( int i=0;i<2;i++)
		{
			in[i].displayInventory();
		}

	}

}

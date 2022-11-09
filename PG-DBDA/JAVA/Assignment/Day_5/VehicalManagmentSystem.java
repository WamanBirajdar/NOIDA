package Day_7_inheritance;
import java.util.*;

public abstract  class Vehical
{
 String vname;
 String number;
 String company;
 int price;

 abstract void speed();
 abstract void registration();

}

class Car extends Vehical
{  
	void speed()        {System.out.println("car speed >100");}
	void registration() 
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter Owner name");
		String oname=n.next();
		
		System.out.println("car registration vehicle name: "+vname);
		System.out.println("car registration number "+number);
		System.out.println("car registration number "+oname);
	}
	
	
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter vehicle name ");
		vname=s.next();
		
		System.out.println("Enter company");
		company=s.next();
		
		System.out.println("Enter number");
		number=s.next();
		
		System.out.println("Enter price");
		price=s.nextInt();
		
	}
	
	void DisplayData()
	{
		System.out.println("----------------------------------------------------------------");
		System.out.println("INFORMATION OF VEHICLE");
		System.out.println("Name of vehivle: "+vname);
		System.out.println("Name of company: "+company);
		System.out.println("Price of vehicle: "+price);
		System.out.println("Number of vehicle: "+number);
		System.out.println("----------------------------------------------------------------");
	}
}


class Bike extends Vehical{
	void speed()        {System.out.println("bike speed >70");}
	void registration() {System.out.println("bike registration method");}
	
	void getDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter vehicle name ");
		vname=s.next();
		
		System.out.println("Enter company");
		company=s.next();
		
		System.out.println("Enter number");
		number=s.next();
		
		System.out.println("Enter price");
		price=s.nextInt();
	}
	
	void shoDetails() 
	{
		System.out.println("----------------------------------------------------------------");
		System.out.println("INFORMATION OF VEHICLE");
		System.out.println("Name of vehivle: "+vname);
		System.out.println("Name of company: "+company);
		System.out.println("Price of vehicle: "+price);
		System.out.println("Number of vehicle: "+number);
		System.out.println("----------------------------------------------------------------");
		
	}
}

//output
/*
ENTER YOUR CHOICE 1)CAR 2)BIKE
1
Enter vehicle name 
Harrier
Enter company
TATA
Enter number
MH8855
Enter price
2500000
car speed >100
Enter Owner name
WAMAN
car registration vehicle name: Harrier
car registration number MH8855
----------------------------------------------------------------
INFORMATION OF VEHICLE
Name of vehivle: Harrier
Name of company: TATA
Price of vehicle: 2500000
Number of vehicle: MH8855
----------------------------------------------------------------

*/

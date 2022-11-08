/*  1) Create one class person initialize varible like name,salary,address and 
    2) Create another class employee take user input also create getemploye and displayemployee two methods and inheritant person variable in employee
    3) Create main and call getEmployee and displayEMployee methods  
 */



package Day_6;

import java.util.*;

class Person{
	
	//instance variable of this class
	String name,address;
	int salary;
	
}

class Employee extends Person{
	void getEmployee(Person p)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NAME OF PERSON");
		name=s.next();
		
		System.out.println("ENTER ADDRESS OF EMPLOYEE ");
		address=s.next();
		
		System.out.println("ENTER SALARY OF EMPLOYEE");
		salary=s.nextInt();						
	}
	
	void displayEMployee()
	{
		System.out.println("name of employee "+name);
		System.out.println("salary of eployee "+salary);
		System.out.println("Address of employee "+address);
	}
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.getEmployee(e);
		e.displayEMployee();
		

	}

}

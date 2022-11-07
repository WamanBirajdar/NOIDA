/*
Q create a class employee having fields like  name ,age ,salary;
   create method
        1) void getEmployee(String n,int m ,int o){}
       
a) create a main  method  .
b) create object of employee class;
c) create three variables in name String n,int m,int o
d) Ask their value from user using scanner .
e) pass three values in getEmployee method as arguments as assign it to instance variables

d)call display method and display all values.

-------------------------------------------

 e ) create another  class Testing having method

//this method takes Employee object as argument and check if his salary >20000 then return whole object after adding 1000 to its salary
else return it as it is ;

Employee CheckSalary (Employee e)
{
}

f) In main create Testing class Object and call its CheckSalary Method
g) print updated value returned after calling above method

*/

package Revision_Day;

import java.util.*;

public class Employee {
	//instance variable 
	public String name;
	public int salary,age;
	
	
	
	void getEmployee(String n,int m, int o)
	{
		name=n;
		salary=m;
		age=o;
	}
	
	void display()
	{
		System.out.println("Employee name: "+name +" Salary of Employee: "+ salary+ " age of employee: "+age);
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
	
		System.out.println("Enter name");
		String a=s.next();
		int b=s.nextInt();
		int c=s.nextInt();
		
		e.getEmployee(a, b, c);
		e.display();
		
		
		Testing t=new Testing();
		t.checksalary(e);
		System.out.println("salary after updation");
		e.display();
		
		
		
	}

}

// Testing another class
package Revision_Day;

public class Testing {

	Employee checksalary(Employee m)
	{
		if(m.salary>25000)
		{
			m.salary=m.salary+10000;
		}
		else
		{
			m.salary=m.salary;
		}
		return m;
	}
}


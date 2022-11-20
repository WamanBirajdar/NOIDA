/*

this keyword is used to invoke current class default constructor

*/

package this_keyword;

class Student1{
	
	String name;
	int age;
	//no parameterized constructor
	Student1()
	{
		System.out.println("This is defualt constructor");
	}
	
	//parameterized constructor
	Student1(int age,String name)
	{
		this();
		this.name=name;
		this.age=age;
	}
	void dislpay()
	{
		System.out.println("Name of student:" +name+"   Age: "+age);
	}
	
	
}
public class this_Example2 {

	public static void main(String[] args) {
		Student1 s=new Student1(25,"waman");
		s.dislpay();

		
		

	}

}

/*
This is defualt constructor
Name of student:waman   Age: 25

*/

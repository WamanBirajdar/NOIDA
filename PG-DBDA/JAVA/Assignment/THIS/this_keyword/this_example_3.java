//this is keyword used to refer current class instsace variable
package this_keyword;

class Student{
	//instance variable 
	String name;
	int age;
	
	
	//Parameterized constructor
	Student(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println(name+" "+age);
	}
}
public class This_keyword_example {

	public static void main(String[] args) {
		Student s= new Student(25,"waman");
		s.display();
	}

}

/*
waman 25

*/

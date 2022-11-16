/*singleton is a design pattern 
 singleton class can have only one object
Rules 
1 constructor must be private 
2 class must have its own class object declared as static inside class itself
3 singleton class must have factory method 
factory method return its own class object */


package day12_singleton_jdbc;

class configuration 
{  
	 
	static configuration r= new configuration();
	 
	//by making private constructor class object cannot be created outside class 
	private configuration()	{	}
	
	//factory method -- that return same class object 
	static   configuration getObject()
	{
		return r; 
	}
	 
}

public class SingletonExample {

	public static void main(String[] args) {
		configuration t = configuration.getObject();
		configuration t1 = configuration.getObject();
		configuration t2 = configuration.getObject();
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		

	}

}


/*output-->
Address of object t is: Day_12_singletone.configuratino@5a07e868
Address of object t1 is: Day_12_singletone.configuratino@5a07e868
Address of object t2 is: Day_12_singletone.configuratino@5a07e868
*/

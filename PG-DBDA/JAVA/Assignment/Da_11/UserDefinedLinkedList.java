/* wap to ask user to enter records and store them in container
*/

package Day_11_collection_jdbc;

import java.util.*;


public class User_Defined_List {

  //class created of employee
  class Emp
  {	String name;
    int age;
    Emp(String a,int b)
    {	name=a;
      age=b;
    }
    @Override
    public String toString()
    {
      return name +"  "+age;
    }
  }

	public static void main(String[] args) {
		System.out.println("Enter teh reocrds to insert ");
		
		Scanner s=new Scanner(System.in);
		
		String n1;
		int a1;
		int n=s.nextInt();
		
		LinkedList<Emp> l=new LinkedList<Emp>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name and age");
			n1=s.next();
			a1=s.nextInt();
			l.add(new Emp(n1,a1));
		}
			
		//System.out.println(l);
		
		Iterator i =l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

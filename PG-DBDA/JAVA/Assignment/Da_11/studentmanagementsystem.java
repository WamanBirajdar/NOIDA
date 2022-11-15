/* wap to create container store value in 
*/

package Day_11_collection_jdbc;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class student
{   int rollno;
	int marks;
	String name;
	 
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	  student(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	public int getMarks()           {		return marks;	}
	public void setMarks(int marks) {		this.marks = marks;	}
	public String getName()         {		return name;	}
	public void setName(String name) {		this.name = name;	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	

}
class MarksComparator implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) {
		 
		return o1.getRollno()-o2.getRollno();
	}
}

public class SMS_Array_List {

	public static void main(String[] args)
	{   
		 TreeSet <student> t= new TreeSet<student>(new MarksComparator());
		 //HashSet <student> t= new HashSet<student>();
		//LinkedHashSet <student> t= new LinkedHashSet<student>();
		t.add(new student(3,10,"ashu"));
		t.add(new student(8,30,"neha"));
		t.add(new student(99,20,"priya"));
		t.add(new student(12,80,"gagan"));
		t.add(new student(1,50,"ritu"));
		
   System.out.println(t);
	}

}


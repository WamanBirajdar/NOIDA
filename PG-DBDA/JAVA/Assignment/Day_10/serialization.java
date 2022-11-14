//example on serialization

package day10_cmdLine_annonumous_collection;

import java.io.*;

class studentData implements Serializable
{
String name;
int age;
studentData(String a,int b)
{
	name=a;
	age=b;
}
void display()
{System.out.println(name +"   "+ age);
}}

class Appendable extends ObjectOutputStream
{
    public Appendable(OutputStream out) throws IOException {		super(out);	}
	protected void writeStreamHeader() {}
	
}

 
public class StudentSerializationExample {

	public static void main(String[] args) {
		try {
		studentData d= new studentData("deepa",53);
		
		File f= new File("student.ser");
		if(f.length()<=0)
		{
		ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream("student.ser",true));
		o.writeObject(d);//-->writeStreamHeader
		
		}
		else
		{
			Appendable  o1= new Appendable(new FileOutputStream("student.ser",true));
			o1.writeObject(d);//-->writeStreamHeader
				
		}
		ObjectInputStream i= new ObjectInputStream(new FileInputStream("student.ser"));
		do
		{
		
			d= (studentData)i.readObject();
			d.display();
		}
		while(d!=null);
		
		}
		catch(Exception d) {}
		
	}

}
 

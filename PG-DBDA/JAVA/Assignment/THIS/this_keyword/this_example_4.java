// this keyword is also used to return current java instace

package this_keyword;
class Example{
	
	Example getStudent()
	{
		return this;
	}
	
	void disp()
	{
		System.out.println("calling disp() method");
	}
}
public class this_Example4 {

	public static void main(String[] args) {
		
		new Example().getStudent().disp();;
		
	}

}

/*
calling disp() method
*/

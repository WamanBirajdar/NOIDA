//used to pass current java instace as parameter
package this_keyword;

class employee{
	void salary()
	{
		System.out.println("inside salary method");
	}
	void bonus()
	{
		this.salary();
		System.out.println("inside bonus method");
	}
}
public class this_Example3 {

	public static void main(String[] args) {
		
		employee e=new employee();
		e.bonus();
	}

}

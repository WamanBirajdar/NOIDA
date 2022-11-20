// this keyword is reference variable that refers current object

package this_keyword;

class staff{
	
	void technical()
	{
		System.out.println(this);
	}
}

public class this_Example5 {

	public static void main(String[] args) {
		staff s=new staff();
		System.out.println(s);
		s.technical();

	}

}
/*

this_keyword.staff@12edcd21
this_keyword.staff@12edcd21

*/

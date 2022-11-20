// recursion mmethod factorial of given number
package MCQ;
class recursion 
{
    int func (int n) 
    {
        int result;
        if (n == 1)
            return 1;
        
        return n*func (n - 1);
    }
}
public class Q5_Recursion {

	public static void main(String[] args) {
		recursion r=new recursion();
		
		System.out.println(r.func(5));
		

	}

}
/// output>> 120

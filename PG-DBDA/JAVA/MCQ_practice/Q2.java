package MCQ;

public class Q2 {

	public static void main(String[] args) {
		String entries[]= {"entry1","entry2"};
		int count=0;
		while(entries[count++]!=null)
		{
			System.out.println(count);
		}
		System.out.println(count);
		

	}

}

/*
output
1
2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
	at MCQ_practice/MCQ.Q2.main(Q2.java:8)

*/
